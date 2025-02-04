import java.util.Scanner;
public class Array_swapElement {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //No.of element
        System.out.print("Enter the number of elements:");
        int n = in.nextInt();
        //Getting input
        int[]array=new int[n];
        for(int i=0;i<n;i++){
            System.out.printf("Enter the %d element:",i+1);
            array[i]=in.nextInt();
        }
        //Getting swap positions
        System.out.print("Enter the swap position 1:");
        int pos1=in.nextInt();
        System.out.print("Enter the swap position 2:");
        int pos2=in.nextInt();
        //Checking swap pos for OutOfBoundError
        if(pos1<0 || pos1>=n || pos2<0 || pos2>=n){
            System.out.print("Invalid");
        }
        else{
            //Swapping
            int temp=array[pos1];
            array[pos1]=array[pos2];
            array[pos2]=temp;
            //Printing
            for(int j:array){
                System.out.print(j+" ");
            }
        }


    }
}
