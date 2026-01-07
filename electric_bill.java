import java.io.*;

public class electric_bill {
    public static void main(String args[])throws IOException
    {
        int units;
        float amt,total_amt,sur_charge=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of Units consumed =");
        units=Integer.parseInt(br.readLine());
        if(units<=50)
        {
            amt=0.50f*units;
        }
        else if(units<=150)
        {
            amt=25+0.75f*(units-50);
        }
        else if(units<=250)
        {
            amt=100+1.20f*(units-150);
        }
        else
        {
            amt=220+1.50f*(units-250);
        }
        sur_charge=0.20f*amt;
        total_amt=amt+sur_charge;
        System.out.println("Electricity Bill ="+total_amt);
    }
}