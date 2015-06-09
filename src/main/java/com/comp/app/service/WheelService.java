package com.comp.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comp.app.dao.CarDao;
import com.comp.app.dao.WheelDao;
import com.comp.app.entity.Car;
import com.comp.app.entity.Wheel;

@Service("wheelService")

public class WheelService {
	
	@Autowired
	private CarService carService;
	
	@Autowired
	private CarDao carDao;
	
	@Autowired
	private WheelDao wheelDao;

	public void save(Wheel wheel, String brandName) {
		Car car = carDao.findByBrand(brandName);
		
		wheel.setCar(car);
		wheelDao.save(wheel);

	}
	
	@Transactional
	public Wheel save(Wheel wheel) {
		//Car car = carService.findOne((long) 1);
		//wheel.setCar(car);
		return wheelDao.save(wheel);
	}
}
