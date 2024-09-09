
import java.util.Scanner;
public class methods {
    public static void main(String[] args) {
        sum();
    }

    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of two numbers: "+sum);
    }
}
