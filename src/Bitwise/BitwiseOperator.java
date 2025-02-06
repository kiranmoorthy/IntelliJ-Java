package Bitwise;
import java.util.Scanner;



public class BitwiseOperator {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the 1st Integer: ");
        int a=in.nextInt();
        System.out.print("Enter the 2nd Integer: ");
        int b=in.nextInt();
        System.out.println(" & operation : "+(a & b));// AND operation
        System.out.println(" | operation : "+(a | b));// OR operation
        System.out.println(" ^ operation : "+(a ^ b));// XOR operation
        System.out.println("<< operation : "+(a<<b)); // Shift Left operation
        System.out.println(">> operation : "+(a>>b)); // Shift Right operation
        System.out.println(" ~ operation : "+(~a));   // Not operation

    }
}
