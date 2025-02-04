import java.util.Scanner;

public class conv_UpperTriangle_Matrix {
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
        int[][]ut=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for (int j = 0; j < c; j++)
            {
                if (j>=i) {
                    ut[i][j] = a[i][j];
                }
                else
                {
                    ut[i][j] = 0;
                }
            }
        }
            for(int f=0;f<r;f++)
            {
                for(int j=0;j<c;j++)
                {
                    System.out.print(ut[f][j]+" ");
                }
                System.out.println();
            }
    }
}

