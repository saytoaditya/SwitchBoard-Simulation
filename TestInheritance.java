class Animal
{
    void eat()
    {
        System.out.println("Eat");
    }
}
class Dog extends Animal
{
    void bark()
    {
        System.out.println("bark");
    }
}
class BabyDog extends Dog
{
    void weep()
    {
        System.out.println("weeping");
    }
}
class TestInheritance
{
    public static void main(String[] args)
    {
        BabyDog obj = new BabyDog();
        obj.eat();
        obj.bark();
        obj.weep();
    }
}
