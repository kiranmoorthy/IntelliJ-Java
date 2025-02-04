/*

Check if a given number is power of 2 using Bit manipulation;

"Power of 2" refers to the Binary value of 2^(power n)s;
    10=bin(2^1)
    100=bin(2^2)
    1000=bin(2^3)

 */


import java.util.Scanner;

public class Binary_Problem_2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a Binary Number : ");
        int n=in.nextInt();
        if(n%10!=0 && n%10!=1){
            System.out.println("Error : Invalid Input!!!");
            return;
        }
        if((n & (n-1))==0){
            System.out.println("Yes,Given number"+n+"is the power of 2");
        }
        else{
            System.out.println("No,Given number "+n+" is not the power of 2");
        }


    }
}
