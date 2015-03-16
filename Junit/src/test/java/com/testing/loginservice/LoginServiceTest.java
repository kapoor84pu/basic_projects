package com.testing.loginservice;

import static org.junit.Assert.*;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class LoginServiceTest {

	@Mock
	IAccount mockAccount;
	
	@Mock
	IAccount mockAccount1;

	@Mock
	IAccountRepository mockAccountRepository;
	LoginService service;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		when(mockAccountRepository.find("Alice")).thenReturn(mockAccount);
		when(mockAccount.passwordMatches("password")).thenReturn(true);
		service = new LoginService(mockAccountRepository);
	}

	@Test
	public void itShouldSetAccountToLoggedInWhenPasswordMatches() {
		service.login("Alice", "password");
		verify(mockAccount, times(1)).setLoggedIn(true);
	}

	@Test
	public void itShouldSetAccountToRevokedAfterThreeAttempts() {
		for (int i = 0; i < 3; i++) {
			service.login("Alice", "wrongPassword");
		}
		verify(mockAccount, times(1)).setRevoked(true);
	}

	@Test
	public void itShouldNotSetAccountLoggedInIfPasswordDoesnotMatch() {
		service.login("Alice", "password2");
		verify(mockAccount, never()).setLoggedIn(true);
	}
	
	@Test
	public void itShouldNotRevokeSecondAccountAfterTwoFailedAttemptsWithSecondOneFailedWithFirstAccount(){
		when(mockAccountRepository.find("Bob")).thenReturn(mockAccount1);
		when(mockAccount1.passwordMatches("password")).thenReturn(true);
		
		service.login("Alice", "pass");
		service.login("Alice", "passw");
		service.login("Bob", "pass");
		
		verify(mockAccount1,never()).setRevoked(true);		
	}
	
	@Test(expected = AccountLoginLimitReachedException)
	public void itShouldNotAllowConcurrentLogins(){
		when(mockAccount.isLoggedIn()).thenReturn(true);
		service.login("Alice", "password");		
	}
	

	
	
	
	
	
}
