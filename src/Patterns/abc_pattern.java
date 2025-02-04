class abc_pattern {
    public static void main(String[]args)
    {
        int n=4;
        for(int i =1;i<=4;i++)
        {
            for(int j=n-1;j>=i;j--)
            {
                System.out.print("  ");
            }
            for(int k =1;k<=i;k++)
            {
                System.out.print((char)(64+i)+" ");
            }
            System.out.println("");
        }
    }
}
