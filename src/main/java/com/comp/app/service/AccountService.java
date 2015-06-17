package com.comp.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comp.app.dao.AccountDao;
import com.comp.app.dao.PersonDao;
import com.comp.app.entity.Account;

@Service("accountService")
@Transactional
public class AccountService {
	
	@Autowired
	private PersonDao personDao;
	
	@Autowired	
	private AccountDao accountDao;
	
	public Account save(Account account) {
		
		return accountDao.save(account);
	}
	
	public Account findOne(Long id) {
		return accountDao.findOne(id);
	}
}
