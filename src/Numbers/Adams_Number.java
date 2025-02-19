package Numbers;

import java.util.Scanner;
public class Adams_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int square = num * num;
        int rem;
        int sq = 0;
        while (num > 0) {
            rem = num % 10;
            sq = sq * 10 + rem;
            num /= 10;
        }
        System.out.println(sq);
        int revsquare = sq * sq;
        int rem1;
        int rsq = 0;
        while(revsquare>0)
        {
           rem1 = revsquare %10;
           rsq = rsq*10 + rem1;
           revsquare /= 10;

        }
        System.out.println(rsq);
        System.out.println(square==rsq);
    }
}
