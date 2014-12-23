/* 
     Name:  Sean Staz
     Email:  ststasny@go.olemiss.edu
     Current Date:  6/28/13
     Sources Consulted: None. 
     
     Honor Code Statement: In keeping with the honor code policies of the University of Mississippi, the School of Engineering, and the Department of Computer and Information Science, I affirm that I have neither given nor received assistance on this programming assignment. This assignment represents my individual, original effort. 
                    ... My Signature is on File. 
*/ 

public class Owner 
{
	String name;
	String address;
	String city;
	String state;
	
	Owner()
	{
		name = "";
		address = "";
		city = "";
		state = "";
	}
	
	Owner(String n, String a, String c, String s)
	{
		setName(n);
		setCity(c);
		setAddress(a);
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public void setAddress(String a)
	{
		address = a;
	}
	
	public void setCity(String c)
	{
		city = c;
	}
	
	public void setState(String s)
	{
		state = s;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public String getState()
	{
		return state;
	}
	
	public String toString()
	{
		String str;
		
		str = "Name: " + name + " Address: " + address + " City: " + city + " State: " + state;
		
		return str;
	}
}
