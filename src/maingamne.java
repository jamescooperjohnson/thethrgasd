import java.util.Scanner;

public abstract class maingamne extends main
{
	public static final String game = null;

	
	public static void Game()

		{
			sr.mono();
			boolean stillroll = true;
			
			int roll = (int) ((Math.random()*10)+2);
			int cash = 1500;
			while(stillroll)
				{

					System.out.println("Please type 'roll' to roll your dice" );

					Scanner userInput3 = new Scanner (System.in);

					String userDraw = userInput3.nextLine();

					if (userDraw.equals("roll") || userDraw.equals("Roll") || userDraw.equals("ROLL"))

						{
							sr.comic.get(roll).info();
						
							stillroll = false;
						}

					else
						{
							System.out.println();
							stillroll = true;

						}
				}
		}


}
	