import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Fruit name: ");
        String fruit = sc.nextLine();

        switch(fruit){
            case "Mango": 
                System.out.println("King of Fruits");
                break;
            case "Apple":
                System.out.println("A sweet red  apple!");
                break;
        }
    }
}
