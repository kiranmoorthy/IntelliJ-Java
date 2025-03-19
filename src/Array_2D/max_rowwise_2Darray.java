package Array_2D;

import java.util.Scanner;
public class max_rowwise_2Darray {
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

        for(int i=0;i<r;i++)
        {
            int m=a[i][0];
            for(int j=0;j<c;j++)
            {
                if(a[i][j]>m)
                {
                    m=a[i][j];
                }
            }
            System.out.println("Maximum value in row "+(i+1)+" is "+ m);
        }


    }
}
