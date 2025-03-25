/*
    maximum of minimum(s) of all subarrays in an array
*/
package Arrays_1D;

public class Min_Max_Riddle {
    public static void rid(int[]arr,int k){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=n-k;i++){
            int min=Integer.MAX_VALUE;
            for(int j=i;j<i+k;j++){
                min=Math.min(min,arr[j]);
            }
            max=Math.max(min,max);
        }
        System.out.print(max+" ");
    }
    public static void main(String[] args) {
        int[]arr={6,3,5,1,12};
        int n=arr.length;
        for(int k=1;k<=n;k++){
            rid(arr,k);
        }
    }
}
