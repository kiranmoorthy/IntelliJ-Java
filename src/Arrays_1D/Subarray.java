package Arrays_1D;

public class Subarray {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        int n=arr.length;
        for(int i=0;i<=n;i++){           // start
            for(int j=i;j<n;j++){        // end
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
}
