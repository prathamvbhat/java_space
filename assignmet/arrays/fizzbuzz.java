import java.util.ArrayList;
import java.util.Scanner;

public class fizzbuzz {

    public static ArrayList<String> Change(int n){
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 1; i < n; ++i) {
            if (i % 3 == 0 && i % 5 == 0){
                arr.add("fizzBuzz");
            }
            else if(i % 5 == 0){
                arr.add("Buzz");
            }
            else if(i % 3 == 0){
                arr.add("Fizz");
            }
            else
                arr.add(Integer.toString(i));
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //input of numbers
        System.out.println("Enter the number of elements: ");
        int n = in.nextInt();
        System.out.println();
        ArrayList<String> arr = Change(n);

        //output
        for(String a : arr){
            System.out.print(a + " ");
        }
    }
}
