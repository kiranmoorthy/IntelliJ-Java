package Numbers;

import java.util.Scanner;

public class Armstrong_Number {


    public static boolean is_Armstrong(int n){
        int c=0;
        for(int i=n;i>0;i/=10){
            c++;
        }
        int s=0;
        int t=n;
        while(t>0){
            int rem=t%10;
            s=s+(int)Math.pow(rem,c);
            t=t/10;
        }
        return n==s;
    }


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(is_Armstrong(n)){
            System.out.println("It is Armstrong");
        }
        else{
            System.out.println("It is not armstrong");
        }

    }
}
