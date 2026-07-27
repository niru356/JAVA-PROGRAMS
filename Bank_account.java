import java.util.*;
class Bank_Account
{
    int Acc_no;
    String Acc_holder;
    double balance;
    void deposit()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Account number =");
        Acc_no=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Account holder =");
        Acc_holder=sc.nextLine();
        System.out.println("Enter the Account Balance =");
        balance=sc.nextInt();
    }
    void withdraw()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to be withdraw =");
        double with=sc.nextInt();
        balance=balance-with;
    }
    void Display_balance()
    {
        System.out.println("Balance left ="+balance);
    }
    public static void main(String args[])
    {
        Bank_Account obj = new Bank_Account();
        obj.deposit();
        obj.withdraw();
        obj.Display_balance();
    }
}