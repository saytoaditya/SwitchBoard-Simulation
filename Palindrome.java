import java.util.*;
class Palindrome {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter input to check palindrome");
        int x=input.nextInt();
        int temp=x,rev=0, rem;
        while(temp > 0)
        {
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if(x==rev)
        {
            System.out.println("number is palindrome");
        }
        else
            System.out.println("not palindrome");
       
    }
    }
