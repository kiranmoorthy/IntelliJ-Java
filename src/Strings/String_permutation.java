package Strings;

import java.util.List;

public class String_permutation {
    public static void main(String[] args) {
        String s="cat";

        //perm("",s);
        //permutate(s.toCharArray(),0);
        //permute(s.toCharArray(),s.length());
        // gdb/e4xJUQW
    }

    // uses Recursive(substring)
    public static void perm(String p,String s) {
        int n=s.length();
        if(n==0){
            System.out.print(p+" ");
        }
        else{
            for(int i=0;i<n;i++){ // 0 1 2    c a t

                perm(p+s.charAt(i) ,s.substring(0,i)+s.substring(i+1));


                /*
                    "" "cat"
                    0 1 2.
                    c a t

                    c at
                            ca t
                                cat
                            ct a
                                cta
                    a ct
                            ac t
                                act
                            at c
                                atc
                    t ca
                            tc a
                                tca
                            ta c
                                tac
                 */

            }
        }
    }


    // uses Swap-based Recursion
    public static void permutate(char[] arr,int fi){
        if(fi==arr.length){
            System.out.println(arr);
            return;
        }
        for(int i=fi;i<arr.length;i++){
            swap(arr,i,fi);
            permutate(arr,fi+1);
            swap(arr,i,fi);
        }
    }
    static void swap(char[] arr,int i,int fi){
        char temp=arr[i];
        arr[i]=arr[fi];
        arr[fi]=temp;
    }


    // uses Heap's Algorithm
    public static void permute(char[]arr,int n){
        if(n==1){
            System.out.println(new String(arr));
            return;
        }

        for(int i=0;i<n;i++){
            permute(arr,n-1);

            swaps(arr, (n%2==0)?i:0 ,n-1);
        }
    }
    static void swaps(char[]arr,int i,int j){
        char t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }

}
