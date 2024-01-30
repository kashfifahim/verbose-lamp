public class HelloNumbers {
    
    public static int larger(int x, int y) {
        /** Returns the larger of x and y */
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }
    
    
    public static void main(String[] args) {
        int x = 0;
        while (x < 10) {
            System.out.println(x);
            x += 1;
        }

        System.out.println(larger(5, 3));
        System.out.println(larger(3, 1));
        System.out.println(larger(1,1));
    }
}

/*
 * before a variable can be used it must be declared
 * 
 * 1. Before Java variables can be used,
 * they must be declared.
 * 2. Java variables must have a specific type
 * 3. Java variable types can never change
 * 4. Types are verified before the code even runs
 * 
 * public static type function(type x, type y)
 * 
 * 1. functions must be declared as part of a class
 * 2. function that is part of a class is called a method
 * all functions in java are methods
 * 
 * to define a function in java, public static
 * 
 * all parameters of a function must have a declared type
 * the return value of the function must have a declared type 
 * function in java return only one value 
 */