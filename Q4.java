public class Q4 {
    public static void main(String[] args) {
        int a[] = {10,20,15,2,23,90,67};
        System.out.print("20 ");
        for(int i=0;i<a.length;i++){
            if (a[i] == findPeak(a)) {
                System.out.print(a[i]);
            }
        }
    }
    static int findPeak(int a[]){
        int left = 0;
        int right = a.length-1;
        while (left < right) {
            int mid = left+(right-left)/2;
            if (a[mid] < a[mid+1]) {
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return a[left];
    }
}