package Arrays;

import java.util.Scanner;

public class sum_OfColumn_Values_in2DArray {
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
        for(int i=0;i<c;i++)
        {
            int sum=0;
            for(int j=0;j<r;j++)
            {
                sum=sum+a[j][i];
            }
            System.out.println("Sum is "+sum);
        }
    }
}
