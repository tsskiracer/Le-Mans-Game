import java.util.Scanner;

public class p917k
	{
		static String vUp1="";
		static String vUp2="";
		static String vUp3="";
		static String vUp4="";
		static int speed=1;
		static String circuit="S Class Le Mans";
		static double fuel=120.0;
		static int tireWear=100;
		static int counter=0;
		public static void getUpgrades()
			{
				Upgrades.fillList();
				vUp1+=Upgrades.upgrades.get(2).getName();
				vUp2+=Upgrades.upgrades.get(4).getName();
				vUp3+=Upgrades.upgrades.get(5).getName();
				vUp4+=Upgrades.upgrades.get(6).getName();
			}
		public static void upgrades()
			{
			String answer="";	
			int counter=0;
			getUpgrades();
				do
					{
						Scanner davisIsAJerk = new Scanner(System.in);
						
						System.out.println("You are available for an uprgrade! Would you like to upgrade ");
						System.out.println("the " + vUp1 + ", the " + vUp2 + ", the " + vUp3 + ", or the " + vUp4 + "?");
						System.out.println("Please type either a 1, 2, 3, or a 4 respectively to choose your upgrade.");
						
						int userInput=davisIsAJerk.nextInt();
						int[] iAnswer=new int[4];
						iAnswer[0]=1;
						iAnswer[1]=2;
						iAnswer[2]=3;
						iAnswer[3]=4;
						
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
								counter++;
								if (userInput==1)
									{
										answer+=vUp1;
									}
								else if (userInput==2)
									{
										answer+=vUp2;
									}
								else if (userInput==3)
									{
										answer+=vUp3;
									}
								else
									{
										answer+=vUp4;
									}
								System.out.println("You chose " + answer + ".");
							}
					}while(counter==0);
				int randPower=(((int)(Math.random()*20)+1));
				System.out.println("Your upgrade gained you " + randPower + " speed.");
				speed+=randPower;
				System.out.println("Your car now has " + speed + " speed.");
			}
	}
