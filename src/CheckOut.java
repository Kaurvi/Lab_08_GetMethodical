import java.util.Scanner;

public class CheckOut
{public static void main(String[] args)
{
    Scanner in = new Scanner(System.in);
    double itemPrice =0;
    double totalCost =0;
    String moreItems = "Y/N";
   do {
       itemPrice = SafeInput.getRangedDouble (in, "Enter the price of item: "+ itemPrice,0.50,10 );
       totalCost += itemPrice;
   }while (SafeInput.getYNConfirm (in,"Do you have more items to add: "+moreItems ));
    System.out.printf ( "\nThe total cost is: $"+totalCost );
}
}
