package com.comp.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.comp.app.entity.Garage;

@Repository("garageDao")
public interface GarageDao extends JpaRepository<Garage, Long>{

	Garage findByName(String name);


}
