/*
    LeetCode : 8
 */
package Strings;

import java.util.Scanner;

public class atoi {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine(); //    9-a223372036854775808
        int n=s.length();
        int i=0;
        int sign=1;
        long ans=0;
        while(i<n && s.charAt(i)==' '){
            i++;
        }
        if(i<n &&(s.charAt(i)=='-' || s.charAt(i)=='+')){
            sign=(s.charAt(i)=='+')?1:-1;
            i++;
        }
        while(i<n && Character.isDigit(s.charAt(i))) {
            ans = (ans * 10) + s.charAt(i) - '0';
            i++;

            if (ans > Integer.MAX_VALUE) {
                System.out.println(Integer.MAX_VALUE);
                return;
            } else if (ans * sign < Integer.MIN_VALUE) {
                System.out.println(Integer.MIN_VALUE);
                return;
            }
        }
        System.out.println(sign*ans);
    }
}
