import java.util.Scanner;

public class Reggie {
public static void main(String[] args)
{
    Scanner in = new Scanner ( System.in );
    String SSN ="";
    String mNum ="";
    String menu ="";
     SSN = SafeInput.getRegExString (in,"Enter Your Social Security Number","\\d{3}-\\d{2}-\\d{4}" );
     mNum = SafeInput.getRegExString (in,"Enter Your UC Student M Number","(M|m)\\d{5}" );
     menu = SafeInput.getRegExString (in,"Enter your menu choice","[OoSsVvQq]" );
    System.out.println ("Your Social Security Number is: "+SSN);
    System.out.println ("Your UC Student M Number is: "+mNum);
    System.out.println ("Your menu choice is :" +menu);
}
}