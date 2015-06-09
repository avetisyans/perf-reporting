package com.comp.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.comp.app.dao.CarDao;
import com.comp.app.entity.Car;
import com.comp.app.entity.Wheel;
import com.comp.app.service.CarService;
import com.comp.app.service.WheelService;

@Controller
public class TestController {
	@Autowired
	private CarService carService;
	
	@Autowired
	private CarDao carDao;
	
	@Autowired
	private WheelService wheelService;

	@RequestMapping("/")
	public String welcome() {
		
		//Car car = carService.findOne((long) 1);
		
		//Car car1 = carDao.findByBrand(car.getBrand());
		//car1.setBrand("tttBrand");
		
		Wheel wheel1 = new Wheel();
		wheel1.setProducerName("Prod 1");
		
		//wheel1.setCar(car1);
		
		Wheel wheel2 = new Wheel();
		wheel2.setProducerName("Prod 2");
		//wheel2.setCar(car1);
		
		//wheelService.save(wheel1, carService.findOne((long) 1).getBrand());
		//wheelService.save(wheel2, carService.findOne((long) 1).getBrand());
		
		
/*		wheelService.save(wheel1);
		wheelService.save(wheel2);*/
		
		Car car = new Car();
		car.setBrand("Brand2");
		carService.save(car);
		
		
		return "home";
	}
	
}
