class Box
{
    int length,breadth;
    Box(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    void calculateArea()
    {
        System.out.println("Area of the Box ="+(length*breadth));
    }
    void display()
    {
        System.out.println("Length of the Box ="+length);
        System.out.println("Breadth of the Box ="+breadth);
    }
    public static void main(String[] args)
    {
        Box b=new Box(10,7);
        b.display();
        b.calculateArea();
    }
}