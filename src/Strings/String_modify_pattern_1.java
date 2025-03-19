package Strings;
//      M   a   t   h
//      +1 -1  +1  -1
//      N   z   u   g

import java.util.Scanner;
public class String_modify_pattern_1{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s=in.nextLine();
        String t="";

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(i%2==0)
            {               // even index places
                if(ch=='z' || ch=='Z'){
                    t=t+(char)(ch-25);
                }
                else{
                    t=t+(char)(ch+1);
                }
            }
            else
            {               // odd index places
                if(ch=='a' || ch=='A'){
                    t=t+(char)(ch+25);
                }
                else{
                    t=t+(char)(ch-1);
                }
            }
        }
        System.out.print("Modified string : "+t);
    }
}
