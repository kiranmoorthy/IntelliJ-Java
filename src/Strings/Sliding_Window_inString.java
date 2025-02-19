package Strings;

import java.util.Scanner;

public class Sliding_Window_inString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        int l=s.length();
        for(int i=0;i<=l-3;i++){
            String t=s.substring(i,i+3);
            //System.out.println(t);
        }
        for(int j = 1; j <=l; j++){
            for(int i=0;i<=l-j;i++){
                String t=s.substring(i,i+j);
                System.out.print(t+" ");
            }
        }
    }
}
