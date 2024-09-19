import java.util.Scanner;
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int[] nums = new int[n];
        int target = in.nextInt();

        for(int i = 0; i < nums.length; i++){
            nums[i] = in.nextInt();
        }

        int[] result = twoSum(nums, target);
        System.out.print("[" + result[0] + "," + result[1] + "]");
    }
}
