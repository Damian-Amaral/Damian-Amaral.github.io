/*
 * Damian Amaral
 */
import java.util.Scanner;


public class ChooseAdventure {
	Scanner stringReader = new Scanner (System.in);
	Scanner numberReader = new Scanner (System.in);
	
	public ChooseAdventure() {
		System.out.println("You enter a tavern and hear word of a Gold Key that can open any chest...");
		System.out.println("Tavernkeeper: Welcome traveler! Take a seat, would you like a drink?");
		System.out.println("'yes' or 'no'");
		String choice = stringReader.nextLine();
		if( choice.equals("yes") ) {
			SayingYes();
		}
		if (choice.equals("no") ) {
			SayingNo();
			//This starts the branch of the story and puts yes and no in a class 
		}
	}
	
	public void SayingYes() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Tavernkeeper: Do you want 'water' or 'milk'?");
		System.out.print("Choose: 'water' or 'milk'");
		String SayingYes = stringReader.nextLine();
		if( SayingYes.equals("water") ) {
			System.out.println("Tavernkeeper: That would be 5 gold coins traveler!");
			System.out.print(" You look into your pocket and realize you only have 9 gold coins, how many gold coins do you want to give him");
			
			
	int var1 = scanner.nextInt();
				
		
			if(var1>= 5) {
				//You must give 5 gold coins or more, if not and else statement starts and kicks you out the bar 
				System.out.println("You get your water");
				
				System.out.println("Tavernkeeper: Well are you gonna drink ya water?");
				System.out.println("'yes' or 'no'");

				
				String choice = stringReader.nextLine();
				if(choice.equals("yes") ) {
					System.out.println("You feel great and hydrated");
					System.out.println("Would you like to tip him?");
					System.out.print("'yes' or 'no'yes");

					String yup = stringReader.nextLine();
					
					if( yup.equals("yes") ) {
						
						System.out.println("How much will you like to tip him");
						
						int var2 = scanner.nextInt();

						
						System.out.println("Tavernkeeper: Thank you traveler! Here take this!");
						System.out.println("You aquired the Gold Key!");
						System.exit(0);
						//If you tip the Tavernkeeper this is one out of two endings where you get the Gold Key

						
					}

					if (yup.equals("no") ) {
						System.out.println("You leave the tavern and you see the tavernkeeper give you a dirty look");
						System.exit(0);
					}
					
				
				
					if(choice.equals("no") ) {
						System.out.println("You leave the tavern and you see the tavernkeeper give you a dirty look");
						System.exit(0);

						
					
					}
					
				
				}
			
			}
			
			else {
				System.out.println("Tavernkeeper: This aint enough money! Get out of my bar!");
				System.exit(0);
			}
			
		}
			{
		if(SayingYes.equals("milk") ) 
			System.out.println("Tavernkeeper: We are all out of Milk traveler, sorry!");
			System.exit(0);
			}
		
	}
	
	public void SayingNo() {
		System.out.println("Tavernkeeper: Why did you come here then traveler?");
		//This is the start of the other class of saying no, the second branch from the start of the story
		
		System.out.println("'fight!' or 'leave' or 'use the bathroom'");
		String choice = stringReader.nextLine();
		if( choice.equals("fight!") ) {
			System.out.println("You have a 50 precent chance of winning the fight!");
			System.out.print("Do you wish to continue?");
			System.out.println("'yes' or 'no'");
			String choose = stringReader.nextLine();
			if(choose.equals("yes"));{
				Scanner keyboard = new Scanner (System.in);
				int number;
				String result;
				number = (int)(Math.random()*2);
				if (number == 0) {
					result = "You won the fight! You look over the tavernkeeper and notice the Gold Key to open any chest! You take the Gold Key!";
					//If you win the fight you get the second ending where you could get the Gold Key
				}
				else {
					result = "you lost the fight!";
			
				}
				System.out.println(result);
				System.exit(0);
			//This uses a 50/50 chance to either let you win the fight or lose the fight 
			}
		
			if(choose.equals("no")){
				System.out.println("you chose not to fight, you leave the tavern");
				System.exit(0);

			}
	

		}
		if (choice.equals("leave") ) {
			System.out.println("You decide to just walk out awkwardly");
			System.exit(0);
		}
		if (choice.equals("use the bathroom") ) {
			System.out.println("You use the bathroom and feel relieved");
			System.exit(0);
			

		}


		
	}


	public static void main(String[] args) {
		new ChooseAdventure();

		

}


		
	
	}


