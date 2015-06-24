package com.comp.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.comp.app.entity.TestResultWithDuration;

@Repository("testResultWithDurationDao")
public interface TestResultWithDurationDao extends JpaRepository<TestResultWithDuration, Long>{


}
