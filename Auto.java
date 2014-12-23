/* 
     Name:  Sean Staz
     Email:  ststasny@go.olemiss.edu
     Current Date:  6/28/13
     Sources Consulted: None. 
     
     Honor Code Statement: In keeping with the honor code policies of the University of Mississippi, the School of Engineering, and the Department of Computer and Information Science, I affirm that I have neither given nor received assistance on this programming assignment. This assignment represents my individual, original effort. 
                    ... My Signature is on File. 
*/ 

public class Auto extends Policy
{
	int vin;
	String make;
	int year;
	String model;
	Owner owner;
	int numOfAccidents;
	double autoYPA;
	int ageOfCar;
	
	public Auto()
	{
		owner = new Owner();
		vin = 0;
		make = "";
		year = 0;
		model = "";
		numOfAccidents = 0;
	}
	
	public Auto(int v, String mak, int y, String mod, int n)
	{
		setVin(v);
		setMake(mak);
		setYear(y);
		setModel(mod);
		setNumOfAccidents(n);
	}
	
	public void setVin(int v)
	{
		vin = v;
	}
	
	public void setMake(String mak)
	{
		make = mak;
	}
	
	public void setModel(String mod)
	{
		model = mod;
	}
	
	public void setYear(int y)
	{
		year = y;
	}
	
	public void setNumOfAccidents(int n)
	{
		numOfAccidents = n;
	}
	
	public int getNumOfAccidents()
	{
		return numOfAccidents;
	}
	
	public String getModel()
	{
		return model;
	}
	
	public int getVin()
	{
		return vin;
	}
	
	public String getMake()
	{
		return make;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public void output()
	{
		System.out.println("Policy Number: " + num);
		System.out.println("Date: " + date);
		System.out.println("Yearly Premium Amount:" + ypa);
		System.out.println("VIN: " + vin);
		System.out.println("Make: " + make);
		System.out.println("Year:" + year);
		System.out.println("Model: "+ model);
		System.out.println("Number of Accidents: " + num);
		System.out.println("");
	}
	
	public void calculateMonthly(int year)
	{
		autoYPA = ypa / 12;
		ageOfCar = 2013 - year;
		
		if(numOfAccidents == 0 && ageOfCar >= 6)
		{
			ypa -= 300.00;
			autoYPA /= 12;
		}
		
		else if (numOfAccidents == 0)
		{
			ypa -= 200.00;
			autoYPA /= 12;
		}
		
		else if(ageOfCar >=6)
		{
			ypa -= 100.00;
			autoYPA /= 12;
		}
		
		System.out.println("The monthly premium is: " + autoYPA);
	}
}
