package Numbers;
import java.util.*;

/*

    6 9 4 2
     3 5 2
      2 3

 */

public class Reduced_Subtracted_Form {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(); // 6942


        while(n>99){
            int l=(int)Math.log10(n);

            int t=0;
            for(int i=l;i>=1;i--){

                int a=(n/(int)Math.pow(10,i)) % 10;
                int b=(n/(int)Math.pow(10,i-1)) % 10;

                t=t*10+ Math.abs(a-b);
            }
            n=t;

        }
        System.out.println(n);
    }

}
