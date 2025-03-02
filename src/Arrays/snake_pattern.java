package Arrays;

public class snake_pattern {
    public static void main(String[] args) {
        int[][]arr={{0,1,2,3},
                    {4,5,6,7},
                    {8,9,0,1},
                    {2,3,4,5}
        };

        int n=arr.length;
        for(int i=0;i<n;i++){
            if(i%2==0){
                for(int j=0;j<n;j++){
                    System.out.print(arr[i][j]+" ");
                }

            }
            else{
                for(int j=n-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
