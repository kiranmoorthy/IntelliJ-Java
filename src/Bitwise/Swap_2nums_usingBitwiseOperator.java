package Bitwise;

import java.util.Scanner;

public class Swap_2nums_usingBitwiseOperator{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b =in.nextInt();
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a);
        System.out.println(b);


    }
}
