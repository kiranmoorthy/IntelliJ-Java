package Function;

import java.util.Scanner;

public class Factorial_usingRecursion {
    public static int fact(int a){
        if(a==0) {
            return 1;
        }
        return a*fact(a-1);
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int a=in.nextInt();
        System.out.print("The Factorial is "+fact(a));
    }
}
