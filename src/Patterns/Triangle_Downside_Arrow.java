import java.util.Scanner;

public class Triangle_Downside_Arrow {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
