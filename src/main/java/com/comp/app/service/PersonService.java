package com.comp.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comp.app.dao.AccountDao;
import com.comp.app.dao.PersonDao;
import com.comp.app.entity.Person;

@Service("personService")
@Transactional
public class PersonService {
	
	@Autowired
	private PersonDao personDao;
	
	@Autowired	
	private AccountDao accountDao;
	
	public Person findOne(Long id) {
		return personDao.findOne(id);
	}
}
