package com.comp.app.service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comp.app.dao.CarDao;
import com.comp.app.dao.WheelDao;
import com.comp.app.entity.Car;
import com.comp.app.entity.Wheel;

@Service
@Transactional
public class InitDBService {

	@Autowired
	private CarDao carDao;

	@Autowired
	private WheelDao wheelDao;
	
	@Autowired
	private WheelService wheelService;


	@PostConstruct
	public void init() {
		System.out.println("Test");
		
		Car car1 = new Car();
		car1.setBrand("Brand1");
		//carDao.save(car1);
		
		Car car2 = new Car();
		car2.setBrand("Brand2");
		//carDao.save(car2);
		
		Wheel wheel1 = new Wheel();
		wheel1.setCar(car1);
		
	//	Wheel wheel2 = new Wheel();
	//	wheel2.setCar(car1);
		
		Wheel wheel3 = new Wheel();
		wheel3.setCar(car2);
		
		wheelService.save(wheel1);
		//wheelService.save(wheel2);
		wheelService.save(wheel3);
		
		
	}
}
