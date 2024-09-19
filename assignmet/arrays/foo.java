import java.util.Scanner;
import java.util.Arrays;

public class foo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        System.out.println("Enter 5 numbers:");
        for(int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Array before Change:");
        System.out.println(Arrays.toString(nums));
        System.out.println("Array after Change:");
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        for(int i = 0; i < arr.lenght; i++){
            if(arr[i] % 3 == 0 && arr[i] % 5 == 0){
                arr[i] = "FooBoo";
            }
            else if(arr[i] % 5 == 0){
                arr[i] = "Boo";
            }
            else if(arr[i] % 3 == 0){
                arr[i] = "Foo";
            }
            else
                arr[i] = arr[i];
        }
    }
}
