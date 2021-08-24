import java.util.*;
public class Object
{
    int rollno;
    String name;
}
class Student
{
    public static void main(String[] args)
    {
        Object variable1=new Object();
        variable1.name="raju";
        variable1.rollno=1;
        Object variable2=new Object();
        variable2.name="sham";
        variable2.rollno=2;
        System.out.println(+variable1.name);
    }
}