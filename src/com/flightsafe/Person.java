package com.flightsafe;

import java.util.ArrayList;

public class Person {
	
	
	private String name;
	private ArrayList<PersonRestrictor> personRestrictors;
	
	public Person() {
		this.personRestrictors = new ArrayList<PersonRestrictor>();
	}
	
	public void addRestrictor(PersonRestrictor personRestrictor) {
		this.personRestrictors.add(personRestrictor);
	}
	
	public void removeRestrictor(int index) {
		this.personRestrictors.remove(index);
	}
	
	public ArrayList<PersonRestrictor> getRestrictors() {
		return this.personRestrictors;
	}
	
	public void setRestrictors(ArrayList<PersonRestrictor> personRestrictors) {
		this.personRestrictors = personRestrictors;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
