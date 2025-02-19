package Numbers;

import java.util.Scanner;

public class Swap_2nums_withoutTemp {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=1;//in.nextInt();
        int b=2;//in.nextInt();
                    //a=( a ) b=( b )
        b=b+a;      //a=( a ) b=( a b )
        a=b-a;      //a=( b ) b=( a )
        b=b-a;


        System.out.println(a);
        System.out.println(b);

    }
}
