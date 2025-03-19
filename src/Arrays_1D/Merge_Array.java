/*
    LeetCode : 88
 */
package Arrays_1D;

public class Merge_Array {
    public static void main(String[] args) {
        int[]a={1,3,0};
        int m=2;
        int[]b={2};
        int n=1;

        int i=m-1;
        int j=n-1;
        int k =m+n-1;

        while(j>=0){
            if(i>=0 && a[i]>b[j]){
                a[k--]=a[i--];
            }
            else{
                a[k--]=b[j--];
            }
        }





        for(int z:a){
            System.out.print(z+" ");
        }
    }
}
