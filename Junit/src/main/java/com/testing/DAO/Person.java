package com.testing.DAO;

/**
 * 
 * @author neelam.kapoor
 *
 */
public class Person {

	private final Integer personID;
	private final String personNameString;
	
	public Person(Integer personID, String personNameString) {
		super();
		this.personID = personID;
		this.personNameString = personNameString;
	}

	public Integer getPersonID() {
		return personID;
	}

	public String getPersonNameString() {
		return personNameString;
	}	
	
}
