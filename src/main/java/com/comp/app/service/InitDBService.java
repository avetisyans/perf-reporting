package com.comp.app.service;

import java.util.Date;

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
import com.comp.app.dao.TestResultWithDurationDao;
import com.comp.app.dao.WheelDao;
import com.comp.app.entity.TestResultWithDuration;
import com.comp.app.entity.TestResultWithDuration.Result;

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
	
	@Autowired
	private TestResultWithDurationDao testResultWithDurationDao;

	@PostConstruct
	public void init() {
		
		TestResultWithDuration testResult1 = new TestResultWithDuration();
		testResult1.setResult(Result.SUCCESS);
		testResult1.setStartTime(new Date().getTime());
		testResult1.setEndTime(new Date().getTime() + 3274L);
		testResultWithDurationDao.save(testResult1);
												
		TestResultWithDuration testResult2 = new TestResultWithDuration();
		testResult2.setResult(Result.SUCCESS);
		testResult2.setStartTime(new Date().getTime());
		testResult2.setEndTime(new Date().getTime() + 4123L);
		testResultWithDurationDao.save(testResult2);
												
		TestResultWithDuration testResult3 = new TestResultWithDuration();
		testResult3.setResult(Result.SUCCESS);  
		testResult3.setStartTime(new Date().getTime());
		testResult3.setEndTime(new Date().getTime() + 72465567L);
		testResultWithDurationDao.save(testResult3);
		
		
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
		runInfoDao.save(parent);
		
		RunInfo firstChild = new RunInfo();
		firstChild.setName("firstChildName");
		firstChild.setBuildNumber("firstChild111");
		firstChild.setParent(parent);
		runInfoDao.save(firstChild);
		
		RunInfo secondChild = new RunInfo();
		secondChild.setName("secondChildName");
		secondChild.setBuildNumber("secondChild222");
		secondChild.setParent(parent);
		runInfoDao.save(secondChild);
		
		RunInfo FirstChildOfsecondChild = new RunInfo();
		FirstChildOfsecondChild.setName("FirstChildOfsecondChildName");
		FirstChildOfsecondChild.setBuildNumber("FirstChildOfsecondChild222111");
		FirstChildOfsecondChild.setParent(secondChild);
		runInfoDao.save(FirstChildOfsecondChild);*/
		
		
		
		
	//	runInfoDao.save(secondChild);
		
		
/*		Person person = new Person();
		person.setName("personName");
		
		Account account = new Account();
		account.setNumber("person111");
		
		accountDao.save(account);
		
		person.setAccount(account);
		
		personDao.save(person);*/
		
/*		RunInfo runInfo = new RunInfo();
		runInfo.setBuildNumber("#111");
		runInfo.setNodes(new String[]{"First","Second","Third"});
		runInfoDao.save(runInfo);*/
		
	}
}
