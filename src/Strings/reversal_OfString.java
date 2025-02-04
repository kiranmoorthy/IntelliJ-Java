import java.util.Scanner;

public class reversal_OfString {
    public static void main(String[]args){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the String:");
        String str =in.nextLine();
        String rev="";
        int len=str.length()-1;
        for(int i=len;i>=0;i--)
        {
            char ch=str.charAt(i);
            rev=rev+ch;
        }
        System.out.print(rev);
    }
}
