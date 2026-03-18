class Circle{
    double radius;
    Circle(double radius)
    {
        this.radius=radius;
    }
    void area()
    {
        double area=3.14*radius*radius;
        System.out.println("Area of the Circle ="+area);
    }
    public static void main(String args[])
    {
        Circle c1=new Circle(5.0);
        c1.area();
    }
}