/*



    Leetcode : 2206

 */
package Arrays;

import java.util.*;

public class Divide_Array_Into_Equal_Pairs {

    public static boolean isPair(int[]arr){
        if(arr.length%2!=0){
            return false;
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i+=2){
            if(arr[i]!=arr[i+1]){
                return false;
            }
        }
        return true;


    }
    public static void main(String[] args) {
        int[]arr={3,2,3,2,2,2};

        if(isPair(arr)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
