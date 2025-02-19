/*

INPUT  : 2025-02-19
OUTPUT : 49
EXPLANATION :

    Count the no.of.days upto this date


LeetCode : 1154
 */

package Numbers;

public class Day_Of_The_Year{
    public static void main(String[] args){
        String date="2025-02-18";
        int y=Integer.parseInt(date.substring(0,4));
        int m=Integer.parseInt(date.substring(5,7));
        int d=Integer.parseInt(date.substring(8));
        int[]marr={31,28,31,30,31,30 ,31,31,30,31,30,31};

        //Adding days
        int sum=d;

        //Adding days from remaining month
        if(m>1){
            for(int i=0;i<m-1;i++){
                sum+=marr[i];
            }
        }

        //Adding one day if Leap Year
        if(y%4==0 && ( y%100!=0 || y%400==0)){
            sum++;
        }

        System.out.println(sum);
    }
}
