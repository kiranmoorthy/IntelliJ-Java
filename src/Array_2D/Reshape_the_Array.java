/*
    LeetCode : 566

 */
package Array_2D;

public class Reshape_the_Array {
    public static void main(String[] args) {
        int[][] mat={{1,2},{3,4}};
        int row=4;
        int col=1;

        if(mat.length * mat[0].length != row*col){
            System.out.println("Invalid");
            return;
            //return mat;
        }

        // Reshaping
        int[][]ans=new int[row][col];
        int index =0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                ans[index/col][index%col]=mat[i][j];
                index++;
            }
        }

        // Output Printing
        for(int[] i:ans){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        //return ans;
    }
}
