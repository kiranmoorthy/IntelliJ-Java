import java.util.Scanner;

public class is_Symmetric_2Darray {
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
        int flag=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(a[i][j]!=a[j][i]){
                    flag=1;
                }
            }
        } 
        String str=(flag==0)?"Symmetric":"Asymmetric";
        System.out.print("Given matrix is "+str);
    }
}
