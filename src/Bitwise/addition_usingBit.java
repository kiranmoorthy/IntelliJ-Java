package Bitwise;

public class addition_usingBit {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        while(b!=0){
            int c=a&b;
            a=a^b;
            b=c<<1;
        }
        System.out.println(a);
    }
}
