class Outer
{
    int num=100;
    class Inner
    {
        void display()
        {
            System.out.println("The value of num is: "+num);
        }
    }
    public static void main(String[] args) {
        Outer obj=new Outer();
        Outer.Inner in=obj.new Inner();
        in.display();
    }
}