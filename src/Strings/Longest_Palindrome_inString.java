package Strings;

import java.util.Scanner;

public class Longest_Palindrome_inString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.next();
        int l=str.length();

        int maxl=0;
        String maxs="";

        for(int i=1;i<=l;i++){
            for(int j = 0; j <=l-i; j++){
                String s=str.substring(j, j +i);
                if(String_Palindrome.isPalindrome(s)){
                    if(s.length()>maxl){
                        maxl=s.length();
                        maxs=s;
                    }
                }
                System.out.print(s+" ");
            }
        }
        System.out.println(maxs);
    }
}
