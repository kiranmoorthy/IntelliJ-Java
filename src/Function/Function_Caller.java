package Function;

import java.util.function.Function;

public class Function_Caller {
    public static void main(String[] args) {
        var result = executeFunction(Function_Caller::concat, "Hello", " World");
        System.out.println(result); // Output: Hello World
    }

    // Function that concatenates two strings
    public static String concat(Object... args) {
        return args[0].toString() + args[1].toString();
    }

    // Generic method to execute functions
    public static <T> T executeFunction(Function<Object[], T> func, Object... args) {
        return func.apply(args); // Calls the function
    }
}
