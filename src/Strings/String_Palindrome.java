import java.util.Scanner;

public class String_Palindrome{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        String  str = in.nextLine();
        String pal="";
        for(int i=str.length()-1;i>=0;i--)
        {
            char ch =str.charAt(i);
            pal=pal+ch;
        }
        if(str.equals(pal))
        {
            System.out.print("it is palindrome");
        }
        else{
            System.out.print("not a palindrome");
        }
    }
}
