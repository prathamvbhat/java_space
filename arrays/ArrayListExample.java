import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        /*
         * Syntax of ArrayList:
         * ArrayList<Datatype> variable_name = new ArrayList<>();
         */
        ArrayList<Integer> list = new ArrayList<>(10);
        //add elements to the list
        list.add(20);
        list.add(200);
        list.add(650);
        list.add(300);

        //print the list
        System.out.println("bEFORE UPDATE:");
        System.out.println(list);
        //update the list
        list.set(0, 99);
        System.out.println("AFTER UPDATE:");
        System.out.println(list);
        //remove a element from the list
        list.remove(1);
        System.out.println("AFTER REMOVAL:");
        System.out.println(list);
        //check if a element is a part of the list:
        System.out.println("Does list contains 200? : " + list.contains(200));// will return false
        System.out.println("Does list contains 99? : " + list.contains(99)); // will return true
    }
}
