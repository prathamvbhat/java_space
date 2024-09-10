public class scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(a + " " + b);

        // System.out.println(marks); // This wont be executed as there is no scope for marks.
        // values initialized in a method can only be accessed within that method.

        {
            // int a = 30; // already initialized outside the block. Cannot reinitialize it.
            int c = 30;
            // variable initialized within the block can be accessed only in that block.
        }
        // System.out.println(c); // c values cannot be accesed as its writen in the above block.
    }

    static void random(){
        int marks = 70;
        System.out.println(marks);
    }
}
