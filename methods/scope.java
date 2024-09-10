public class scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(a + " " + b);

        // System.out.println(marks); // This wont be executed as there is no scope for marks.
        // values initialized in a method can only be accessed within that method.

        {
            // int a = 30; // already initialized outside the block. Cannot reinitialize it.
            a= 100; // resign the original ref values to some other value.
            System.out.println(a);
            
            int c = 30;
            // variable initialized within the block can be accessed only in that block.
        }
        // System.out.println(c); // c values cannot be accesed as its writen in the above block.
        System.out.println(a);

        int c = 900; // this variable can be reinitialized as it does not know that a c has been initialized indie a particula block.

        //scope for for loop
        for(int i = 0; i < 4; i++){
            System.out.println(i);
            a = 10000;
        }

        System.out.println(a); // a value is changed in the for loop. So the value of a will be 10000.
        System.out.println(i); // this will not be executed as it does not know what is i. So scope of i will only remain in the loop, not outside the loop.
    }

    static void random(){
        int marks = 70;
        System.out.println(marks);
    }
}
