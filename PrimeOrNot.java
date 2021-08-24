public class PrimeOrNOt{
    public static void main(String args[])
    {
        int n=8,temp=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                temp++;
                break;   // to break the loop so lopp not run again and again
            }
        }
        if(temp==0)
        {
            System.out.println(n+ "no is prime");
        }
        else
        {
            System.out.println(n+ "no is not prime");
        }
    }
}