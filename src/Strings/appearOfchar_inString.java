import java.util.Scanner;

public class appearOfchar_inString {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        String s= in.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (ch=='a') {
                count++;
            }
        }
        System.out.print(count);
    }
}
