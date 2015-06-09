package com.comp.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comp.app.dao.CarDao;
import com.comp.app.dao.WheelDao;
import com.comp.app.entity.Car;

@Service("carService")
@Transactional
public class CarService {
	
	@Autowired
	private CarDao carDao;

	@Autowired
	private WheelDao wheelDao;
	
	public Car findOne(Long id) {
		return carDao.findOne(id);
	}
	
	public Car save(Car car) {
		return carDao.save(car);
	}
}
