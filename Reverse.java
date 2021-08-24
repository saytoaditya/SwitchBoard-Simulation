import java.util.*;
class Reverse
{
    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);
    System.out.println("enter input to revrse");
    int x=input.nextInt();
    int temp=x,rem,rev=0;
    while(temp !=0)
    {
    rem=temp%10;
    rev=rev*10+rem;
    temp=temp/10;
    }
    System.out.println("reverse number is "+rev);

    }
}