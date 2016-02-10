import java.util.ArrayList; 

public class Upgrades
	{
		private String name;
		private int pUpgrade1;
		private int pUpgrade2;
		private int pUpgrade3;
		private int pUpgrade4;
		private int pNum1;
		private int pNum2;
		private int pNum3;
		private int pNum4;
		
		static ArrayList<Upgrades> upgrades = new ArrayList<Upgrades>();
		public Upgrades (String n, int pU1, int pU2, int pU3, int pU4, int pN1, int pN2, int pN3, int pN4)
		{
			name=n;
			pUpgrade1=pU1;
			pUpgrade2=pU2;
			pUpgrade3=pU3;
			pUpgrade4=pU4; 
			pNum1=pN1;
			pNum2=pN2;
			pNum3=pN3;
			pNum4=pN4;
		}
		public String getName()
			{
				return name;
			}
		public void setName(String name)
			{
				this.name = name;
			}
		public int getpUpgrade1()
			{
				return pUpgrade1;
			}
		public void setpUpgrade1(int pUpgrade1)
			{
				this.pUpgrade1 = pUpgrade1;
			}
		public int getpUpgrade2()
			{
				return pUpgrade2;
			}
		public void setpUpgrade2(int pUpgrade2)
			{
				this.pUpgrade2 = pUpgrade2;
			}
		public int getpUpgrade3()
			{
				return pUpgrade3;
			}
		public void setpUpgrade3(int pUpgrade3)
			{
				this.pUpgrade3 = pUpgrade3;
			}
		public int getpUpgrade4()
			{
				return pUpgrade4;
			}
		public void setpUpgrade4(int pUpgrade4)
			{
				this.pUpgrade4 = pUpgrade4;
			}
		public int getpNum1()
			{
				return pNum1;
			}
		public void setpNum1(int pNum1)
			{
				this.pNum1 = pNum1;
			}
		public int getpNum2()
			{
				return pNum2;
			}
		public void setpNum2(int pNum2)
			{
				this.pNum2 = pNum2;
			}
		public int getpNum3()
			{
				return pNum3;
			}
		public void setpNum3(int pNum3)
			{
				this.pNum3 = pNum3;
			}
		public int getpNum4()
			{
				return pNum4;
			}
		public void setpNum4(int pNum4)
			{
				this.pNum4 = pNum4;
			}
		
		public static void fillList()
		{
			upgrades.add(new Upgrades("Turbo", 3, 1, 5, 2, 15, 3, 14, 4));
			upgrades.add(new Upgrades("Hybrid System", 1, 1, 6, 2, 17, 3, 4, 4));
			upgrades.add(new Upgrades("Weight Reduction", 20, 1, 10, 2, 2, 3, 1, 4));
			upgrades.add(new Upgrades("KERS", 9, 1, 2, 2, 16, 3, 3, 4));
			upgrades.add(new Upgrades("Drag Reduction", 4, 1, 6, 2, 19, 3, 12, 4));
			upgrades.add(new Upgrades("Suspension", 3, 1, 7, 2, 1, 3, 14, 4));
			upgrades.add(new Upgrades("Downforce Increase", 3, 1, 7, 2, 1, 3, 14, 4));
			
		}
	}
