package com.comp.app.dao;

import com.comp.app.entity.ManagerEntity;

public interface ManagerEntityDao {
	ManagerEntity save(ManagerEntity managerEntity);
	ManagerEntity saveAndFlush(ManagerEntity managerEntity);
	
}
