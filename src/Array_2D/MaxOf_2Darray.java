package Array_2D;

import java.util.Scanner;
public class MaxOf_2Darray{
    public static void main (String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the row:");
        int r=in.nextInt();
        System.out.println("Enter the column:");
        int c=in.nextInt();
        int a[][]=new int[r][c];
        System.out.println("Enter the elements:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        int max =a[0][0];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(a[i][j]> max)
                {
                    max =a[i][j];
                }
            }
        }
        System.out.println("Maximum value in is "+ max);


    }
}
