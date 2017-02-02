import java.util.Scanner;
public class gameRunner
{

	public static void main(String[] args)
		{
			Scanner userInput = new Scanner (System.in);

			System.out.println("What is your name?");	

			String name = userInput.nextLine();

			System.out.println("Hello " + name + ".");




			boolean stillGuessing = true;

			while(stillGuessing)

				{

					System.out.println("Would you like to play Monopoly?");

					Scanner userInput2 = new Scanner (System.in);

					String userGuess = userInput2.nextLine();

					if (userGuess.equals("yes") || userGuess.equals("yas") || userGuess.equals("yep") || userGuess.equals("Yes") || userGuess.equals("YES") || userGuess.equals("yeah"))
						{

							System.out.println("Welcome to Monopoly.");
							stillGuessing = false;
						}

					else if (userGuess.equals("no") || userGuess.equals("nah") || userGuess.equals("nope") || userGuess.equals("No") || userGuess.equals("NO"))
						{
							System.out.println("Goodbye.");
							stillGuessing = false;
							System.exit(0);
						}
					else
						{
							System.out.println("please enter yes or no.");
							stillGuessing = true;
						}


maingamne.Game();


				}
		}



}




		
			
			
			