package Function;

import java.util.Scanner;

public class PowerOf_usingRecursion {
    public static int power(int base,int pow){
        if(pow ==0){
            return 1;
        }
        return base*power(base,pow-1);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Base : ");
        int base =in.nextInt();
        System.out.print("Power: ");
        int pow =in.nextInt();
        System.out.printf("%d ^ %d = %d",base,pow,power(base, pow));
    }
}
