package Function;

import java.util.Scanner;

public class int_to_Binary {
    public static String Binary(int num,String bin){
        if(num==0){
            return bin;
        }
        bin=num%2+bin;
        return Binary(num/2,bin);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Integer: ");
        int n=in.nextInt();
        String bin="";
        System.out.println(Binary(n,bin));
    }
}
