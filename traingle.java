import java.io.*;

public class traingle {
    public static void main(String args[])throws IOException
    {
        int side1,side2,side3;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the side of Traingle =");
        side1=Integer.parseInt(br.readLine());
        System.out.println("Enter the side of Traingle =");
        side2=Integer.parseInt(br.readLine());
        System.out.println("Enter the side of Traingle =");
        side3=Integer.parseInt(br.readLine());
        if(side1==side2 && side2==side3 && side1==side3)
        {
            System.out.println("Equilateral Traingle");
        }
        else if(side1==side2 || side2==side3 || side1==side3)
        {
            System.out.println("Iscocles Traingle");
        }
        else
        {
            System.out.println("Scalene Traingle");
        }
    }
}