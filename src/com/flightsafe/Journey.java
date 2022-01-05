package com.flightsafe;

import java.util.ArrayList;

public class Journey {

	private ContactPointGroup contactPointGroupRoute;
	private PersonGroup personGroup;
	private ContactPointGroupSequence contactPointGroupSequence;
	private RestrictionGroup restrictionGroup;
	
	
	boolean boolContactPointGroupBlocked = false;
	ContactPointGroup contactPointGroupBlockedOuter = new ContactPointGroup();
	PersonGroup  personGroupBlockedOuter = new PersonGroup();
	RestrictionGroup restrictionGroupBlockedOuter = new RestrictionGroup();

	private String name;
	
	public Journey(PersonGroup personGroup,ContactPointGroupSequence contactPointGroupSequence, RestrictionGroup restrictionGroup) {
		this.personGroup = personGroup;
		this.contactPointGroupSequence = contactPointGroupSequence;
		this.restrictionGroup = restrictionGroup;
		this.generateRoute();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public ContactPointGroup getContactPointGroupRoute() {
		return contactPointGroupRoute;
	}

	public void setContactPointGroupRoute(ContactPointGroup contactPointGroupRoute) {
		this.contactPointGroupRoute = contactPointGroupRoute;
		this.generateRoute();
	}

	public PersonGroup getPersonGroup() {
		return personGroup;
	}

	public void setPersonGroup(PersonGroup personGroup) {
		this.personGroup = personGroup;
		this.generateRoute();
	}

	public ContactPointGroupSequence getContactPointGroupSequence() {
		return contactPointGroupSequence;
	}

	public void setContactPointGroupSequence(ContactPointGroupSequence contactPointGroupSequence) {
		this.contactPointGroupSequence = contactPointGroupSequence;
		this.generateRoute();
	}

	public RestrictionGroup getRestrictionGroup() {
		return restrictionGroup;
	}

	public void setRestrictionGroup(RestrictionGroup restrictionGroup) {
		this.restrictionGroup = restrictionGroup;
		this.generateRoute();
	}
	
	public ContactPointGroup getRoute() {
		return contactPointGroupRoute;
	}
	
	public void printRoute() {
		
		if(boolContactPointGroupBlocked) {
			
			System.out.println("No Route available. The following Restrictions are Blocking your Route:");
			
			for(int i =0; i < restrictionGroupBlockedOuter.size(); i++) {
				
				Restriction restrictionBlocked = restrictionGroupBlockedOuter.getRestriction(i);
				PersonRestrictor personRestrictorBlocked = restrictionBlocked.getPersonRestrictor();
				ContactPointRestrictor contactPointRestrictorBlocked = restrictionBlocked.getContactPointRestrictor();
				Person personBlocked = personGroupBlockedOuter.getPerson(i);
				ContactPoint contactPointBlocked = contactPointGroupBlockedOuter.getContactPoint(i);
				
				System.out.println("Restriction: \"" + restrictionBlocked.getName() + "\"");
				System.out.println("Person: \"" + personBlocked.getName() + "\" with Restriction: \"" + personRestrictorBlocked.getName() + "\" is Restricted from Contact Point: \"" + contactPointBlocked.getName() + "\" with Restriction: \"" +  contactPointRestrictorBlocked.getName() + "\".");
				
				
			}
			
		
			
		}else {
			
			System.out.println("A Route is Available. Please use the following Route:");
			
		for(int i = 0; i < contactPointGroupRoute.size(); i++) {
				
				ContactPoint contactPoint = contactPointGroupRoute.getContactPoint(i);
				System.out.println("Contact Point " + i + ": " + contactPoint.getName());
				
			}
			
		}

		
	}
	
	public static boolean isAllTrue(boolean[] array)
	{
	    for(boolean b : array) if(!b) return false;
	    return true;
	}
	
	
	public void generateRoute() {
		this.contactPointGroupRoute = new ContactPointGroup();

		
		for(int i =0; i < contactPointGroupSequence.size(); i++) {

			ContactPointGroup contactPointGroup = contactPointGroupSequence.getContactPointGroup(i);
			
			boolean[] boolContactPointBlocked = new boolean[contactPointGroup.size()];
			ContactPointGroup contactPointGroupBlockedInner = new ContactPointGroup();
			PersonGroup  personGroupBlockedInner = new PersonGroup();
			RestrictionGroup restrictionGroupBlockedInner = new RestrictionGroup();
			
			for (int j = 0; j < contactPointGroup.size(); j++) {
				
				ContactPoint contactPoint = contactPointGroup.getContactPoint(j);
				ArrayList<ContactPointRestrictor> contactPointRestrictors = contactPoint.getRestrictors();
	
				
				for (int k = 0; k < personGroup.size(); k++) {
					Person person = personGroup.getPerson(k);
					ArrayList<PersonRestrictor> personRestrictors = person.getRestrictors();
					
					for(int x = 0; x < restrictionGroup.size(); x++) {
						Restriction restriction = restrictionGroup.getRestriction(x);
						ContactPointRestrictor restrictionContactPointRestrictor = restriction.getContactPointRestrictor();
						PersonRestrictor restrictionPersonRestrictor = restriction.getPersonRestrictor();

						for(int y = 0; y < contactPointRestrictors.size(); y++ ) {
							ContactPointRestrictor contactPointRestrictor = contactPointRestrictors.get(y);
							
							for(int z = 0; z < personRestrictors.size(); z++) {
								PersonRestrictor personRestrictor = personRestrictors.get(z);
								
								if((restrictionContactPointRestrictor == contactPointRestrictor) && (restrictionPersonRestrictor == personRestrictor)) {
									restrictionGroupBlockedInner.addRestriction(restriction);
									contactPointGroupBlockedInner.addContactPoint(contactPoint);
									personGroupBlockedInner.addPerson(person);
									boolContactPointBlocked[j] = true;
								}
								
							}
						}
					}
					
				}
	
			}

			
			if(isAllTrue(boolContactPointBlocked)) {
				boolContactPointGroupBlocked = true;
				contactPointGroupBlockedOuter.addContactPointGroup(contactPointGroupBlockedInner);
				personGroupBlockedOuter.addPersonGroup(personGroupBlockedInner);
				restrictionGroupBlockedOuter.addRestrictionGroup(restrictionGroupBlockedInner);

			}

		}

		
	}

}
