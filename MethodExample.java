class MethodExample
{
    public static void main(String args[])
    {
        int num=5;
        findEvenOdd(num);
    }
    public static void findEvenOdd(int num)
    {
        if(num%2==0)
        {
            System.out.println(num + " number is even");
        }
        else
        {
            System.out.println(num + " number is odd");
        }
    }
}