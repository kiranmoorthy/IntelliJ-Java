package Bitwise;

import java.util.Scanner;

public class addition_usingBit {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        while(b!=0){
            int c=a&b;
            a=a^b;
            b=c<<1;
        }
        System.out.println(a);
    }
}
