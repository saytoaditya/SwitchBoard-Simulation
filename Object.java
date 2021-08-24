class Student 
{
    int id;
    int rollNo;
    String name;
    void insertRecord(int i,int r,String n)
    {
        id=i;
        rollNo=r;
        name=n;
    }
    void display()
    {
        System.out.println(id+" "+rollNo+" " +name);
    }
}
public class Object
{
    public static void main(String[] args)
    {
        Student s1=new Student();
        Student s2=new Student();
        s1.insertRecord(1,10,"adi");
        s2.insertRecord(2,11,"shi");
        s1.display();
        s2.display();   
    }
}