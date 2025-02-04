import java.util.Scanner;

public class duplicate_array {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a =new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();

        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    System.out.println(a[i]+" is duplicate");
                }
            }
        }
    }
}
