public class temperature
{
public static void main(String args[])
{
double far,celc,far2;
far=Double.parseDouble(args[0]);
celc=5.0*(far-32)/32.0;
far2=(celc*9.0/5.0)+32;
System.out.println("Degree in Celcius ="+celc);
System.out.println("Degree in Farenheit ="+far2);
}
}