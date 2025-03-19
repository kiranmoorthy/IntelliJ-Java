/*
    Kadane's Algorithm :
        For every progressive sum of an array, if sum is negative, then put sum as 0.

    sum=0;
    max=INT.min;
    for(i in array)
        sum+=i;
        max=max(sum,max);
        if(sum<0)
            sum=0;

 */
package Arrays_1D;

import java.util.Arrays;

public class Max_Subarray_Sum {
    public static void main(String[] args) {
        int[]a={1,2,-3,-5,4,-1,2,-3,5};
        int k=3;

        int n=a.length;
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=n-k;i++){
            sum+=a[i];

            if(i>=k){
                sum-=a[i-k];
            }
            System.out.print(sum+" ");

            if(sum>max)max=sum;
            if(sum<0)sum=0;

        }
        //System.out.println(max);

    }
}
