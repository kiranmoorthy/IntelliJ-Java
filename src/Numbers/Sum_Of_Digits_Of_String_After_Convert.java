/*

For example,
If s = "zbax" and k = 2,
Then the resulting integer would be 8 by the following operations:

Convert: "zbax" ➝ "(26)(2)(1)(24)" ➝ "262124" ➝ 262124
Transform #1: 262124 ➝ 2 + 6 + 2 + 1 + 2 + 4 ➝ 17
Transform #2: 17 ➝ 1 + 7 ➝ 8

LeetCode : 1945

 */
package Numbers;

import java.util.Scanner;

public class Sum_Of_Digits_Of_String_After_Convert {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.next();
        int k=in.nextInt();

        //String s="";
        int a=0;
        for(int i=0;i<str.length();i++){
            //s+=str.charAt(i)-96;
            a+=(int)str.charAt(i)-96;
        }
        System.out.println(a);

        //int n=Integer.parseInt(s);

        int newsum =a;
        for(int i=1;i<k;i++){
            int tempsum =0;
            while(newsum >0){
                int r= newsum %10;
                tempsum +=r;
                newsum /=10;
            }
            newsum = tempsum;
        }
        System.out.println(newsum);
    }
}
