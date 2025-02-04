import java.util.Scanner;

public class Kaprekar {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int s=n*n;
        int c=0;
        for(int i=s;i>0;i=i/10)
        {
            c++;
        }
        int b;
        if(c%2==0)
        {
            b=c/2;
        }
        else
        {
            b=c/2+1;
        }
        int r1=s/(int)Math.pow(10,b);
        int r2=s%(int)Math.pow(10,b);
        int r3=r1+r2;
        System.out.println(s);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        if(n==r3)
        {
            System.out.println("Correct");
        }
        else
        {
            System.out.println("Incorrect");
        }

    }
}
