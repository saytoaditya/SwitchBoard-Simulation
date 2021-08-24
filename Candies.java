public class Candies{
    public static void main(String[] args)
    {
        int candies[]=new int[]{2,3,5,1};
        int extraCandies=3,temp=0,i;
        for(i=0;i<candies.length;i++)
        {
            for(int j=i+1;j<=candies.length;i++)
            {
                if(candies[i]>candies[j])
                temp=candies[i];
                candies[i]=candies[j];
                candies[j]=temp;
            }
        }
        // for(int i=0;i<candies.length;i++)
        // {
            System.out.println(+candies[i]);
        //}
    }
}