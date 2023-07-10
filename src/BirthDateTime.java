import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args)
    {
        Scanner in = new Scanner ( System.in);
        int year=0;
        int month=0;
        int day=0;
        int hours=0;
        int min=0;
        year = SafeInput.getRangedInt (in,"Enter your birth year",1950, 2015 );
        month = SafeInput.getRangedInt (in,"Enter the month in which u born", 1,12);
        switch (month)
        {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            day = SafeInput.getRangedInt (in,"Enter the date of the month",1,31 );break;
            case 4: case 6: case 9: case 11:
            day = SafeInput.getRangedInt (in,"Enter the date of the month",1,30 );break;
            case 2:
            day = SafeInput.getRangedInt (in,"Enter the date of the month",1,29 );break;

        }
        hours = SafeInput.getRangedInt (in,"Enter the hours of birth",1,24);
        min = SafeInput.getRangedInt (in,"Enter the minutes of birth",1,59);
        System.out.println ("\nYour born in"+" " +year +" "+month +" "+ "on" +" "+ day +" "+ "at" +" "+ hours +"."+min);
    }
}
