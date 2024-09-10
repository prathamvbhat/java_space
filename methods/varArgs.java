import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
        fun(1,2,3,4,5,6,7,8,9,10); // arguments can be passed as many we want, it can be zero of infinte.
    }


    // if we want to send mixed multiple arguments it is possible.
    static void multiple(int a, int b, String ...v){
        
    }

    static void fun(int ...a){ // So here if we dont know how many arguments we have to pass then  we can define it in this way so that it can take any number of arguments.
        System.out.println(Arrays.toString(a)); //  So this will print the array in the form of a string

    }
}
