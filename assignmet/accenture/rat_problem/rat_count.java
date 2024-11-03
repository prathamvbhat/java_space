import java.util.*;

public class rat_count {
    

    public static void solve(int r, int unit, int n, int[] arr){
        //Check for the total food required by the rats;
        int total_food = r * unit;
        int count = 0;
        int sum = 0;
        System.out.println(total_food);

        if(arr == null){
            System.out.println("Not possible");
        }

        for(int i = 0; i < n; i++){
            sum += arr[i];
            count++;
            if(sum >= total_food)
                break;
        }
        if(sum < total_food)
            System.out.println("Insufficient food");
        
            
        System.out.println(count);
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input r: ");
        int r = sc.nextInt();
        System.out.println("Input unit: ");
        int unit = sc.nextInt();
        System.out.println("Input no of houses: ");
        int n = sc.nextInt();
        System.out.println("Input Houses: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        solve(r, unit, n, arr);
    }
}