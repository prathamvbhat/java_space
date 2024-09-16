import java.util.Arrays;
import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        // Why we need arrays?
        // Q. store a roll number
        // int a  = 19;

        // Q. store a name?
        // String b = "Pratham V Bhat";

        //Q. Store 5 roll number?
        // int c = 1;
        // int d = 2;
        //and so on....

        //So arrays are collection of similar type of data.
        /*syntax:
            datatype[] variable_name = new datatype[size];
        */

        // Store 5 roll numbers
        // int[] roll_no = new int[5];

        // write directly
        // int[] roll_no1  = {1, 2, 3, 4, 5};

        //1. the datatype written represents the type of data stored inside the array. So we cannot change the datattype after some elemets.
        //2. All the type of data in the array should be same. Cannot mismatch the datatype.
        
        //Breakdown of array
        // int[] ros; // declaration of array and ros is getting defined in the stack.
        // ros = new int[5]; // Here object is being created in the heap.

        // Array of premitives

        // int[] num = new int[5];
        Scanner sc = new Scanner(System.in);

        // for( int i = 0; i < num.length; i++){
        //     num[i] = sc.nextInt();
        // }
        // for( int i = 0; i < num.length; i++){
        //     System.out.println(num[i] + " ");
        // }

        //enhanced for loop for arrays:
        // for(int a : num){
        //     System.out.println(a);
        // }

        // System.out.println(num[5]); // Array outofBout of index; error

        //Array of Objects

        String[] str = new String[5];
        for(int i = 0; i < str.length; i++){
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));

        str[1] = "Pratham";
        System.out.println(Arrays.toString(str));
    }
}
