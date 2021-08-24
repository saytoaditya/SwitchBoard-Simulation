import java.util.Scanner;
import java.util.*;
class Split
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter number of members");
        int member_no=scan.nextInt();        // to get mmember no
        List<String> member_list=new ArrayList<String>();
        scan.nextLine();
        for(int i=0;i<member_no;i++)
        {
            System.out.println("enter name of " +(i+1)+ " members");
            
            String member_name=scan.nextLine();    // to get mmember name
            member_list.add(member_name);        // to add mmember namme in list
        }
        System.out.println(member_list);
        // money distrbution list
        int[][] expense_list=new int[member_no][member_no];
        int temp=1;
        while(temp==1)
        {
            System.out.println("Which Method You Want To Perform ");
            System.out.println("1. Add Expense");
            System.out.println("2. show Expense");
            System.out.println("3. Exit Program");
            int method=scan.nextInt();
            switch (method)
            {
                case 1:
                    addExpense(member_list,expense_list);
                    break;
                case 2:
                    showExpense(member_list,expense_list);
                    break;
                case 3:
                temp=0;
                    break;
            }
        }
    }
    public static void addExpense(List<String> q ,int[][] e)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("who paid the expense ");
        for(int i=0;i<q.size();i++)
        {
            System.out.println(+(i+1)+ ". " +q.get(i));
        }
        int expenser=scan.nextInt();
        System.out.println("how much expense paid by you " +q.get(expenser-1));
        int expense=scan.nextInt();
        int div=expense/q.size();
        for(int row=0;row<q.size();row++)
        {
            for(int column=0;column<q.size();column++)
            {
                if(column==expenser-1)
                {
                    if(row==expenser-1)
                    continue;
                    
                        e[row][column]=e[row][column]+div;
    
                }
            }
        } 
    }
    public static void showExpense(List<String> s,int[][] ex)
    {
        for(int i=0;i<s.size();i++)
        {
            System.out.print(s.get(i)+ "\t");   
        }
        System.out.println(" ");
        for(int row=0;row<s.size();row++)
        {
            for(int column=0;column<s.size();column++)
            {
                if(row==column)
                continue;
                        if(ex[row][column]>ex[column][row])
                        {
                           ex[row][column]-=ex[column][row];
                           ex[column][row]=0;
                           
                        }
                        else{
                            ex[column][row]-=ex[row][column];
                            ex[row][column]=0;
                        }
            }
        }
        for(int j=0;j<s.size();j++)
        {
            for(int k=0;k<s.size();k++)
            {
                System.out.print(ex[j][k]+ "\t");
            }
            System.out.println("");
        }
    }
}