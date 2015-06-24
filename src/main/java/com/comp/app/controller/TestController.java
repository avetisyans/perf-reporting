package com.comp.app.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.comp.app.dao.CarDao;
import com.comp.app.entity.Account;
import com.comp.app.entity.RunInfo;
import com.comp.app.entity.TestResultWithDuration;
import com.comp.app.service.AccountService;
import com.comp.app.service.CarService;
import com.comp.app.service.GarageService;
import com.comp.app.service.PersonService;
import com.comp.app.service.RunInfoService;
import com.comp.app.service.TestResultWithDurationService;
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

	@Autowired
	private TestResultWithDurationService testResultWithDurationService;
	
	@RequestMapping("/")
	public String welcome() {
		SimpleDateFormat sdf= new SimpleDateFormat("HH:mm:ss.SSS");
		sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
		List<TestResultWithDuration> results = testResultWithDurationService.findAll();
		
		for (TestResultWithDuration testResultWithDuration : results) {
			Long duration = testResultWithDuration.getDuration();
			System.out.println("duration is: " + duration);
			System.out.println("is: ");
			
			//System.out.println(sdf.format(new Date(testResultWithDuration.getDuration())));
			String hmss = String.format("%02d:%02d:%02d.%03d",
										TimeUnit.MILLISECONDS.toHours(duration),
										TimeUnit.MILLISECONDS.toMinutes(duration) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(duration)),
										TimeUnit.MILLISECONDS.toSeconds(duration) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(duration)),
										TimeUnit.MILLISECONDS.toMillis(duration) - TimeUnit.SECONDS.toMillis(TimeUnit.MILLISECONDS.toSeconds(duration)));
		    System.out.println(hmss);
		}
		

		
		return "home";
	}
	
}
