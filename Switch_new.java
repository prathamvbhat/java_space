import java.util.Scanner;

public class Switch_new {
   public static void main(String[] args) {
        // System.out.println("Eter the Fruit name: ");
        Scanner sc = new Scanner(System.in);
        // String fruit = sc.nextLine();

        // switch(fruit){
        //     case "mango" -> System.out.println("King of Fruits");
        //     case "Appel" -> System.out.println("Red Sweet Apple");
        //     default -> System.out.println("Enter a valid Fruit!!");
        // }

        System.out.println("Enter the day number: ");
        int day = sc.nextInt();

        switch(day){
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
        }
   } 
}
