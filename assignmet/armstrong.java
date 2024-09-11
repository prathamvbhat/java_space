import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        System.out.println(armstrong(num));

    }

    static int armstrong(int a){
        int init = a;
        int sum = 0; // initialize the sum variable
        while (a > 0) {
            int rem = a % 10;
            int cube = rem * rem * rem;
            sum += cube; // use the += operator to add cube to sum
            a = a/10;
        }

        if( init == sum){
            System.out.println("Its a Amstrong Number!!!"); 
        }
        else{
            System.out.println("Not a Armstrong Number!!!");
        }
        return sum;
    }
}
