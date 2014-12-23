/* 
     Name:  Sean Staz
     Email:  ststasny@go.olemiss.edu
     Current Date:  6/28/13
     Sources Consulted: None. 
     
     Honor Code Statement: In keeping with the honor code policies of the University of Mississippi, the School of Engineering, and the Department of Computer and Information Science, I affirm that I have neither given nor received assistance on this programming assignment. This assignment represents my individual, original effort. 
                    ... My Signature is on File. 
*/ 

import java.util.ArrayList;

public class Driver 
{

	public static void main(String[] args)
	{
		ArrayList<Policy> policy = new ArrayList<Policy>(6);
				
		Policy policy1 = new Auto(1234, "Dodge", 2005, "Ram", 0);
		Policy policy2 = new Property(1200, 1986, true, true);
		Policy policy3 = new Policy(132, "7/13/13", 1800.99);
		Policy policy4 = new Auto(1345, "Dodge", 2011, "Charger", 2);
		Policy policy5 = new Property(6000, 1888, false, true);
		Policy policy6 = new Policy(154, "6/12/13", 2000.99);
		
		policy1.calculateMonthly();
		policy2.calculateMonthly();
		policy3.calculateMonthly();
		policy4.calculateMonthly();
		policy5.calculateMonthly();
		policy6.calculateMonthly();
		
		policy1.output();
		policy2.output();
		policy3.output();
		policy4.output();
		policy5.output();
		policy6.output();
	}
}
