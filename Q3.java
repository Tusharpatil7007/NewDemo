import java.lang.reflect.Array;
import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        int a[] = {8, 58, 71, 18, 31, 32, 63, 92, 43, 3, 91, 93, 25, 80, 28};
        int result[] = new int[15];
        int small = a[0];
        for(int i=0;i<a.length;i++){
            if (a[i]  < small) {
                small = a[i];
                result[i] = small;
            }else{
                result[i] = -1;
            }
            small = a[0+i];
        }
        System.out.println(Arrays.toString(result));
    }
}
