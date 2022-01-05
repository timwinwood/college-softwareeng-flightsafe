package com.flightsafe;

import java.util.ArrayList;

public class RestrictionGroup {
	
	private ArrayList<Restriction> restrictions;
	private String name;
	
	public RestrictionGroup() {
		this.restrictions = new ArrayList<Restriction>();
	}
	
	public void addRestriction(Restriction restriction) {
		this.restrictions.add(restriction);
	}
	
	public ArrayList<Restriction> getRestrictions() {
		return this.restrictions;
	}
	
	public void setRestrictions(ArrayList<Restriction> restrictions) {
		this.restrictions = restrictions;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int size() {
		return restrictions.size();
	}
	
	public Restriction getRestriction(int index) {
		return restrictions.get(index);
	}
	
	public void setRestriction(int index, Restriction restriction) {
		restrictions.set(index, restriction);
	}
	
	public void addRestrictionGroup(RestrictionGroup restrictionGroup) {
		this.restrictions.addAll(restrictionGroup.getRestrictions());
	}
	

}
