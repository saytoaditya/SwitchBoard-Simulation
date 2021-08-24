public class DuplicateArray
{
    public static void main(String args[])
    {
        int arr[]=new int[]{1,1,2,2,3,4,1,2,5,6,5};
        for(int i=0;i<arr.length;i++)
        { int count=1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println(arr[j]);
                   
                    
                }
              
            }
        }
    }
}