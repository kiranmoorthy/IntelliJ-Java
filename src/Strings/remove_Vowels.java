import java.util.Scanner;

public class remove_Vowels {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=in.nextLine();
        String str1="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                continue;
            }
            else{
                str1=str1+ch;
            }
        }
        System.out.println(str1);
    }
}
