package com.comp.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.comp.app.entity.RunInfo;

@Repository("runInfoDao")
public interface RunInfoDao extends JpaRepository<RunInfo, Long>{


}
