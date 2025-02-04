
public class star_pattern {
    public static void main(String[]args){
        int n=3;
        for(int i =0;i<n;i++)
        {
            for(int j=1;j<=n;j++){
                for(int k=1;k<j+1;k++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
