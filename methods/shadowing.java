public class shadowing {
    static int x = 90;
    public static void main(String[] args) {
        System.out.println(x); // this will print 90
        int x = 40;
        System.out.println(x); // here the values of x will be overrided by the local variable x. So it will print out 40; Local variable is shawoding global variable.
        fun();
    }

    static void fun(){
        System.out.println(x); // this will print 90 as the scope of the x is in the main method so it will take the global vlaue of x
    }
}
