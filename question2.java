class Car
{
    String brand;
    int price;
    //Parameterized constructor
    Car(String b,int p)
    {
        brand=b;
        price=p;
    }
    void display()
    {
        System.out.println("Brand :"+brand);
        System.out.println("Price :"+price);
    }
    public static void main(String args[])
    {
        Car c1=new Car("Toyota",200000);
        c1.display();
    }
}