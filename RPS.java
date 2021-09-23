/*
 * Damian Amaral
 */
import java.util.Random;
import java.util.Scanner;


public class RPS {
	
	public static void main(String[] args) {
		
	boolean playing = true;
	while(playing) {
				
		
int wins = 0; 
int games = 0;
int ties = 0;
System.out.println("\n");
System.out.println("\nIn this game you will be facing off against John the computer \n in a deadly battle of Rock Paper Scissors!");
while(games < 3) {
		



String[] rps = {"rock", "paper", "scissors"};
String JohnsMove= rps[new Random().nextInt(rps.length)];

Scanner scanner = new Scanner(System.in);
System.out.println("\nPlease enter your move (rock, paper, scissors)");
String playerMove = scanner.nextLine();

System.out.println("John: " + JohnsMove);

if(playerMove.equals(JohnsMove)) {
	System.out.println("The game is a tie!");
	ties++;
	System.out.print("No one has earned a point");

}
else if ( playerMove.equals("rock")) {
	if (JohnsMove.equals("paper")){
		System.out.println("You lost to John!");
		System.out.print("John has earned a point!");

		
	} else if (JohnsMove.equals("scissors")) {
		System.out.println("You beat John!");
		wins++;
		System.out.print("You have earned a point!");


	}
}

else if ( playerMove.equals("paper")) {
	if (JohnsMove.equals("rock")){
		System.out.println("You beat John!");
		wins++;
		System.out.print("You have earned a point!");

		
	} else if (JohnsMove.equals("scissors")) {
		System.out.println("You lost to John!");
		System.out.print("John has earned a point!");


	}
}

else if ( playerMove.equals("scissors")) {
	if (JohnsMove.equals("paper")){
		System.out.println("You beat John!");
		wins++;
		System.out.print("You have earned a point!");
		
	} else if (JohnsMove.equals("rock")) {
		System.out.println("You lost to John!");
		System.out.print("John has earned a point!");


	}
}
games++;
}
if ((wins == 1 && ties == 1) || (ties == 3)) {
	System.out.print("\nOverall: You have tied against John!");

	//you tie
}
else if(((wins == 2) || wins == 3) || (wins == 1 && ties == 2)) {
	System.out.print("\nOverall: You have Won against John!");

	//you win
}
else {
	System.out.print("\nOverall: You have lost to John!");

	//you lose
}

	}
	}


}