import java.io.*;
public class Atm 
{
    public static void main(String args[])throws IOException
    {
        int balance,withdraw,deposit,choice;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Intial Balance =");
        balance=Integer.parseInt(br.readLine());
        System.out.println("**** ATM MENU ****");
        System.out.println("1: Withdraw Amount");
        System.out.println("2: Deposit Amount");
        System.out.println("3: Check Balance");
        System.out.println("4: Exit");
        System.out.println("Enter Your Choice =");
        choice=Integer.parseInt(br.readLine());
        switch(choice)
        {
            case 1:
                System.out.println("Enter the amount to withdraw =");
                withdraw=Integer.parseInt(br.readLine());
                if(withdraw>balance)
                {
                    System.out.println("Insufficient Balance");
                }
                else
                {
                    balance=balance-withdraw;
                    System.out.println("Please collect your cash");
                    System.out.println("Updated Balance ="+balance);
                }
                break;
            case 2:
                System.out.println("Enter the amount to deposit =");
                deposit=Integer.parseInt(br.readLine());
                balance=balance+deposit;
                System.out.println("Amount Deposited Successfully");
                System.out.println("Updated Balance ="+balance);
                break;
            case 3:
                System.out.println("Current Balance ="+balance);
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

