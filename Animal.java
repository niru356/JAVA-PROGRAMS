public class Animal
{
    public void move()
    {
        System.out.println("Cat can move");
    }
}
class Dog extends Animal
{
    public void move()
    {
        System.out.println("Dog can also move");
    }
}   
class Test
{
    public static void main(String args[])
    {
        Animal a=new Animal();
        Animal b=new Dog();
        a.move();
        b.move();
    }
}