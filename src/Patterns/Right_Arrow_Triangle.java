import java.util.Scanner;

public class Right_Arrow_Triangle
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++) {
            for (int j=0;j<i+1;j++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }
        for(int i=1;i<=n;i++) {
            for (int j = n; j > i; j--)
            {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
