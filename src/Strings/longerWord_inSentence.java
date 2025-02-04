import java.util.Scanner;

public class longerWord_inSentence {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
            String s=in.nextLine();
            int count=0;
            System.out.println(s.length());
            for(int i=0;i<s.length();i++){
                char ch;
                ch = s.charAt(i);
                if(ch==' '){
                    System.out.println(s.toUpperCase());
                }
            }
        }
    }

