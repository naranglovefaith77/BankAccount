package com.example.demo.dao;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entities.Account;

import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;


@RunWith(SpringRunner.class)
public class AccountRepositoryTests {
	
	@Autowired
	private TestEntityManager entityManager;
	
	@Test
	public void testCreateNewAccount() {
		Account savedInDb=entityManager.persist(new Account(4527,"Saving","Alex","ICICI","Mumbai",964537656));
		System.out.println(savedInDb);
		assertThat(savedInDb.getAccountHolderName()).isEqualTo("Alex");
	}

}
