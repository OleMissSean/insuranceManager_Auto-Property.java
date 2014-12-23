CSci112.Project3.java
=====================

Programming Project #3 for CSci 112.

CSCI 112: Programming project 3

Due Date: July 15’th by 11:59 pm 

Dinosaur, an insurance company, sells the following types of insurance policies:
Auto Insurance and Property Insurance 

You will create a java inheritance hierarchy presenting the above. 
*Policies have a policy number, policy date, and a yearly premium amount. 
*Auto policies have attributes of vehicle identification number, make, model and year, a policy owner object, number of accidents incurred by policy owner, and age of the vehicle (this should be calculated not inputted).
*Property insurance policies have attributes of square footage of property, year built, a policy owner object, a flag indicating whether the property is within 4 miles of a fire station and a flag indicating if the property is in a gated community. 
*The policy owner attributes are name, address, city and state.

*Your driver should test the polymorphic behavior of super class references by including an array of 6 super class references that refer to different kinds of policies. Your driver should iterate through the array to display all of the policy information with identifying labels as well as the monthly premium amount.

In addition to the standard accessors and mutators, your project should have two methods in the super class that are overridden in the derived class as follows:
A writeOutput method that displays the class’s attributes
A calculateMonthlyPremium method that performs the following calculations:
-Basic monthly premium in the super class is yearly premium divided by 12. 
-Property insurance yearly premium equals basic yearly premium minus a discount of 200.00 if the property is within 4 miles of a fire station and a discount of 100.00 if the property is in a gated community. The monthly premium would be the total yearly premium minus any discounts divided by 12.
-Auto policies yearly premium equals basic yearly premium minus 200.00 for no accidents and minus 100.00 if car is older than 6 years. The monthly premium would be the total yearly premium minus any discount divided by 12.

Your project should be developed and tested incrementally as follows:
	Create the UML diagram of the project in Lab
Create and test the policy owner class
Create and test the super class
Create and test each of the derived classes


*No late programs will be accepted. If your program does not compile, it will not receive any credit. If you need help, come see me during my office hours, make an appointment with me, or speak to a TA in the labs on Sun – Thur from 5 – 8 pm.
