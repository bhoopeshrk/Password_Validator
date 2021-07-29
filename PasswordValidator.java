import java.util.*;

public class PasswordValidator {
    public static void main(String args[]) {
        String s;
        char[] c = new char[20];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Password : ");
        s = sc.next();
        
        int len = s.length();

        c = s.toCharArray();
        
        int letter=0, digit=0, specialCase=0, upperCase=0;
        for (int i=0;i<len;i++)
        {
            if(Character.isLowerCase(c[i])==true)
            {
                if(letter == 0)
                {
                    letter++;
                }
            }
            else if(Character.isDigit(c[i])==true)
            {
                if(digit == 0)
                {
                    digit++;
                }
            }
            else if(c[i]=='!' || c[i]=='@' || c[i]=='#' || c[i]=='$' || c[i]=='%' || c[i]=='^' || c[i]=='&' || c[i]=='*' || c[i]=='-' || c[i]=='_')
            {
                if(specialCase == 0)
                {
                    specialCase++;
                }
            }
            else if(Character.isUpperCase(c[i])==true)
            {
                if(upperCase == 0)
                {
                    upperCase++;
                }
            }
        }
        int strength = letter+digit+specialCase+upperCase;
        if(len>=8 && len<=12)
        {
            if(strength==4)
            {
                System.out.println("Password strength : Strong");
            }
            else if(strength<4 && strength>1)
            {
                System.out.println("Password strength : Medium");
            }
            else
            {
                System.out.println("Password strength : Weak");
            }
        }
        else
        {
            System.out.println("Password length should be minimum 8 and maximum 12");
        }
    }
}