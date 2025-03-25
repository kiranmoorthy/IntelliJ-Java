package Arrays_1D;
/*
    a - no.of painters
    b - time taken painting for 1 unit of board
    n - size of array
    c - array

    return the min time required to paint all boards
    Constraint :
        any painter will paint only continuous board of selection
        no board sharing between painters

    Ex :
        a=2
        b=1
        n=4
        c=[10,20,30,40]

        P1          Tot       P2             Tot
        0           0         10+20+30+40    100
        10          10        20+30+40       90
        10+20       30        30+40          70
        10+20+30    60        40             40

        Low     High    Mid
        0       100     50
        51      100     75
        51      74      62
        51      61      56
        57      61      59
        60      61      60
        60   >  59  (false) Out of Loop

        count of painters in mid-range == a
        false   l=mid+1
        true    h=mid-1

        eg:
        mid=50
        1.10+20<mid
        2.30<mid
        3.40<mid
            3 painters are required
            But available painters a=2
            So, false

 */
public class Painting_the_Board {


    public static void main(String[] args) {
        int a=2;
        int b=1;
        int[]arr={10,10,20,10};
        int n=arr.length;
        int h=0;
        for(int i:arr){
            h+=i;
        }
        int ans=bin_search(arr,n,h,a);
        int time_taken=ans*b;

        System.out.println(time_taken);

    }
    public static int bin_search(int[]arr,int n,int h,int a){
        int l=0;
        int ans=0;
        while(l<=h){
            int m=(l+h)/2;

            if(painterCount(arr,n,m,a)){
                h=m-1;
                ans=m;
            }
            else{
                l=m+1;
            }
        }
        return ans;
    }
    public static boolean painterCount(int[]arr,int n,int m,int a){
        int count=1;
        int sum =0;

        for(int i=0;i<n;i++){
            sum +=arr[i];
            if(sum >m){
                i--;
                count++;
                sum =0;
            }
        }
        return count==a;
    }
}
