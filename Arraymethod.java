public class Arraymethod
{
 public static void main(String[] args)
 {
     int arr[]={1,2,3,4,5};
     System.out.println(add(arr));
 }
    public static int add(int arr[])
    {
    int sum=0 , i;
    for(i=0;i<arr.length;i++)
    sum=sum+arr[i];
    return sum;
    }
}