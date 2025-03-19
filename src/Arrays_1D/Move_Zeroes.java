/*

    LeetCode : 283

 */

package Arrays_1D;

public class Move_Zeroes {
    public static void main(String[] args) {
        int[]a={1,0,1,0,3,12};
        for(int k :a){
            System.out.print(k+" ");
        }
        System.out.println();

        int n=a.length;

        int j=0;
        for(int i=0;i<n;i++){
            if(a[i]!=0){
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
                j++;
            }
        }


        for(int k :a){
            System.out.print(k+" ");
        }
    }
}
