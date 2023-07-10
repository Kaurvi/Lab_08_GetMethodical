import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int favInt =0;
        double favDoubleNum =0;
        favInt = SafeInput.getInt (in, "Enter your favourite integer" );
        System.out.println ("\nYour Favourite Integer is: "+ favInt);

        favDoubleNum = SafeInput.getDouble (in,"Enter your favourite double number" );
        System.out.println ("\nYour Favourite Double number is: "+ favDoubleNum);
    }
}