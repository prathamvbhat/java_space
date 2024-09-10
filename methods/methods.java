
import java.util.Arrays;
import java.util.Scanner;
public class methods {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter 1st Number: ");
        // int num1 = sc.nextInt();
        // System.out.println("Enter 2nd Number: ");
        // int num2 = sc.nextInt();
        // int ans = sum2(num1, num2);
        // sum2(num1, num2);
        // System.out.println("The sum is: "+ans);

        //Passing Example
        // swap(num1, num2);

        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(arr));
        changeValue(arr);
        System.out.println(Arrays.toString(arr));
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

    // static int sum2(){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter 1st Number: ");
    //     int num1 = sc.nextInt();
    //     System.out.println("Enter 2nd Number: ");
    //     int num2 = sc.nextInt();
    //     int sum = num1 + num2;
    //     return sum;
    // }

    //pass the value of the numbers while calling thr function and return the value
    // static int sum2(int num1, int num2){
    //     int sum = num1 + num2;
    //     return sum;
    // }

    //OR pass the value of the numbers while calling the function and print the value

    // static void sum2(int num1, int num2){
    //     int sum = num1 + num2;
    //     System.out.println("Sum of two numbers: "+sum);
    // }


    //Pass by value
    // static void swap(int num1, int num2){
    //     int a = num1;
    //      num1 = num2;
    //     num2 = a;
    // }

    static void changeValue(int[] nums){
        nums[0] = 99;
    }

}
