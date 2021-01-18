package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.dao.AccountRepository;
import com.example.demo.entities.Account;
import com.example.demo.service.AccountServiceImpl;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AccountServiceImplTests {
	
	@Autowired
	public AccountServiceImpl accountService;
	
	@MockBean
	public AccountRepository accountRepository;
	
	//testing service layer
	@Test
	public void createNewAccount()
	{
		/*
		 * Account account = new Account();
		 * when(accountRepository.save(account)).thenReturn(account);
		 */
		//assertEquals(account, accountService.createNewAccount(account));
	}
	
}

