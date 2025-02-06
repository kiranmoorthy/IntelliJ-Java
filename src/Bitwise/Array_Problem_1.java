/*

Find the non-repeating element in array

*/
package Bitwise;

public class Array_Problem_1 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,4,3,2};
        int result=0;
        for(int i:arr){
            result=result^i;
        }
        System.out.println(result);
    }
}
