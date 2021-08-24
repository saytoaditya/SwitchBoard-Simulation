public class ArrayFrequency1
{
    public static void main(String[] args)
    {
        int arr[]=new int[] {1,2,3,1,2,1,};
        int temp=0;
        for(int i=0;i<arr.length;i++)
        {
            int count=1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    temp=1;
                    for(int k=j;k>=0;k--)
                    { 
                        if(arr[j]==arr[k])
                        {
                            temp++;
                        }
                        count++;
                        if(temp>1)
                        {
                            break;
                        }
                    }
                }
            }
            if(temp<=1)
            System.out.println(+count);
        }
    }
}