class Box
{
    double width;
    double height;
    double length;
    Box()
    {
        length=1;
        width=1;
        height=1;
    }
    Box(double side)
    {
        length=side;
        width=side;
        height=side;
    }
    Box(double l,double w,double h)
    {
        length=l;
        width=w;
        height=h;
    }
    void calculate()
    {
        double volume=length*width*height;
        System.out.println("Volume of the Box is="+volume);
    }
    public static void main(String args[])
    {
        Box b1=new Box();
        Box b2=new Box(5);
        Box b3=new Box(2,3,4);
        b1.calculate();
        b2.calculate();
        b3.calculate();
    }
}