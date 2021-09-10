/*
 * Written by Damian Amaral
 */
import java.util.*;
public class CoinMachineAD {
	public static final Scanner CONSOLE = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter a whole number from 1 to 99." + "\n" + "The machine will determine a combanation of coins ");
		// + "/n" + connects the phrase while putting it on the next line 
		double intialDollars = CONSOLE.nextDouble();
		int dollars = (int)(intialDollars);
		// This sets the value of the dollar
		
	int quartersOut = (dollars/25);
	//divide by 25 because of the value of a quarter
	int dimesOut = ((dollars%25)/10);
	//divide by 10 because of the value of a dime, it also takes the module of 25 so the left over of 25 converts to dimes
	int nicklesOut = (((dollars%25)%10)/5);
	int penniesOut = ((((dollars%25)%10)%5)/1);
	// Like said before this takes the left over from  quarters, dimes and nickels and puts it in pennies
	
			 System.out.println(quartersOut + " Quarters ");
			 System.out.println(dimesOut + " Dimes ");
			 System.out.println(nicklesOut + " Nickels ");
			 System.out.println(penniesOut + " Pennies ");
			 // prints quarters, dimes, nickels and pennies in order

	}
}