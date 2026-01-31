
import java.io.*;
public class question18 {
    public static void main(String args[])throws IOException
    {
        int num,choice,sqr;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1: CHECK EVEN-ODD");
        System.err.println("2: CHECK POSITIVE / NEGATIVE");
        System.err.println("3: FIND THE SQUARE OF THE NUMBER");
        System.err.println("4: EXIT");
        System.err.println("Enter the Choice =");
        choice=Integer.parseInt(br.readLine());
        switch(choice)
        {
            case 1:
                System.out.println("Enter the Number =");
                num=Integer.parseInt(br.readLine());
                if(num%2==0)
                {
                    System.err.println("Even Number");
                }
                else
                {
                    System.out.println("Odd Number");
                }
                break;
            case 2:
                System.out.println("Enter the Number =");
                num=Integer.parseInt(br.readLine());
                if(num>0)
                {
                    System.out.println("Positive Number");
                }
                else if(num<0)
                {
                    System.out.println("Negative Number");
                }
                else
                {
                    System.out.println("Zero Number");
                }
                break;
            case 3:
                System.err.println("Enter the Number =");
                num=Integer.parseInt(br.readLine());
                sqr=num*num;
                System.out.println("Square of the Number ="+sqr);
                break;
            case 4:
                System.err.println("EXIT");
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
