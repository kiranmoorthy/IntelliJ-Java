package Strings;

import java.util.*;

public class LengthOf_LongestPalindrome {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.next();
        char[]arr=str.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for(char c:arr){
            if(!map.containsKey(c)){
                map.put(c,1);
            }
            else{
                map.put(c,map.get(c)+1);
            }
        }
        int sum=0;
        int f=0;
        for(Map.Entry<Character,Integer> e:map.entrySet()){
            int a=e.getValue();
            if(a%2==0){
                sum+=a;
            }
            else if(f==0){
                sum+=a;
                f=1;
            }
            else{
                sum=sum+a-1;
            }
        }
        System.out.println(sum);
    }
}
