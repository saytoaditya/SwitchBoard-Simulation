public class Fractionuse
{
    public static void main(String[] args)
    {
        Fraction f1 =new Fraction(20,30);
        f1.print();

        f1.setNumerator(80);
        f1.setDenominator(25);
        int n=f1.getNumerator();
        int d=f1.getDenominator();
        System.out.println(+n);
        System.out.println(+d);
        f1.print();

        // Fraction f2=new Fraction(20,30);
        // f2.print();
        // f1.add(f2);
        // f1.print();
        // f2.print();   
    }
};
class Fraction{
    private int numerator;
    private int denominator;
    
    public Fraction(int numerator,int denominator)
    {
        this.numerator=numerator;
        this.denominator=denominator;
        simplify();
    }
    public int getDenominator()
    {
        return denominator;
    }
    public int getNumerator()
    {
        return numerator;
    }
    public void setNumerator(int n)
    {
        this.numerator=n;
        simplify();
    }
    public void setDenominator(int d)
    {
        this.denominator=d;
        simplify();
    }
    public void print()
    {
        if(denominator==1)
        {
            System.out.println(+numerator);
        }
        else
        {
            System.out.println(numerator+ "/" +denominator );
        }
    }
    public void simplify()
    {
        int gcd=1;
        int smaller= Math.min(numerator,denominator);
        for(int i=2;i<=smaller;i++)
        {
            if(numerator%i==0 && denominator%i==0)
            {
                gcd=i;
            }
        }
        numerator=numerator/gcd;
        denominator=denominator/gcd;
    }
    public void add(Fraction f2)
    {
        this.numerator=(this.numerator*f2.denominator)+(f2.numerator*this.denominator);
        this.denominator=(this.denominator*f2.denominator);
        simplify();
    }
}