package Arrays_1D;

//Replace element with sum of right side elements in an array

import java.util.Scanner;
public class replace_ele2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Getting No.of element
        System.out.print("Enter the number of elements:");
        int n = in.nextInt();

        //Getting input
        int[]array=new int[n];
        for(int i=0;i<n;i++){
            System.out.printf("Enter the %d element:",i+1);
            array[i]=in.nextInt();
        }

        //Swapping
        for(int j=0;j<n;j++){
            array[j]=0;
            for(int k=j+1;k<n;k++){
                array[j]=array[j]+array[k];
            }
        }

        //Printing
        for(int l :array){
            System.out.print(l +" ");
        }
    }
}
