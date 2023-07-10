import java.util.Scanner;

public class PrettyHeader
{
    public static void main(String[] args)
{
    Scanner in = new Scanner(System.in);
    String header ="";
    header = SafeInput.prettyHeader ( "HELLO!" );
    System.out.println ("Pretty Header is here !"+header);
}
}
