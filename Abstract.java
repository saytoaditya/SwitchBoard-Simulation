abstract class Vehicle
{
    void bike()
    {
        System.out.println("bike is running");
    }
    abstract void car();
}
class Honda extends Vehicle
{
    @Override
    void car()
    {
        System.out.println("car is running");
    } 
}
public class Abstract
{
    public static void main(String[] args)
    {
        Honda obj = new Honda();
        obj.bike();
        obj.car();
    }
}