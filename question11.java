class Area
{
    int length,breadth,height,side;
    double radius;
    // Create a paramterized Constructor
    public Area(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }   
    public Area(int side)
    {
        this.side=side;
    }
    public Area(double radius)
    {
        this.radius=radius;
    }
    // Create a method to calculate the area of the rectangle
    public void areaOfRectangle()
    {
        int area=length*breadth;
        System.out.println("Area of the rectangle is: "+area);
    }
    // Create a method to calculate the area of the circle
    public void areaOfCircle()
    {
        double area=3.14*radius*radius;
        System.out.println("Area of the circle is: "+area);
    }
    public static void main(String[] args)
    {
        Area area=new Area(12,8);
        Area area2=new Area(5.0);
        area.areaOfRectangle();
        area2.areaOfCircle();
    }
}