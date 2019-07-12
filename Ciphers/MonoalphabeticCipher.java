import java.util.Scanner;

public class MonoalphabeticCipher {
    public static char letters[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' '};
    public static char map[] = {'B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','W','X','Y','Z','A',' '};

     public static String doEncryption(String s)
    {
        char result[] = new char[(s.length())];
        for (int i = 0; i < s.length(); i++)
        {
            for (int j = 0; j < 26; j++)
            {
                if (letters[j] == s.charAt(i))
                {
                    result[i] = map[j];
                    break;
                }
            }
        }
        return (new String(result));
    }
 
    public static String doDecryption(String s)
    {
        char result[] = new char[(s.length())];
        for (int i = 0; i < s.length(); i++)
        {
            for (int j = 0; j < 26; j++)
            {
                if (map[j] == s.charAt(i))
                {
                    result[i] = letters[j];
                    break;
                }
            }
        }
        return (new String(result));
    }
 
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter the message: ");
            String en = doEncryption(sc.nextLine().toLowerCase());
            System.out.println("Encrypted message: " + en);
            System.out.println("Decrypted message: " + doDecryption(en)); 
        }
    }
}
