//leetcode.com/problems/richest-customer-wealth/
import java.util.Arrays;
class GreatestInTwoDarray
{
    public static void main(String args[])
    {
      int[][] arr={{1,2,3},{4,5,6}};
      int temp=0;
      int temp2=0;
    
      for(int i=0;i<arr.length;i++)
      {
        for(int j=0;j<arr[i].length;j++)
        {
            temp=temp+arr[i];
            temp2=temp2+arr[j];
        }
      }
      if(temp>temp2)
      System.out.println(+temp);
      else
      System.out.println(+temp2);
    }
}