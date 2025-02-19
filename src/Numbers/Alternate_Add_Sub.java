/*
    INPUT:  111
          1 + (-1) + 1

      INPUT:  123
          1 + (-2) + 3

 */

package Numbers;

import java.util.Scanner;

public class Alternate_Add_Sub {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int s=String.valueOf(n).length();
        int[]arr=new int[s];

        int i=0;
        while(n>0){
            int r=n%10;
            arr[i]=r;
            i++;
            n/=10;
        }

        int es=0;
        int os=0;
        for(int j = 0; j<s; j++){
            if(j%2==0)
                es+=arr[j];
            else
                os+=arr[j];
        }

        System.out.println(es-os);

    }
}
