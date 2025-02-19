package Function;

import java.util.Scanner;

public class SumOf_NaturalNumbers_usingRecursion {
    public static int sum(int a){
        if(a==0){
            return a;
        }
        return a+sum(a-1);
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int a=in.nextInt();
        System.out.print("The Sum is "+sum(a));
    }
}
