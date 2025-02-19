package Function;

import java.util.Scanner;

public class ReversalOf_Number_usingRecursion {
    public static int reverse(int n,int rev){
        if(n==0){
            return rev;
        }
        rev=rev*10+(n%10);
        return reverse(n/10,rev);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a=in.nextInt();
        int rev=0;
        System.out.print("The Reversal of number is : "+reverse(a,rev));
    }
}
