public class Automophic
{
    public static void main(String[] args) {
        int n=25;
        int square=n*n;
        while(n>0)
        {
            if(square%10!=n%10)
            break;
            square=square/10;
            n=n/10;
        }
        return true;
    }
}