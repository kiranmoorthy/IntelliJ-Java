package Bitwise;

import java.util.Scanner;

public class multiply_usingBit {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a= in.nextInt();
        int b= in.nextInt();
        int result=0;
        while(b>0){
            if((b&1)==1){
                result+=a;
            }
            a<<=1;
            b>>=1;

        }
        System.out.println(result);
    }
}
