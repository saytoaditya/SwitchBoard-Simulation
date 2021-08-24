public class ShuffleArray{
    public static void main(String[] args)
    {
        int arr[]={2,5,1,3,4,7};
        int length=(arr.length/2);
        for(int i=0;i<length;i++)
        {
                System.out.println(arr[i]);
                System.out.println(arr[length+i]);
        }
    }
}