package com.comp.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comp.app.dao.ManagerEntityDao;
import com.comp.app.entity.ManagerEntity;

@Service("managerEntityService")
@Transactional
public class ManagerEntityService {

	@Autowired
	ManagerEntityDao managerEntityDao;
	
	
	public ManagerEntity save(ManagerEntity managerEntity) {
		return managerEntityDao.save(managerEntity);
	}
	
	public ManagerEntity saveAndFlush(ManagerEntity managerEntity) {
		return managerEntityDao.saveAndFlush(managerEntity);
	}
	
}
