package Array_2D;

public class sum_Of_UpperTriangle_Elements {
    public static void main(String[] args) {
        int[][]arr={{0,1,2,3},
                    {4,5,6,7},
                    {8,9,0,1},
                    {2,3,4,5}
        };
        int n=arr.length;

        int s=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                s+=arr[i][j];
            }
        }
        System.out.print(s);
    }
}
