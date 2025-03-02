/*
    Alternative dense matrix
 */
package Arrays;

public class Sparse_matrix {
    public static void main(String[] args) {
        int[][]arr={{4,1,2,3},
                    {3,0,5,0},
                    {5,0,5,0},
                    {0,0,0,0}
        };
        int n=arr.length;
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==0){
                    c++;
                }
            }
        }
        System.out.print((c>n*n/2)?"Sparse":"Dense");
    }
}
