package Bitwise;
import java.util.Scanner;
public class count_1s_inBinary {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int c=0;
        while(n>0){
            n=n&(n-1);
            c++;
        }
        System.out.println(c);
    }
}
