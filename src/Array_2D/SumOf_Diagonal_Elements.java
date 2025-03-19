/*

    LeetCode : 1572

 */
package Array_2D;

public class SumOf_Diagonal_Elements {
    public static void main(String[] args) {
        int[][] mat1={{1,2,3,4,5},
                     {4,5,6,5,6},
                     {7,8,9,6,7},
                     {1,2,3,4,5},
                     {1,2,3,4,5}};
        int[][] mat={{1,1,0,1},
                     {1,1,0,1},
                     {1,0,0,0},
                     {1,0,0,0}};
        int n=mat.length;

        int s=0;
        for(int i=0;i<n;i++){
            s+=mat[i][i];
            s+=mat[i][n-1-i];
        }
        if(n%2!=0){
            s-=mat[n/2][n/2];
        }
        System.out.println(s);
    }
}
