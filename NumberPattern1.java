public class NumberPattern1
{
    public static void main(String args[])
    {
        int n=7;
        for(int i=1;i<=n;i++)
        {
            int p=1;
            for(int j=1;j<=i;j++)
            {
                System.out.print(p++);
            }
            System.out.println(" ");
        }
    }
}

// 1 
// 12
// 123
// 1234
// 12345
// 123456
// 1234567