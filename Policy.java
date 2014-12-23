/* 
     Name:  Sean Staz
     Email:  ststasny@go.olemiss.edu
     Current Date:  6/28/13
     Sources Consulted: None. 
     
     Honor Code Statement: In keeping with the honor code policies of the University of Mississippi, the School of Engineering, and the Department of Computer and Information Science, I affirm that I have neither given nor received assistance on this programming assignment. This assignment represents my individual, original effort. 
                    ... My Signature is on File. 
*/ 

public class Policy 
{
	public int num;
	public String date;
	public double ypa;
	public double basic;
	public double propYPA;
	public double homeYPA;
	public double basicMonthlyPremium;
	public boolean fireStation;
	
	public Policy()
	{
		num = 0;
		date = "";
		ypa = 0.0;
	}
	
	public Policy(int n, String d, double y)
	{
		setNum(n);
		setDate(d);
		setYpa(y);
	}
	
	public void setNum(int n)
	{
		num = n;
	}
	
	public void setDate(String d)
	{
		date = d;
	}
	
	public void setYpa(double y)
	{
		ypa = y;
	}
	
	public int getNum()
	{
		return num;
	}
	
	public String getDate()
	{
		return date;
	}
	
	public double getYpa()
	{
		return ypa;
	}
	
	public void output()
	{
		System.out.println("Policy Number: " + num);
		System.out.println("Date: " + date);
		System.out.println("Yearly Premium Amount:" + ypa);
		System.out.println("");
	}
	
	public void calculateMonthly()
	{
		System.out.println("The monthly premium for the policy is: " + ypa /12);
		System.out.println("");
	}
}
