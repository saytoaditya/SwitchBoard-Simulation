public class Add2d
{
    public static void main(String args[])
    {
        int[][] arr1=new int[][]{{1,2,3},{4,5,6},{1,2,3}};
        int[][] arr2=new int[][]{{1,2,3},{4,5,6},{1,2,3}};
        int[][] c=new int[arr1.length][arr2.length];
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                System.out.print(c[i][j]=arr1[i][j]+arr2[i][j]);
            }
            System.out.println();
        }
    }
}