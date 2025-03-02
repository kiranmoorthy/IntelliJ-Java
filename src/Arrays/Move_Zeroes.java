/*

 */

package Arrays;

public class Move_Zeroes {
    public static void main(String[] args) {
        int[]a={0,1,0,3,12};
        for(int k :a){
            System.out.print(k+" ");
        }
        System.out.println();

        int i=0;
        int j=0;
        int n=a.length-1;
        while(i<n &&j<n){
            while(i<n &&j<n && a[i]!=0){
                i++;
            }
            while(i<n &&j<n && a[j]==0){
                j++;
            }
            if(i<j){
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
            }
            i++;
            j++;
        }
        for(int k :a){
            System.out.print(k+" ");
        }
    }
}
