package com.comp.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.comp.app.dao.CarDao;
import com.comp.app.entity.Account;
import com.comp.app.service.AccountService;
import com.comp.app.service.CarService;
import com.comp.app.service.GarageService;
import com.comp.app.service.PersonService;
import com.comp.app.service.RunInfoService;
import com.comp.app.service.WheelService;

@Controller
public class TestController {
	@Autowired
	private CarService carService;
	
	@Autowired
	private PersonService personService;
	
	@Autowired
	private AccountService accountService;
	
	
	@Autowired
	private CarDao carDao;
	
	@Autowired
	private WheelService wheelService;
	
	@Autowired
	private GarageService garageService;
	
	@Autowired
	private RunInfoService runInfoService;

	@RequestMapping("/")
	public String welcome() {
		
/*		Person personDB = personService.findOne(1L);
		
		System.out.println("account number: " + personDB.getAccount().getNumber() );*/
		Account accountDB = accountService.findOne(1L);
		
		System.out.println("account number: " + accountDB.getPerson().getName());

		
		
		return "home";
	}
	
}
