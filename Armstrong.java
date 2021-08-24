public class Armstrong{
    public static void main(String args[])
    {
        int n=153,arm=0,rem;
        int temp=n;
        while(n>0)
        {
            rem=n%10;
            arm=arm+(rem*rem*rem);
            n=n/10;
        }
        if(arm==temp){
            System.out.println( "no is armstrong");
        }
        else
        {
            System.out.println("no is not armstrong");
        }
    }
}