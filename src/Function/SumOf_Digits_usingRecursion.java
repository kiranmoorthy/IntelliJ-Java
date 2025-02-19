package Function;

import java.util.Scanner;

public class SumOf_Digits_usingRecursion {
    public static long sod(long n){
        if(n==0){
            return 0;
        }
        return n%10 + sod(n/10);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Number : ");
        long n=in.nextLong();
        System.out.print("Sum of Digits is "+ sod(n));
    }
}
