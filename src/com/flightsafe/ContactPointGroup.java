package com.flightsafe;

import java.util.ArrayList;

public class ContactPointGroup {
	
	private ArrayList<ContactPoint> contactPoints;
	private String name;
	
	public ContactPointGroup() {
		this.contactPoints = new ArrayList<ContactPoint>();
	}
	
	public void addContactPoint(ContactPoint contactPoint) {
		this.contactPoints.add(contactPoint);
	}
	
	public ArrayList<ContactPoint> getContactPoints() {
		return this.contactPoints;
	}
	
	public void setContactPoints(ArrayList<ContactPoint> contactPoints) {
		this.contactPoints = contactPoints;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int size() {
		return contactPoints.size();
	}
	
	public ContactPoint getContactPoint(int index) {
		return contactPoints.get(index);
	}
	
	public void setContactPoint(int index, ContactPoint contactPoint) {
		contactPoints.set(index, contactPoint);
	}
	
	public void addContactPointGroup(ContactPointGroup contactPointGroup) {
		this.contactPoints.addAll(contactPointGroup.getContactPoints());
	}

}
