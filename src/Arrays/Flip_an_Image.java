/*

    LeetCode : 832

 */


package Arrays;

public class Flip_an_Image {
    public static void main(String[] args) {
        int[][] image={{1,1,0},{1,0,1},{0,0,0}};
        for(int[] a:image){
            int l=a.length;

            // Reversing
            for(int i=0;i<l/2;i++){
                int t=a[i];
                a[i]=a[l-1-i];
                a[l-1-i]=t;
            }


            // Flipping
            for(int i=0;i<a.length;i++){
                a[i]=(a[i]==0)?1:0;
            }
        }

        // Output Printing
        for(int[] i:image){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
