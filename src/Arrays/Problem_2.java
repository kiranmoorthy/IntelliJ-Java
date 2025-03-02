/*

    Return index of row with highest count of 1's

 */
package Arrays;

public class Problem_2 {
    public static void main(String[] args) {
        int[][]arr={{0,1,2,3},
                    {4,1,6,7},
                    {8,1,0,1},
                    {1,1,1,5}
        };


        int n=arr.length;
        int maxc=0;
        int maxi=0;
        for(int i=0;i<n;i++){
            int t=0;
            for(int j=0;j<n;j++){
                if(arr[i][j]==1){
                    t++;
                }
            }
            if(t>maxc){
                maxc=t;
                maxi=i;
            }
        }
        System.out.println(maxi);
    }
}
