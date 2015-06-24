package com.comp.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comp.app.dao.TestResultWithDurationDao;
import com.comp.app.entity.TestResultWithDuration;

@Service("testResultWithDurationService")
@Transactional
public class TestResultWithDurationService {

	@Autowired
	private TestResultWithDurationDao testResultWithDurationDao;
	
	public List<TestResultWithDuration> findAll() {
		return testResultWithDurationDao.findAll();
	}
	
}
