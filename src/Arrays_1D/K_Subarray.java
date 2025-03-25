/*
    Return the count of sub-arrays whose sum is divisible by k
*/
package Arrays_1D;

public class K_Subarray {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,1};
        int k=3;
        int n=arr.length;
        int c=0;
        for(int w=0;w<n;w++){
            int s=0;
            for(int i=0;i<n;i++){
                s+=arr[i];
                if(i>=w) {
                    //System.out.print(s+" ");
                    if(s%k==0)c++;
                    s-=arr[i-w];

                }
            }
        }
        System.out.println(c);
    }
}
