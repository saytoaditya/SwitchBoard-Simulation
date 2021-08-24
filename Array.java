class Object
{
    public int roll_no;
    public String name;
    Object(int roll_no, String name)
    {
        this.roll_no=roll_no;
        this.name=name;
    }

}
public class Array
{
    public static void main(String[] args)
    {
        Object[] arr;
    arr = new Object[5];
    arr[0]=new Object(1,"raju");
    arr[1]=new Object(2,"rajuor");
    arr[2]=new Object(3,"adi");
    for(int i=0; i<=arr.length; i++)
    System.out.println("student data"+i+":"+arr[i].roll_no+ " "+arr[i].name);
    }
}