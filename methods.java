
import java.util.Scanner;
public class methods {
    public static void main(String[] args) {
        int ans = sum2();
        System.out.println("The sum is: "+ans);
    }

    // static void sum(){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter 1st Number: ");
    //     int num1 = sc.nextInt();
    //     System.out.println("Enter 2nd Number: ");
    //     int num2 = sc.nextInt();
    //     int sum = num1 + num2;
    //     System.out.println("Sum of two numbers: "+sum);
    // }
    // OR

    static int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        return sum;
    }
}
