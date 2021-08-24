//Java Program to find all subsets of a string
class StringSubset
{
    public static void main(String args[])
    {
        String str="fun";
        int n=str.length();
        int temp=0;
        String[] arr=new String[(n*(n+1)/2)];
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                arr[temp]=str.substring(i,j+1);
                temp++;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}