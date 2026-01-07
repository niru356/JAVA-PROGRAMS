import java.io.*;
public class SwitchDemo
{
    public static void main(String args[])throws IOException
    {
        int num,choice,i,fact=1;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Number =");
        num=Integer.parseInt(br.readLine());
        System.out.println("**** MENU ****");
        System.out.println("1: Square of No");
        System.out.println("2: Cube of a No");
        System.out.println("3: Factorial of a no");
        System.out.println("4: Exit");
        System.out.println("Enter your choice =");
        choice=Integer.parseInt(br.readLine());
        switch(choice)
        {
            case 1:
                System.out.println("Square of the number is="+(num*num));
                break;
            case 2:
                System.out.println("Cube of the Number is ="+(num*num*num));
                break;
            case 3:
                for(i=1;i<=num;i++)
                {
                    fact=fact*i;
                }
                System.out.println("Factorial of the Number ="+fact);
                break;
            case 4:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }

    }
}
