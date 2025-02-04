import java.util.Scanner;

public class Profit_Or_Loss_Arrays {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number of fruits:");
        int n=in.nextInt();
        int[]wgt=new int[n];
        for(int i=0;i<n;i++){
            System.out.printf("Enter the weight of fruit %d in kg:",i+1);
            wgt[i]=in.nextInt();
        }
        int[] bprice =new int[n];
        for(int i=0;i<n;i++){
            System.out.printf("Enter the buying price of fruit %d in kg:",i+1);
            bprice[i]=in.nextInt();
        }
        int[]sprice=new int[n];
        for(int i=0;i<n;i++){
            System.out.printf("Enter the selling price of fruit %d in kg:",i+1);
            sprice[i]=in.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+((wgt[i]*sprice[i])-(wgt[i]* bprice[i]));
        }
        String str=(sum>0)?"Profit":"Loss";
        System.out.printf("%s of Rs.%d",str,sum);

    }
}
