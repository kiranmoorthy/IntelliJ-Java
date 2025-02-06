package Bitwise;
import java.util.Scanner;
public class Binary_to_int {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Binary : ");
        int n=in.nextInt();
        int sum=0;
        int i=0;
        var f=0;
        while(n>0){
            int rem=n%10;
            if(rem>1){
                f=1;
                break;
            }
            sum=sum+(rem*(int)(Math.pow(2,i)));
            n=n/10;
            i++;
        }
        if(f==1){
            System.out.println("Invalid Input!!!");
        }
        else {
            System.out.println("The Integer Value: " + sum);
        }
    }
}
