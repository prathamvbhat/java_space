import java.util.Scanner;

public class calc_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the Operaor (+, -, *, /):");
        char op = sc.next().charAt(0);

        if(op == '+'){
            int add = num1 + num2;
            System.out.println(num1 + "" + op +"" + num2 + "=" + add);
        }
        else if(op == '-'){
            int sub = num1 - num2;
            System.out.println(num1 + "" + op +"" + num2 + "=" + sub);
        }
        else if(op == '*'){
            int mul = num1 * num2;
            System.out.println(num1 + "" + op +"" + num2 + "=" + mul);
        }
        else if(op == '/'){
            if(num2 == 0){
                System.out.println("Error: Divide by Zero");
            }
            else{
                int div = num1 + num2;
                System.out.println(num1 + "" + op +"" + num2 + "=" + div);
            }
        }
    }
}
