public class operator {
    public static void main(String[] args) {
        int number = 12;

        System.out.println("Number is: "+(number += 5));
        System.out.println("Number is: "+(number -= 5));
        System.out.println("Number is: "+(number *= 5));
        System.out.println("Number is: "+(number /= 5));
        System.out.println("Number is: "+(number %= 5));
    }
}
