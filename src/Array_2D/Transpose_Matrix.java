/*

    LeetCode : 867

*/

package Array_2D;

import java.util.Scanner;

public class Transpose_Matrix {
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

        // Transposing the array
        int[][]t=new int[c][r];
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<r;j++)
            {
                t[i][j]=a[j][i];
            }
        }

        // Printing the array
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<r;j++)
            {
                System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }
    }
}
