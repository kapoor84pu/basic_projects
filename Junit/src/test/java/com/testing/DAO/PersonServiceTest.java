package com.testing.DAO;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class PersonServiceTest {

	@Mock
	private PersonDAO mockedPersonDAO;
	PersonService personService;
	
	@Before
	public void setUp(){
		MockitoAnnotations.initMocks(this);
		personService = new PersonService(mockedPersonDAO) ;
	}
	
	@Test
	public void shouldUpdatePersonName() {
		Person person = new Person(1, "Alice");
		when(mockedPersonDAO.fetchPerson(1)).thenReturn(person);
		boolean updated = personService.update(1, "David");
		assertTrue(updated);
		verify(mockedPersonDAO).fetchPerson(1);	
	}
	
	@Test
	public void testWhetherPersonWithId1IsInvoked(){
		System.out.println("hey I am inside tester class");
	}

}
