public class question5
{   
    public static void main(String args[])
    {
        if (args.length == 0)
        {
            System.out.println("Please provide radius as command line argument");
            return;
        }

        double radius, volume, area;

        radius = Double.parseDouble(args[0]);

        volume = (4.0 / 3.0) * Math.PI * radius * radius * radius;
        area = 4 * Math.PI * radius * radius;

        System.out.println("Volume of Sphere = " + volume);
        System.out.println("Area of the Sphere = " + area);
    }
}
