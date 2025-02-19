package Function;

import java.util.Scanner;

public class IntegerCount_usingRecursion {
    public static int count(long n){
        if(n==0){
            return 0;
        }
        return 1+count(n/10);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Number : ");
        long n=in.nextLong();
        System.out.print("Integer Count is "+count(n));
    }
}
