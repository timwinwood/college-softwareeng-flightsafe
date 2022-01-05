package com.flightsafe;

import java.util.ArrayList;

public class ContactPointGroupSequence {
	
	
	private ArrayList<ContactPointGroup> contactPointGroups;
	private String name;
	
	public ContactPointGroupSequence() {
		this.contactPointGroups = new ArrayList<ContactPointGroup>();
	}
	
	public void addContactPointGroup(ContactPointGroup contactPointGroup) {
		this.contactPointGroups.add(contactPointGroup);
	}
	
	public  ArrayList<ContactPointGroup> getContactPointGroups() {
		return this.contactPointGroups;
	}
	
	public void setContactPointGroups(ArrayList<ContactPointGroup> contactPointGroups) {
		this.contactPointGroups = contactPointGroups;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int size() {
		return contactPointGroups.size();
	}
	
	public ContactPointGroup getContactPointGroup(int index) {
		return contactPointGroups.get(index);
	}
	
	public void setContactPointGroup(int index, ContactPointGroup contactPointGroup) {
		contactPointGroups.set(index, contactPointGroup);
	}

}
