import java.util.Scanner;

public class conversion {
    public static void main(String[] args){
        // int num1 = 5;
        // double num2 = num1;
        // System.out.println("num2: " +num2);

        // Operators
        // int num1 = 12;
        // int num2 = 6;
        int num1, num2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number 1: ");
        num1 = scanner.nextInt();

        System.out.println("Enter Number 2: ");
        num2 = scanner.nextInt();

        //addition
        System.out.println(num1 + num2);
        //substraction
        System.out.println(num1 - num2);
        //multiplication
        System.out.println(num1 * num2);
        //division
        System.out.println(num1 / num2);
        //modulo
        System.out.println(num1 % num2);
    }


}
