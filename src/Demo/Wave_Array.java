package Demo;

import java.util.Scanner;

public class Wave_Array {
    public static boolean isWave(int[]arr){
        int n=arr.length;

        if(n<2){
            return true;
        }
        if(n==2){
            return arr[0] != arr[1];
        }

        int i=1;
        boolean inc;
        inc = arr[i]>arr[i-1];


        while(i<n){
            if(arr[i]==arr[i-1]){
                return false;
            }
            if(!inc){
                if(arr[i]<arr[i-1]){
                    inc=true;
                }
                else{
                    return false;
                }
            }
            if(inc){
                if(arr[i]>arr[i-1]){
                    return false;
                }
                else{
                    inc=false;
                }
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int n=in.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        System.out.println(isWave(arr));

    }
}
