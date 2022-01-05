package com.flightsafe;


public class FlightSafeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Create Restriction Group X
		RestrictionGroup restrictionGroupX = new RestrictionGroup();
		restrictionGroupX.setName("Restriction Group X");
		
		//Create Restriction X and add to Restriction Group X
		PersonRestrictor personRestrictorX = new PersonRestrictor();
		personRestrictorX.setName("Person Restrictor X");
		
		ContactPointRestrictor contactPointRestrictorX = new ContactPointRestrictor();
		contactPointRestrictorX.setName("Contact Point Restrictor X");
		
		Restriction restrictionX = new Restriction(personRestrictorX,contactPointRestrictorX);
		restrictionX.setName("Restriction X");
		restrictionGroupX.addRestriction(restrictionX);
		
		//Create Person Group 1 - WITH a PersonRestrictor
		PersonGroup personGroup1 = new PersonGroup();
		personGroup1.setName("Person Group 1");

		Person person1_1 = new Person();
		person1_1.setName("Person 1_1");
		person1_1.addRestrictor(personRestrictorX);
		personGroup1.addPerson(person1_1);
		
		Person person1_2 = new Person();
		person1_2.setName("Person 1_2");
		personGroup1.addPerson(person1_2);

		//Create Person Group 2 - WITHOUT a PersonRestrictor
		PersonGroup personGroup2 = new PersonGroup();
		personGroup2.setName("Person Group 2");

		Person person2_1 = new Person();
		person2_1.setName("Person 2_1");
		personGroup2.addPerson(person2_1);
		
		Person person2_2 = new Person();
		person2_2.setName("Person 2_2");
		personGroup2.addPerson(person2_2);
		
		//Create Contact Point Group Sequence 1
		ContactPointGroupSequence contactPointGroupSequence1 = new ContactPointGroupSequence();
		
		
		//Create Contact Point Group 1 and add to Contact Point Group Sequence 1
		ContactPointGroup contactPointGroup1 = new ContactPointGroup();
		contactPointGroup1.setName("Contact Point Group 1");
		
		ContactPoint contactPoint1_1 = new ContactPoint();
		contactPoint1_1.setName("Contact Point 1_1");
		contactPointGroup1.addContactPoint(contactPoint1_1);
		
		ContactPoint contactPoint1_2 = new ContactPoint();
		contactPoint1_2.setName("Contact Point 1_2");
		contactPointGroup1.addContactPoint(contactPoint1_2);
		
		contactPointGroupSequence1.addContactPointGroup(contactPointGroup1);
				
		//Create Contact Point Group 2 and add to Contact Point Group Sequence 1
		ContactPointGroup contactPointGroup2 = new ContactPointGroup();
		contactPointGroup2.setName("Contact Point Group 2");
		
		ContactPoint contactPoint2_1 = new ContactPoint();
		contactPoint2_1.setName("Contact Point 2_1");
		contactPoint2_1.addRestrictor(contactPointRestrictorX);
		contactPointGroup2.addContactPoint(contactPoint2_1);
		
		
		ContactPoint contactPoint2_2 = new ContactPoint();
		contactPoint2_2.setName("Contact Point 2_2");
		contactPoint2_2.addRestrictor(contactPointRestrictorX);
		contactPointGroup2.addContactPoint(contactPoint2_2);
		
		contactPointGroupSequence1.addContactPointGroup(contactPointGroup2);
		
		//Create Contact Point Group 3 and add to Contact Point Group Sequence 1
		ContactPointGroup contactPointGroup3 = new ContactPointGroup();
		contactPointGroup3.setName("Contact Point Group 3");
		
		ContactPoint contactPoint3_1 = new ContactPoint();
		contactPoint3_1.setName("Contact Point 3_1");
		contactPointGroup3.addContactPoint(contactPoint3_1);
		
		ContactPoint contactPoint3_2 = new ContactPoint();
		contactPoint3_2.setName("Contact Point 3_2");
		contactPointGroup3.addContactPoint(contactPoint3_2);
		
		contactPointGroupSequence1.addContactPointGroup(contactPointGroup3);

		//Create Journey 1 - Person Group 1
		Journey journey1 = new Journey(personGroup1,contactPointGroupSequence1,restrictionGroupX);
		journey1.setName("Journey 1");
		
		//Print the Route
		journey1.printRoute();
		
		//Create Journey 2 - Person Group 2
		Journey journey2 = new Journey(personGroup2,contactPointGroupSequence1,restrictionGroupX);
		journey2.setName("Journey 2");
		
		//Print the Route
		journey2.printRoute();
	
	

	}

}
