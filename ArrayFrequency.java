public class ArrayFrequency
{
    public static void main(String[] args)
    {
        int arr[]=new int[] {1,2,3,1,1};
        int visited[]=new int[arr.length];
        int temp=0,count;
        for(int i=0;i<arr.length;i++)
        {
             count=1;  
                          
            for(int j=i+1;j<arr.length;j++)          //vapas pura array traverse hoga 
            {
                if(arr[i]==arr[j] && visited[i]!=1 )             // jasiey he temp me jo variable store hai traverse valey value ke equal hoga
                {  
                    count++; 
                    visited[j]=1;
                }
            }
            // System.out.println(+arr[i]);
            if(visited[i]!=1)
            System.out.println(+count); //then print count 
        }
        
    }
}