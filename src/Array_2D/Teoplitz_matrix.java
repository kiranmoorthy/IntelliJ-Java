/*
    LeetCode : 766
 */

package Array_2D;

public class Teoplitz_matrix {
    public static void main(String[] args) {
        int[][]arr={{4,1,2,3},
                    {3,4,1,2},
                    {8,3,4,1},
                    {2,8,3,4}
        };
        int n=arr.length;
        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                if(arr[i][j]!=arr[i-1][j-1]){
                    System.out.println("False");
                    return;
                }
            }
        }
        System.out.println("True");
    }
}
