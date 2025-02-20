/*
    LeetCode : 88

    a1= 1,2,3,0,0,0
    a2=4,0,1

    output = 0,1,1,2,3,4
 */
package Arrays;

import java.util.*;

public class Arrays_concat_2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[]nums1={1,2,3,0,0,0};
        int m=3;
        int[]nums2={2,5,6};
        int n=3;

        for(int i=m;i<nums1.length;i++){
            nums1[i]=nums2[i-m];
        }

        Arrays.sort(nums1);

        for(int i:nums1){
            System.out.print(i+" ");
        }


    }
}
