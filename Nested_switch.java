import java.util.Scanner;

public class Nested_switch {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Employee ID: ");
       int empId = sc.nextInt();
       System.out.println("Enter the Department: ");
       String dept = sc.next();

    switch(empID){
        case 1:
            System.out.println("Pratham V Bhat");
            break;
        case 2:
            System.out.println("Omkar Bhat");
            break;
        case 3:
            System.out.println("Employee Number 3");
            switch(dept) {
                case "IT":
                    System.out.println("IT Departmant");
                    break;
                case "MG":
                    System.out.println("Management Department");
                    break;
                default:
                    System.out.println("Enter a valid Department");
            }
            break;
        default:
            System.out.println("Enter a valid Employee ID");
       }

    }
}
