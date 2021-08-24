public class ComplexNumberUse
{
    public static void main(String[] args)
    {
        int a=4;
        int b=5;
        ComplexNumber c1=new ComplexNumber(2,3);
        c1.print();
        ComplexNumber c2 =new ComplexNumber(2,3);
        c2.print();
        System.out.println("adding two complex number in another variable");
        c1.print();
        c2.print();
        c1.add(c1,c2).print();
        System.out.println("adding two complex number in calling object variable");
        c1.print();
        c2.print();
        c1.add(c2);//it will change value of c1(calling object)
        c1.print();
        c2.print();
        System.out.println("Test Aaditya");
        ComplexNumber c4=new ComplexNumber(10,20);
        c4.print();
        c4.add1(c1,c2);
        c4.print();
        System.out.println("Test1 Aaditya");
        c4.add1(c1,c2);
    float c=2.2f;
    float d=8.8f;
    c2.add(c,d);
        c4.add1(a,b);
        c4.print();

    }
}
class ComplexNumber
{
    private int real,imaginary;
    
    public ComplexNumber(int real , int imaginary)
    {
        this.real=real;
        this.imaginary=imaginary;
    }
    public int getReal()
    {
        return real;
    }
    public int getImaginary()
    {
        return imaginary;
    }
    public void setReal(int r)
    {
        real=r;
    }
    public void setImaginary(int imaginary)
    {
        this.imaginary=imaginary;
    }
    public void print()
    {
        System.out.println(real+ "+" +imaginary+ "i");
    }
    //its is changing calling object
    public void add(ComplexNumber c2)
    {
        this.real=this.real+c2.real;
        this.imaginary=this.imaginary+c2.imaginary;
    }
    //it is creating new obj
    public ComplexNumber add(ComplexNumber c,ComplexNumber c2)
    {
        int real=c.real+c2.real;
        int img= c.imaginary+c2.imaginary;
        ComplexNumber c3 =new ComplexNumber(real,img);
        return c3;

    }
    public void add1(ComplexNumber c1,ComplexNumber c2)
    {
        this.real=this.real+c1.real+c2.real;
        this.imaginary=this.imaginary+c1.real+c2.real;
    }
    public void add1(int c1, int c2)
    {
        System.out.println(c1+c2);
    }
    //Method overloading return type change hone se nahi hoti , java me
    
} 