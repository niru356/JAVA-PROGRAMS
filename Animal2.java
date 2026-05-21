public class Animal2
{
    void eat1()
    {
        System.out.println("My name is Nirkar Rath");
    }
}
class Dog extends Animal2
{
    void eat1()
    {
        System.out.println("My age is 20");
    }
}
class Cat extends Animal2
{
    void eat1()
    {
        System.out.println("My city is Pune");
    }
}
class Test
{
    public static void main(String args[])
    {
        Animal2 a=new Animal2();
        Animal2 b=new Dog();
        Animal2 c=new Cat();
        a.eat1();
        b.eat1();
        c.eat1();
    }
}