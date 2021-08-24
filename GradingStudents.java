import java.util.Scanner;
public class GradingStudents
{
    public static void main(String args[])
    {
       int multiple,diff,check;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter no of student");
        int n=scan.nextInt();
        int a[]=new int[n];
        for(int k=0;k<n;k++)
        {
            System.out.println("enter grade for student "+(k+1));
            a[k]=scan.nextInt();
        }
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            multiple=a[i]/5;
            check=(multiple+1)*5;
            diff=check-a[i];
            if(diff<3 && a[i]>=38)
            {
                arr[i]=a[i]+diff;
            }
            else
            {
                arr[i]=a[i];
            }
        }
        System.out.println("updated result");
            for(int j=0;j<n;j++)
            {
                System.out.println(arr[j]);
            }   
    }
}