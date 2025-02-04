//count the total number of vowels in a given String

import java.util.Scanner;
public class countOf_Vowels {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=in.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                count+=1;
            }
        }
        System.out.print("Number of vowels is "+count);
    }
}
