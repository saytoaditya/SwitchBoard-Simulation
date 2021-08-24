//https://leetcode.com/problems/decompress-run-length-encoded-list/
import java.util.*;
// class Decompress
// {
//     public static void main(String[] args)
//     {
//         int[] arr= {1,2,3,4};
//         int i, freq;
//         ArrayList<Integer> lis= new ArrayList<Integer>();   
//         for(i=0; i<arr.length; i+=2)
//         {
//               freq=arr[i];
//               while(freq>0)
//               {
//                  lis.add(arr[i+1]);
//                  freq--;
//               }
//         }
//         System.out.println(lis);
//     }
 
// }
class Decompress
{
    public static void main(String[] args)
    {
        int arr[]={1,2,3,5};
        int ans[] = new int[];
        int freq;
        for(int i=0;i<arr.length;i+=2)
        {
           freq=arr[i];
           while(freq>0)
           {
               System.out.println(arr[i+1]);
               freq--;
           }
        }
    }
}