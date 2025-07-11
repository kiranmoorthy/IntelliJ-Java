package Arrays_1D;
import java.util.*;
public class pat_practice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int arr[] = new int[num];
        int ans = 0;
        for(int i=0;i<num;i++){
            arr[i] = in.nextInt();
            ans += arr[i];
        }
        int k = in.nextInt();
        //
        if(ans<k){
            System.out.print("Not Possible");
            return;
        }
         // subarray
        int min = Integer.MAX_VALUE;
        for(int i=0;i<num;i++){
            int sum = 0;
            int size = 0;
            for(int j=0;j<=i;j++){
                sum += arr[j];
                size=j;
            }
            if(sum>k){
                if(size<min){
                    min=size;
                }
            }
        }
        //
        System.out.println(min);
    }
}
