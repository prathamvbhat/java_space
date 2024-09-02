import java.util.Scanner;

public class Switch_new {
   public static void main(String[] args) {
        System.out.println("Eter the Fruit name: ");
        Scanner sc = new Scanner(System.in);
        String fruit = sc.nextLine();

        switch(fruit){
            case "mango" -> System.out.println("King of Fruits");
            case "Appel" -> System.out.println("Red Sweet Apple");
            default -> System.out.println("Enter a valid Fruit!!");
        }
   } 
}
