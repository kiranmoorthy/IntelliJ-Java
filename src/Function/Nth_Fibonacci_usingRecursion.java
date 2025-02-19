package Function;

import java.util.Scanner;

public class Nth_Fibonacci_usingRecursion {
    public static int fib(int a){
        if(a<=1)
            return a;
        return fib(a-1)+fib(a-2);
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int a=in.nextInt();
        System.out.printf("The Fibonacci number in %d position is %d",a,fib(a-1));
    }
}
