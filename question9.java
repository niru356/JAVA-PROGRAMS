import java.io.IOException;
import java.util.*;
public class question9
{
    public static void main(String args[])throws IOException
    {
        double radius,area,volume,pi=3.14;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Radius of the Sphere =");
        radius=sc.nextDouble();
        area=4*radius*radius*pi;
        volume=(4/3)*radius*radius*radius*pi;
        System.out.println("Area of the Sphere ="+area);
        System.out.println("Volume of the Sphere ="+volume);
    }
}