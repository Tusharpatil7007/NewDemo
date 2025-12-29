import java.util.Scanner;

public class HappyNumber {
    public static void main(String x[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = sc.nextInt();
        if (isHappy(n)) {
            System.out.println("Number is Happy");
        }else{
            System.out.println("Number is not happy");
        }
    }
    public static int squareOfSum(int n){
        int sum = 0;
        while (n > 0) {
            int digit = n%10;
            sum += digit*digit;
            n /= 10;
        }
        return sum;
    }
    public static boolean isHappy(int n){
        int small = n; //7 
        int big = n; // 7
        do {
            small = squareOfSum(small); // 7 // 49
            big = squareOfSum(squareOfSum(big)); // 2401 
        } while (small != big);
        return small == 1;
    }
}
