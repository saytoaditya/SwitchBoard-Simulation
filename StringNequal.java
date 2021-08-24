// Java Program to divide a string in 'N' equal parts.
class StringNequal
{
    public static void main(String[] args)
    {
        String s="aaaabbbbcccc";
        int n=3;
        int length=s.length();
        int temp=0,chars=length/n;
        String[] str=new String[n];
        if(length%n!=0)
        {   
            System.out.println("stering can not be devide in " +n+ " equal parts");
        }
        else
        for(int i=0;i<length;i=i+chars)
        {
            String part= s.substring(i,i+chars);
            str[temp]= part;
            temp++;
        }
        for(int j=0;j<str.length;j++)
        {
            System.out.println(str[j]);
        }
    }
}