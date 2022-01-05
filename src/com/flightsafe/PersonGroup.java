package com.flightsafe;

import java.util.ArrayList;
public class PersonGroup{
	
	private ArrayList<Person> persons;
	private String name;
	
	public PersonGroup() {
		this.persons = new ArrayList<Person>();
	}
	
	public void addPerson(Person person) {
		this.persons.add(person);
	}
	
	public void removePerson(int index) {
		this.persons.remove(index);
	}
	
	public ArrayList<Person> getPersons() {
		return this.persons;
	}
	
	public void setPersons(ArrayList<Person> persons) {
		this.persons = persons;
	}
	
	public Person getPerson(int index) {
		return persons.get(index);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int size() {
		return persons.size();
	}
	
	public void addPersonGroup(PersonGroup personGroup) {
		this.persons.addAll(personGroup.getPersons());
	}

}
