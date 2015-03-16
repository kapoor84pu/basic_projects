package com.testing.loginservice;

public class LoginService extends LoginServiceTest {

	private IAccountRepository accountRepository;
	private int counter;
	
	public LoginService(IAccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	public void login(String accountId, String password) {
		IAccount account = accountRepository.find(accountId);			
		if(account.passwordMatches(password)){
			account.setLoggedIn(true);
		}else{
			counter++;
		}
		if(counter==3)
			account.setRevoked(true);
	}

}
