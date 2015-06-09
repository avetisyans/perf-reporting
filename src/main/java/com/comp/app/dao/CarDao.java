package com.comp.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.comp.app.entity.Car;

@Repository("carDao")
public interface CarDao extends JpaRepository<Car, Long>{

	Car findByBrand(String brandName);

}
