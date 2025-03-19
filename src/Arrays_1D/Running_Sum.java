/*
    Leetcode : 1480
 */
package Arrays_1D;

public class Running_Sum {
    public static void main(String[] args) {
        int[]arr={1,2,3,4};

            int s=0;
            for(int i = 0; i <arr.length; i++){
                s+=arr[i];
                arr[i]=s;
            }



        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
