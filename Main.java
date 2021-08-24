/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
class PeopleExpense
{
  public String Name;
  public int Expense;
    PeopleExpense (String name, int expense)
  {
    Name = name;
    Expense = expense;
  }
}
public class Main
{
  public static void main (String[]args)
  {
    Scanner scan = new Scanner (System.in);
    System.out.println ("Enter No. Of People");
    int peopleCount = scan.nextInt ();
    String[] names = new String[peopleCount];
    PeopleExpense peopleExpenses[] = new PeopleExpense[peopleCount];
    for (int i = 0; i < peopleCount; i++)
    {
	names[i] = scan.nextLine ();
	peopleExpenses[i].Name=names[i];
	peopleExpenses[i].Expense=0;
    }
    boolean wantToExit = false;
    while (!wantToExit)
    {
	System.out.println ("Main Menu");
	System.out.println ("1 Add Expenses");
	System.out.println ("2 Show Expenses");
	System.out.println ("3 exit program");
	int selectedOption = scan.nextInt ();
	switch (selectedOption)
	  {
	  case 1:
	    AddExpense (names, peopleExpenses);
	  case 2:
	    ShowExpenses(peopleExpenses);
	  case 3:
	    wantToExit = true;
	  default:
	    System.out.println ("Please Enter a Valid entry");
	  }
    }
  }
  public static void AddExpense (String[]names, PeopleExpense[] peopleExpenses)
  {
    System.out.println ("Who paid the expense");
    for (int i = 0; i < names.length; i++)
    {
	System.out.println (i + 1 + " " + names[i]);
    }
    Scanner scan = new Scanner (System.in);
    int selectedPerson = scan.nextInt () - 1;
    System.out.println ("How much expense " + names[selectedPerson] +
			"invested");
    int expense = scan.nextInt();

    for(int i=0;i<names.length;i++)
    {
        if(names[selectedPerson] == peopleExpenses[i].Name)
        {
            peopleExpenses[i].Expense+=expense;
        }
    }

  }

    public static void ShowExpenses (PeopleExpenses[] peopleExpenses)
    {
        int totalExpense=0;
        for(int i=0;i<peopleExpenses.length;i++)
        {
            totalExpense+=peopleExpenses[i].Expense;
        }
        
        int costPerPerson = totalExpense/peopleExpenses.length;
        
        int diff[] = new int[peopleExpenses.length];
        
         for(int i=0;i<peopleExpenses.length;i++)
        {
            diff[i] =  peopleExpenses.Expense[i]-costPerPerson;
        }
        
          for(int i=0;i<peopleExpenses.length;i++)
        {
            if(diff[i]<0)
            {
                   for(int j=0;j<peopleExpenses.length;j++)
                   {
                        if(diff[j]>0)
                        {
                            peopleExpenses.Expense
                        }
            
                   }
        {
            }
        }
    }
  }
