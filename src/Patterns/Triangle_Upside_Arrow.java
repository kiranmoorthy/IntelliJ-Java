import java.util.Scanner;

public class Triangle_Upside_Arrow {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();//               4
        for(int i=0;i<n;i++)//              0 1 2 3
        {
            for(int j=n-1;j>i-1;j--)
            {
                System.out.print("  ");
            }
            for(int j=0;j<=2*i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
