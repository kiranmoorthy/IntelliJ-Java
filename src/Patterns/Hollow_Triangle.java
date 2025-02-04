import java.util.Scanner;

public class Hollow_Triangle
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            for (int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }

            for(int j=1;j<=i*2-1;j++) {
                if (i == n || j == 1 || j == i * 2 - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
