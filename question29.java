public class question29 {
    public static void main(String args[])
    {
        int basic=12000;
        double HRA,DA,PF,Gross,Net;
        HRA=(15*basic)/100;
        DA=(110*basic)/100;
        PF=(12*basic)/100;
        Gross=basic+HRA+DA;
        Net=Gross-PF;
        System.out.println("Gross Salary ="+Gross);
        System.out.println("Net Salary ="+Net);

    }
}
