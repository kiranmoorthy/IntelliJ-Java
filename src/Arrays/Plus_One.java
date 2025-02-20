/*
    Leetcode :  66
 */

package Arrays;

public class Plus_One {


    public static int[] plusOne(int[]arr){

        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]<9){
                arr[i]+=1;
                return arr;
            }
            else{
                arr[i]=0;
            }
        }

        int[] narr =new int[arr.length+1];
        arr[0]=1;
        return arr;

    }


    public static void main(String[] args) {
        int[]arr={3,3};

        int[]narr=plusOne(arr);

        for(int j :narr){
            System.out.print(j +" ");
        }
    }
}
