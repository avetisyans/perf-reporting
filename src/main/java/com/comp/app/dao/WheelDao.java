package com.comp.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.comp.app.entity.Wheel;

@Repository("wheelDao")
public interface WheelDao extends JpaRepository<Wheel, Long> {

}
