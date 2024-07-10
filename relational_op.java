import java.util.Scanner;

public class relational_op {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Number 2: ");
        int num2 = sc.nextInt();

        System.out.println("In Java there are 6 types of Operators.");
        //Equals to
        System.out.println("Number one ("+num1+") is Equal to Number two ("+num2+")               : "+(num1 == num2));
        //Not Equals to
        System.out.println("Number one ("+num1+") is Not Equal to Number two ("+num2+")           : "+(num1 != num2));
        //Greater Than
        System.out.println("Number one ("+num1+") is Greater than Number two ("+num2+")           : "+(num1 > num2));
        // Less than
        System.out.println("Number one ("+num1+") is Less than Number two ("+num2+")              : "+(num1 < num2));
        // Greater than or Equal Two
        System.out.println("Number one ("+num1+") is Greater than Equal to Number two ("+num2+")  : "+(num1 >= num2));
        // Less than or Equal Two
        System.out.println("Number one ("+num1+") is Less than Equal to Number two ("+num2+")     : "+(num1 <= num2));
    }
}
