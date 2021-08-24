import java.util.Scanner;
public class TestArray
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
            System.out.println("enter rows");
            int rows=s.nextInt();
            
            System.out.println("enter Cols");
            int cols=s.nextInt();
            int input[][]=new int[rows][cols];
            for(int i=0;i<rows;i++)
            {
                for(int j=0;j<cols;j++)
                {
                    System.out.println("enter row value " +i+ " enter j value " +j);
                    input[i][j]=s.nextInt();
                }
            }
            for(int i=0;i<rows;i++)
            {
                for(int j=0;j<cols;j++)
                {
                    System.out.print(" "+input[i][j]+" ");
                }
                System.out.println();
            }
    }
}