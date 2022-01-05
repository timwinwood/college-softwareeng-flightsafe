package com.flightsafe;

import java.util.ArrayList;

public class ContactPoint {
	
	private String name;
	private ArrayList<ContactPointRestrictor> contactPointRestrictors;
	
	public ContactPoint() {
		this.contactPointRestrictors = new ArrayList<ContactPointRestrictor>();
	}
	
	public void addRestrictor(ContactPointRestrictor contactPointRestrictor) {
		this.contactPointRestrictors.add(contactPointRestrictor);
	}
	
	public void removeRestrictor(int index) {
		this.contactPointRestrictors.remove(index);
	}
	
	public ArrayList<ContactPointRestrictor> getRestrictors() {
		return this.contactPointRestrictors;
	}
	
	public void setRestrictors(ArrayList<ContactPointRestrictor> contactPointRestrictors) {
		this.contactPointRestrictors = contactPointRestrictors;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
