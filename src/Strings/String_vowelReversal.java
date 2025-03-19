package Strings;// String:      Welcome to Java
//               |  | |  |  | |
//               e  o e  o  a a

// Vowel rev:    a  a o  e  o e
// String:      Walcamo te Jove

import java.util.Scanner;
public class String_vowelReversal {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the String:");
        String str =in.nextLine();
        char[]carr=str.toCharArray();
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(carr[i]=='a'||carr[i]=='e'||carr[i]=='i'||carr[i]=='o'||carr[i]=='u'||carr[i]=='A'||carr[i]=='E'||carr[i]=='I'||carr[i]=='O'||carr[i]=='U')
            {
                if(carr[j]=='a'||carr[j]=='e'||carr[j]=='i'||carr[j]=='o'||carr[j]=='u'||carr[j]=='A'||carr[j]=='E'||carr[j]=='I'||carr[j]=='O'||carr[j]=='U')
                {
                    char temp= carr[i];
                    carr[i] =carr[j];
                    carr[j]=temp;
                    i++;
                    j--;
                }
                else{
                    j--;
                }
            }
            else{
                i++;
            }
        }
        System.out.println(carr);
    }
}
