import java.io.PrintStream;
import java.util.Calendar;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1  : ArithmeticException");
            System.out.println("2 : NullPointerException");
            System.out.println("3 : NumberFormatException");
            System.out.println("4: ArrayIndexOutOFBoundsException");
            System.out.println("5 : ClasssNotFoundException");
            System.out.println("Enter your choice : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    try {
                        int result = 9 / 0;
                        System.out.println(result);
                    } catch (Exception e) {
                        System.out.println("Error is : " + e);
                    }
                    break;
                case 2:
                    try {
                        String str = null;
                        System.out.println(str.length());
                    } catch (Exception e) {
                        System.out.println("Error is : " + e);
                    }
                    break;
                case 3:
                    try {
                        String s = "123 ";
                    System.out.println(Integer.parseInt(s));
                    } catch (Exception e) {
                        System.out.println("Error is : "+e);
                    }
                    break;
                case 4:
                    try {
                        int a[] = new int[3];
                    int result = a[4];
                    System.out.println(result);
                    } catch (Exception e) {
                       System.out.println("Error is : "+e);
                    }
                    break;
                case 5:
                    System.out.println("Erros is : "+" ClassNotFoundException ------------:");
                    break;
                default:
                    System.out.println("Wrong choice : ");
                    break;
            }
        } while (true);
    }
}
