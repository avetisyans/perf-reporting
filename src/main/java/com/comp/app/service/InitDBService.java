package com.comp.app.service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comp.app.dao.AccountDao;
import com.comp.app.dao.CarDao;
import com.comp.app.dao.PersonDao;
import com.comp.app.dao.WheelDao;
import com.comp.app.entity.Account;
import com.comp.app.entity.Car;
import com.comp.app.entity.Person;
import com.comp.app.entity.Wheel;

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
	private PersonService personService;
	
	@Autowired
	private AccountService accountService;

	@PostConstruct
	public void init() {
		
		Car car1 = new Car();
		car1.setBrand("Brand 1t");
		carDao.save(car1);
		
		Wheel wheel1 = new Wheel();
		wheel1.setProducerName("Prond 1");
		wheel1.setCar(car1);
		
		wheelDao.save(wheel1);
	}
}
