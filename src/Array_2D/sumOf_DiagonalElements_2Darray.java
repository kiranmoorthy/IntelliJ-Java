package Array_2D;

import java.util.Scanner;

public class sumOf_DiagonalElements_2Darray {
    public static void main (String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the row:");
        int r=in.nextInt();
        System.out.println("Enter the column:");
        int c=in.nextInt();
        int[][]a=new int[r][c];
        System.out.println("Enter the elements:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(i==j || i+j==r-1){
                    sum=sum+a[i][j];
                }
            }
        }
        System.out.println("Sum is "+sum);

    }
}
