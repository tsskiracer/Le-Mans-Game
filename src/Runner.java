import java.util.*;

public class Runner
	{

		public static void main(String[] args)
			{
			Scanner davisIsAJerk = new Scanner(System.in);
			System.out.println("Hello and Welcome to the Game of Le Mans.");
			System.out.println("How many players will be playing today?");
			int numPlayers=davisIsAJerk.nextInt();
			System.out.println();
			System.out.println("And how many laps would you like to do?");
			int numLaps=davisIsAJerk.nextInt();
			System.out.println();
			String cars[]=new String[6];
			cars[0]="Porsche 919 Hybrid";
			cars[1]="Porsche 911 GTLM";
			cars[2]="Porsche 917k";
			cars[3]="Formula 1";
			cars[4]="Nissan DeltaWing";
			cars[5]="Dallara IndyCar";
			for (int i=0; i<cars.length; i++)
				{
				System.out.println("What car would player " + i+1 + " like to drive?");
				}
			}

	}
