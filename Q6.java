class EvenThread extends Thread{
    void calSum(){
        int sum = 0;
        try {
            for(int i=1;i<=10;i++){
                if (i%2== 0) {
                    sum += i;
                }
            }
            System.out.println("Sum is : "+sum);
        } catch (Exception e) {
            System.out.println("Error is"+e);
        }
    }
}
class OddThread extends Thread{
    void calProduct(){
        int product = 1;
        try {
            for(int i=1;i<=10;i++){
                if (i%2 != 0) {
                    product *= i;;
                }
            }
            System.out.println("Product is :"+product);
        } catch (Exception e) {
            System.out.println("Error is"+e);
        }
    }
}
public class Q6 {
    public static void main(String[] args) throws InterruptedException {
        EvenThread even = new EvenThread();
        even.calSum();
        even.join();
    }
}
