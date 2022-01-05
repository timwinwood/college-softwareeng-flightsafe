package com.flightsafe;

public class Restriction {


	private PersonRestrictor personRestrictor;
	private ContactPointRestrictor contactPointRestrictor;
	private String name;
	
	public Restriction(PersonRestrictor personRestrictor, ContactPointRestrictor contactPointRestrictor) {
		this.personRestrictor = personRestrictor;
		this.contactPointRestrictor = contactPointRestrictor;
	}

	public PersonRestrictor getPersonRestrictor() {
		return personRestrictor;
	}

	public void setPersonRestrictor(PersonRestrictor personRestrictor) {
		this.personRestrictor = personRestrictor;
	}

	public ContactPointRestrictor getContactPointRestrictor() {
		return contactPointRestrictor;
	}

	public void setContactPointRestrictor(ContactPointRestrictor contactPointRestrictor) {
		this.contactPointRestrictor = contactPointRestrictor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		}
	
	
}
