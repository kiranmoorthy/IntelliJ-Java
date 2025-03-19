package Arrays_1D;

import java.util.Arrays;
import java.util.OptionalInt;

public class Main_Arrays {
    public static void main(String[] args) {
        //System.out.println("Main_Arrays");

        int[]a={0,0,0,0};

        if(Arrays.stream(a).allMatch(i->i==0)){
            System.out.println("true");
        }
        else{
            System.out.println("False");
        }



    }
}
