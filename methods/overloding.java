public class overloding {
    public static void main(String[] args) {
        // fun(67);
        // fun("Pratham V Bhat");

        // Function orverloading is basically when we have same method name but with different arguments, arguments can avry in lenght or it can be different types.
        // Lets see in VarArgs
        //Now we give interger as an argument
        demo(1,2,3,4,5,6,7,8,9); // it will print all the provided numers as an array [1,2,3,4,5,6,7,8,9,10]
        demo("Pratham", "Omkar", "Joywing"); // it will print all the string provided as an array ["Pratham", "Omkar", "Joywing"]
        // demo(); // this call will fiail as the program dosent know what to call because of ambiguity in case of VarArgs.


    }


    static void demo(int ...a){
        System.out.println(Arrays.toString(a));
    }

    static void demo(String ...a){
        System.out.println(Arrays.toString(a));
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }
}
