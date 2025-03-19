/*

    if(num[i]>num[i-k] && num[i]>num[i+k]){
        sum+=num[i];
    }


    Leetcode : 3452

 */
package Arrays_1D;

public class Sum_Of_Good_Numbers {
    public static void main(String[] args) {
        int[]arr={1,3,2,1,5,4};
        //        0 1 2 3 4 5
        int k=2;

        int s=0;
        for(int i=0;i<arr.length;i++){
            if((i-k<0 || arr[i]>arr[i-k]) && (i+k>=arr.length || arr[i]>arr[i+k])){
                s+=arr[i];
            }
        }
        System.out.println(s);
    }
}
