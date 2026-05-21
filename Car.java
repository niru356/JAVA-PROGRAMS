public class Car
{
    public void move()
    {
        System.out.println("Car can move");
    }
}
class Bike extends Car
{
    public static void main(String args[])
    {
        Bike obj=new Bike();
        obj.move();
    }
}