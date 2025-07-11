package Bitwise;
import java.util.Scanner;

public class int_to_Binary{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Integer: ");
        int n=in.nextInt();
        var bin="";
        while(n>0){
            int rem=n%2;
            bin=rem+bin;
            n=n/2;
        }
        System.out.println("The Binary Value : "+(bin));




    }
}
