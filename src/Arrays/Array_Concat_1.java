/*
    Leetcode : 1929



 */
package Arrays;

import java.util.*;

public class Array_Concat_1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Size : ");
        int size =in.nextInt();
        int[]arr=new int[size];
        System.out.println("Enter the elements : ");
        for(int i = 0; i< size; i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the no. of concats : ");
        int n=in.nextInt();
        int[]narr=new int[size*n];
        for(int i=0;i<size*n;i++){
            narr[i]=arr[i%size];
        }

        for(int i:narr){
            System.out.print(i+" ");
        }
    }
}
