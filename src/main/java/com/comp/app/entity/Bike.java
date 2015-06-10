package com.comp.app.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Bike {
	@Id
	@GeneratedValue
	private Long id;
	
	private String brand;
	
	@OneToMany(mappedBy="bike")
	private List<Wheel> wheels;

	public String getBrand() {
		return brand;
	}

	public Long getId() {
		return id;
	}

	public List<Wheel> getWheels() {
		return wheels;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setWheels(List<Wheel> wheels) {
		this.wheels = wheels;
	}
}
