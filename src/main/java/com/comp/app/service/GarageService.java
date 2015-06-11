package com.comp.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comp.app.dao.GarageDao;
import com.comp.app.dao.WheelDao;
import com.comp.app.entity.Garage;

@Service("garageService")
@Transactional
public class GarageService {
	
	@Autowired
	private GarageDao garageDao;

	@Autowired
	private WheelDao wheelDao;
	
	public Garage findOne(Long id) {
		return garageDao.findOne(id);
	}
	
	public Garage save(Garage car) {
		return garageDao.save(car);
	}
}
