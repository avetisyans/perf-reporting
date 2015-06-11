package com.comp.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.comp.app.dao.CarDao;
import com.comp.app.entity.Car;
import com.comp.app.entity.Garage;
import com.comp.app.service.CarService;
import com.comp.app.service.GarageService;
import com.comp.app.service.WheelService;

@Controller
public class TestController {
	@Autowired
	private CarService carService;
	
	@Autowired
	private CarDao carDao;
	
	@Autowired
	private WheelService wheelService;
	
	@Autowired
	private GarageService garageService;

	@RequestMapping("/")
	public String welcome() {
		
		Garage garage1 = new Garage();
		garage1.setName("Testo Garage");
		
		
		Car car1 = new Car();
		car1.setBrand("Car2 Brand");
		car1.setGarage(garage1);

		carService.saveToItsGarage(car1);

		return "home";
	}
	
}
