import java.io.*;

public class vowel {
    public static void main(String args[])throws IOException
    {
        char ch;
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter the Character =");
        ch=(char)br.read();
        if(ch=='a' || ch == 'e' || ch == 'i' || ch == 'o' ||ch == 'u' || ch=='A' || ch == 'E' || ch == 'I' || ch == 'O'|| ch == 'U')
        {
            System.out.println(ch+"is a Vowel");
        }
        else
        {
            System.out.println(ch+"is a consonant");
        }
    }
}

