package Arrays_1D;

import java.util.Arrays;


public class Main_Arrays {
    public static void main(String[] args) {
        //System.out.println("Main_Arrays");

        int[]a={1,1,3,4};

        int max=Arrays.stream(a).max().getAsInt();
        int min=Arrays.stream(a).min().getAsInt();

        int sum=Arrays.stream(a).filter(i->i%2==0).sum();
        int t[]=Arrays.stream(a).distinct().toArray();



        if(Arrays.stream(a).allMatch(i->i==0)){
            System.out.println("true");
        }
        else{
            System.out.println("False");
        }





    }
}
