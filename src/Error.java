import java.util.Scanner;

public class Error
	{
		protected String sAnswer;
		
		
		public static void error()
			{
				Scanner davisIsAJerk = new Scanner(System.in);
				int userInput=davisIsAJerk.nextInt();
				int[] iAnswer=new int[4];
				int counter=0;
				for (int i=0; i<iAnswer.length; i++)
					{
						if (userInput==iAnswer[i])
							{
								counter++;
							}
					}
				if(counter==0)
					{
						System.out.println("Please choose a valid answer");
					}
				else 
					{
						
					}
			}
	}
