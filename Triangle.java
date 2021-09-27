/*
 * Damian Amaral
 */

import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		System.out.println("Welcome to Triangle Maker! Enter the a number for the size of the triangle");
		//introduces the user to program
			Scanner in = new Scanner(System.in);
			int n;
			n= in.nextInt();
			//making the var n
			
			for(int i=1;i<=n;i++)
				
				{
				
				for(int j=1;j<=i;j++)
					

					
				{
					
			System.out.print("*");
			//This is drawing the first half of the triangle
			
				}
				
				System.out.println();
				
				}
			
			for(int i=n-1;i>=1;i--)
				
			{

				for(int j=1;j<=i;j++)
					

					{
					
					System.out.print("*");
					//this draws the second half of the triangle 
						}
				
				System.out.println();
				}
			
			
			}

}
//After this you should have full triangle complete

		   
	
	


