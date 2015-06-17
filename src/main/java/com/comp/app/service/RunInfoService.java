package com.comp.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comp.app.dao.RunInfoDao;
import com.comp.app.entity.RunInfo;

@Service("runInfoService")
@Transactional
public class RunInfoService {
	
	@Autowired
	private RunInfoDao runInfoDao;
	
	public RunInfo findOne(Long id) {
		
		return runInfoDao.findOne(id);
	}
}
