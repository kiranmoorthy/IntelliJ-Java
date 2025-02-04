import java.util.Scanner;

public class insert_array {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a =new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();

        }
        int p=in.nextInt();
        int e=in.nextInt();

       int j=0;
       while(j<n)
       {
           if(j==p-1)
           {
               System.out.printf("%d %d ",e,a[j]);
           }
           else {
               System.out.print(a[j]+" ");
           }
           j++;

       }
    }
}
