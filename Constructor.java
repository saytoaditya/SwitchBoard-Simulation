public class Constructor
{
    int id;
    String name;
    Constructor(int i,String n)
    {
        id=i;
        name=n;
    }
    void display()
    {
        System.out.println(id+ " " +name);
    }
    public static void main(String[] args)
    {
        Constructor s1=new Constructor(2,"sk");
        Constructor s2=new Constructor(1,"ak");
        s1.display();
        s2.display(); 
    }
}