package com.testing.DAO;

public class PersonService {

	private final PersonDAO personDAO;

	public PersonService(PersonDAO personDAO) {
		super();
		this.personDAO = personDAO;
	}
	
	public boolean update(Integer personId, String name){
		Person person = personDAO.fetchPerson(personId);
		if(person != null){
			Person updatePerson = new Person(person.getPersonID(), name);
			personDAO.update(updatePerson);
			return true;		
		}else{
			return false;	
		}		
	}	
}
