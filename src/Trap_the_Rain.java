/*
    Leetcode : 42
 */
public class Trap_the_Rain {
    public static int trap(int[]a) {
        int n=a.length;

        int[]lm=new int[n];
        lm[0]=a[0];
        for(int i=1;i<n;i++){
            lm[i]=Math.max(lm[i-1],a[i]);
        }

        int[]rm=new int[n];
        rm[n-1]=a[n-1];
        for(int i=n-2;i>=0;i--){
            rm[i]=Math.max(rm[i+1],a[i]);
        }

        int s=0;
        for(int i=0;i<n;i++){
            s+=Math.min(lm[i],rm[i])-a[i];
        }

        return s;

    }


    public static void main(String[] args) {
        int[]arr={4,2,0,3,2,5};
        System.out.println(trap(arr));

    }
}
