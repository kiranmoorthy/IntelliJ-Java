/*

Generate Integer 1 to N using BIT manipulation;

*/


import java.util.Scanner;


public class Binary_problem_1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int n=in.nextInt();
        int i=0;
        while(i<=n){
            if(i%2==0){
                System.out.print(i+" ");
                i=i | 1;        //Adds 1 if it's even
            }
            else{
                System.out.print(i+" ");
                i=i + 1;        //Adds 1 if it's odd
            }
        }


    }
}
