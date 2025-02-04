//Replace element with sum of other elements in an array


import java.util.Scanner;
public class replace_ele1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Getting No.of element
        System.out.print("Enter the number of elements:");
        int n = in.nextInt();

        //Getting input and sum of all elements
        int[]array=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            System.out.printf("Enter the %d element:",i+1);
            array[i]=in.nextInt();
            sum=sum+array[i];
        }

        //Swapping
        for(int j=0;j<n;j++){
            array[j]=sum-array[j];
        }

        //Printing
        for(int k:array){
            System.out.print(k+" ");
        }
    }
}
