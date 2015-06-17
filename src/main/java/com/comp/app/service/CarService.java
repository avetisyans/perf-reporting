package com.comp.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comp.app.dao.CarDao;
import com.comp.app.dao.GarageDao;
import com.comp.app.dao.WheelDao;
import com.comp.app.entity.Car;
import com.comp.app.entity.Garage;

@Service("carService")
@Transactional
public class CarService {
	
	@Autowired
	private CarDao carDao;

	@Autowired
	private WheelDao wheelDao;
	
	@Autowired
	private GarageDao garageDao;
	
	public Car findOne(Long id) {
		return carDao.findOne(id);
	}
	
	public Car save(Car car) {
		carDao.saveAndFlush(car);
		System.out.println("The Car has been saved");
		return new Car();
	}

	public Car saveToItsGarage(Car car1) {
		Garage garage = car1.getGarage();
		Garage garage2 = garageDao.findByName(garage.getName());
		
		if (garage2 == null) {
			garageDao.save(garage);
			return carDao.save(car1);
		}
		
		car1.setGarage(garage2);
		return carDao.save(car1);
		
	}
}
