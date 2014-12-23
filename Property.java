/*
Name: Sean Staz
Email: ststasny@go.olemiss.edu
Current Date: 6/28/13
Sources Consulted: None.
Honor Code Statement: In keeping with the honor code policies of the University of Mississippi, the School of Engineering, and the Department of Computer and Information Science, I affirm that I have neither given nor received assistance on this programming assignment. This assignment represents my individual, original effort.
... My Signature is on File.
*/ 

public class Property extends Policy
{
	Owner owner;
	int footage;
	int yearEst;
	boolean fireStation;
	boolean gated;
	double ypa;
	double newYPA;
	
		public Property()
		{
			owner = new Owner();
			footage = 0;
			yearEst = 0;
			fireStation = false;
			gated = false;
			
		}
		
		public Property(int foot, int y, boolean fire, boolean g)
		{
			owner = new Owner();
			setFootage(foot);
			setYearEst(y);
			setFireStation(fire);
			setGated(g);
		}
		
		public void setFootage(int f)
		{
			footage = f;
		}
	
		public void setYearEst(int y)
		{	
			yearEst = y;
		}
		
		public void setFireStation(boolean fire)
		{
			fireStation = fire;
		}
		
		public void setGated(boolean g)
		{
			gated = g;
		}
		
		public int getFootage()
		{
			return footage;
		}
		
		public int getYeatEst()
		{
			return yearEst;
		}
		
		public boolean getFireStation()
		{
			return fireStation;
		}
		
		public boolean getGated()
		{
			return gated;
		}
		
		public void output()
		{
			System.out.println("Policy Number: " + num);
			System.out.println("Date: " + date);
			System.out.println("Yearly Premium Amount:" + ypa);
			System.out.println("Footage: " + footage);
			System.out.println("Year Established: " + yearEst);
			System.out.println("Within 4 Miles of Firestation: " + fireStation);
			System.out.println("Located in a Gated Community: " + gated);
			System.out.println("");
		}
		
		public void calculateMonthly()
		{
			propYPA = ypa / 12;
			
			if(fireStation && gated)
			{			
				ypa -= 300.00;
				propYPA = ypa / 12;
			}
			else if (fireStation)
			{
				ypa -= 200.00;				
				propYPA = ypa / 12;
			}
			else if(gated)
			{
				ypa -= 100.00;
				propYPA = ypa / 12;
			}
			
			System.out.println("The monthly premium is: " + propYPA);
			System.out.println("");
		}
}
