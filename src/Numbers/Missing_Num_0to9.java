package Numbers;

import java.util.Scanner;

public class Missing_Num_0to9 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[]arr=new int[10];

        arr[0]=1;

        while(n>0){
            int rem=n%10;
            arr[rem]=rem;
            n/=10;
        }

        for(int i=0;i<10;i++){
            if(i==arr[i]){
                //System.out.print(i+" ");
            }
            else{
                System.out.print(i+" ");
            }
        }

    }
}
