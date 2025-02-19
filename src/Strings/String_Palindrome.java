package Strings;

import java.util.Scanner;

public class String_Palindrome{
    public static boolean isPalindrome(String str){
        String pal="";
        for(int i=str.length()-1;i>=0;i--)
        {
            char ch =str.charAt(i);
            pal=pal+ch;
        }
        return (str.equals(pal));
    }
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        String  str = in.nextLine();
        if(isPalindrome(str))
        {
            System.out.print("It is Palindrome");
        }
        else{
            System.out.print("Not a Palindrome");
        }
    }
}
