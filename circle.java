import java.io.*;

public class circle {
    public static void main(String args[])throws IOException{
        double radius,area,circumference;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Radius of the Circle :");
        radius=Double.parseDouble(br.readLine());
        area=3.14*radius*radius;
        circumference=2*3.14*radius;
        System.out.println("Area of the Circle is  ="+ area);
        System.out.println("Circumference of the Circlle is ="+ circumference);
    }
}
