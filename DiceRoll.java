/*
 * Damian Amaral
 */
import java.util.Scanner;
import java.util.Random;

public class DiceRoll {
	public static void main(String[] args) {
		int number, ones=0, twos=0, threes=0, fours=0, fives=0, sixes=0;
		// allows us to count the amount of times we get these numbers on the die
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Die Roller, enter an ammount of times you want a 6 sided die to roll!");
		int rolls = in.nextInt();
		for (int i=0; i<rolls; i++) {
			Random r = new Random();
			int result =r.nextInt(6);
			//Rolls the die 0-5, giving us 6 numbers to land on
				if( result==0)
					ones++;
				else if ( result == 1)
					twos++;
				// The result of this roll,one, is being set to the value 2 when it adds them up at the end
				else if ( result == 2)
					threes++;
				else if ( result == 3)
					fours++;
				else if ( result == 4)
					fives++;
				else 
					sixes++;
				// This is counting the amount of times it rolls a specific number on a die roll
				
			result++;
			
			while (true) {
				if(i >= 0);	
				break;
			}
			

			
			System.out.println("You rolled a "+result);
			// This tells you each result that you roll
			
		}
			
			System.out.println("One:"+ones);
			System.out.println("Two:"+twos);
			System.out.println("Three:"+threes);
			System.out.println("Four:"+fours);
			System.out.println("Five:"+fives);
			System.out.println("Six:"+sixes);
			// this prints the results of how many of a certain number has been rolled
			
		}

	
}
	

