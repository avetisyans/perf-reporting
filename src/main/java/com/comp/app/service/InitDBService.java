package com.comp.app.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comp.app.dao.AccountDao;
import com.comp.app.dao.AddressDao;
import com.comp.app.dao.CarDao;
import com.comp.app.dao.GarageDao;
import com.comp.app.dao.HumanDao;
import com.comp.app.dao.ManagerEntityDao;
import com.comp.app.dao.PersonDao;
import com.comp.app.dao.RunInfoDao;
import com.comp.app.dao.WheelDao;
import com.comp.app.entity.Account;
import com.comp.app.entity.Address;
import com.comp.app.entity.Human;
import com.comp.app.entity.Person;
import com.comp.app.entity.RunInfo;

@Service
@Transactional
public class InitDBService {

	@Autowired
	private CarDao carDao;

	@Autowired
	private WheelDao wheelDao;
	
	@Autowired
	private AccountDao accountDao;
	
	@Autowired
	private PersonDao personDao;
	
	@Autowired
	private GarageDao garageDao;
	
	@Autowired
	private HumanDao humanDao;
	@Autowired
	
	private AddressDao addressDao;

	@Autowired
	private PersonService personService;
	
	@Autowired
	private AccountService accountService;
	
	@Autowired
	private ManagerEntityDao managerEntityDao;
	
	@Autowired
	private ManagerEntityService managerEntityService;
	
	@Autowired
	private RunInfoDao runInfoDao;

	@PostConstruct
	public void init() {
		
/*		Human human1 = new Human();
		human1.setName("human1Name");
		
		Human human2 = new Human();
		human2.setName("human2Name");
	
		
		
		
		Address address1 = new Address();
		address1.setValue("address1Value");
		addressDao.save(address1);
		
		Address address2 = new Address();
		address2.setValue("address2Value");
		addressDao.save(address2);		
		
		List<Address> addresses = new ArrayList<Address>();
		addresses.add(address1);
		addresses.add(address2);
		
		human1.setAddresses(addresses);
		
		humanDao.save(human1);*/
		
/*		RunInfo parent = new RunInfo();
		parent.setName("parentName");
		parent.setBuildNumber("parent111");
		
		
		RunInfo firstChild = new RunInfo();
		firstChild.setName("firstChildName");
		firstChild.setBuildNumber("firstChild111");
		firstChild.setParent(parent);
		
		
		RunInfo secondChild = new RunInfo();
		secondChild.setName("secondChildName");
		secondChild.setBuildNumber("secondChild222");
		secondChild.setParent(parent);
		
		
		RunInfo FirstChildOfsecondChild = new RunInfo();
		FirstChildOfsecondChild.setName("FirstChildOfsecondChildName");
		FirstChildOfsecondChild.setBuildNumber("FirstChildOfsecondChild222111");
		FirstChildOfsecondChild.setParent(secondChild);
		
		
		
		runInfoDao.save(parent);
		runInfoDao.save(firstChild);
		runInfoDao.save(secondChild);
		runInfoDao.save(FirstChildOfsecondChild);*/
		
		Person person = new Person();
		person.setName("personName");
		
		Account account = new Account();
		account.setNumber("person111");
		
		accountDao.save(account);
		
		person.setAccount(account);
		
		personDao.save(person);
		
	}
}
