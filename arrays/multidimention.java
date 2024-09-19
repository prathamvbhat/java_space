import java.util.Arrays;
import java.util.Scanner;

public class multidimention {
    public static void main(String[] args) {
        /*
         * Print the multidimentional array
         *  1 2 3
         *  4 5 6
         *  7 8 9
         */

        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[3][3];
        System.out.println("Enter the numbers: ");

        for(int row = 0; row < arr.length; row++){
            // here we take every row
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = sc.nextInt();
            }
        }
        // Output
        //there are quite a few methods to output the array
        //1. is using simple for loops
        System.out.println("Method one of output:");
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
        //2. make use of Arrays.toString() function
        System.out.println("Method 2 of output:");
        for(int row = 0; row < arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }
        System.out.println();
        
        //3. enhanced for loop with arrays.tostring()
        System.out.println("Method 3 of output: ");
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
