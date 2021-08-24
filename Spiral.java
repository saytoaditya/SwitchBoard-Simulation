import java.util.Scanner;
public class Spiral
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter no of rows");
        int rows=s.nextInt();
        System.out.println("enter no of cols");
        int cols=s.nextInt();
        int input[][]=new int[rows][cols];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.println(" value for  row " +i+ " enter  value for column " +j);
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
        int l=0,t=0,b=rows-1,r=cols-1;
        while(l<=r&&t<=b)
        {
        
        
            for(int i=r;i>=l;i--)
            {
                System.out.print(input[b][i]);
            }	
            b--;
            for(int i=b;i>=t;i--)
            {
                System.out.print(input[i][l]);
            }
                l++;
                for(int i=l;i<=r;i++)
                {
                    System.out.print(input[t][i]);
                }
                t++;
                for(int i=t;i<=b;i++)
                {
                    System.out.print(input[i][r]);
                }
                r--;
        }
       
    }
}