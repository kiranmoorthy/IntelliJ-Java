package Arrays;
/*
    Sample Input:
    7 4 6
    1 4 6 7
    1 2 3 4 6 7
    Sample Output:
    4 1

*/


import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Input  ********************************************************************************************
        int tot=in.nextInt();
        int ig=in.nextInt();
        int tr=in.nextInt();
        int[]igarr=new int[ig];
        for(int i=0;i<ig;i++){
            igarr[i]=in.nextInt();
        }
        int[]trarr=new int[tr];
        for(int i=0;i<tr;i++){
            trarr[i]=in.nextInt();
        }



        //First Output - No.of common elements in 2 array  **************************************************
        int both=0;
        for(int i:igarr){
            for(int j:trarr){
                if(i==j){
                    both++;
                }
            }
        }
        System.out.print(both+" ");

        //Second Output - no.of elements of tot_array not in two arrays  ************************************
        int[]jarr=new int[ig+tr];
        for(int i=0;i<ig;i++){
            jarr[i]=igarr[i];
        }
        for(int i=0;i<tr;i++){
            jarr[ig+i]=trarr[i];
        }
        int notboth=0;
        for(int i=1;i<=tot;i++){
            int f=0;
            for(int j:jarr){
                if(i==j){
                    f++;
                }
            }
            if(f==0){
                notboth++;
            }
        }
        System.out.print(notboth+" ");



    }
}













