import java.io.*;
public class vowels {
    public static void main(String args[])throws IOException
    {
        String str;
        int count=0,i,count1=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the String =");
        str=br.readLine();
        for(i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u' ||
                ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch == 'U')
            {
                count++;
            }
            else
            {
                count1++;
            }
        }
        System.out.println("Number of Vowels ="+count);
        System.out.println("Number of Consonants ="+count1);
    }
    
}
