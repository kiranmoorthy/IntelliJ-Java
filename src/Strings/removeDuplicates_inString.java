import java.util.Scanner;
import java.util.ArrayList;

public class removeDuplicates_inString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String[]sarr=s.split(" ");
        ArrayList<String>list=new ArrayList<String>();
        for(String i:sarr){
            if(!list.contains(i)){
                list.add(i);
            }
        }
        for(String j:list){
            System.out.println(j);
        }
    }
}
