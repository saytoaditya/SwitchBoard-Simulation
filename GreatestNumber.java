//For each kid check if there is a way to distribute extraCandies among the kids such that he or she can have the greatest number of candies among them. Notice that multiple kids can have the greatest number of candies.
import java.util.Arrays;
class GreatestNumber
{
    public static void main(String[] args)
    {
        int[] arr={1,2,6,5,8};
        int max=0;
        int extra=2;
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
           
        }
         System.out.println("maximum number "+max);
         for(int i=0;i<arr.length;i++)
         {
         if((arr[i]+extra)>=max)
         System.out.println("true");
         else 
         System.out.println("false");
         }
           
    }
}