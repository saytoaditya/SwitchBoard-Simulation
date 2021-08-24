public class PalindromeOrNot
{
    public static void main(String args[])
    {
        int no=32 ,rev=0,rem;
        int temp=no;

        while(no!=0)
        {
            rem=no%10;   // to get reminder which will be lastr digit of number
            rev=rev*10+rem;  // now through this revesed will be printed
            no=no/10;  // to remove digit which we used from last
        }
        if(rev==temp){
            System.out.println("no is palindrome");
        }
        else
        {
            System.out.println("no is not palindrome");
        }
    }
} 