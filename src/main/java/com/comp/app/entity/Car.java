package com.comp.app.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Car {
	@Id
	@GeneratedValue
	private Long id;
	
	private String brand;
	
	@OneToMany(mappedBy="car"/*, cascade=CascadeType.ALL*/)
	private List<Wheel> wheels = new ArrayList<Wheel>();
	
	@ManyToOne
	@JoinColumn(name="garage_id")
	private Garage garage;

	public String getBrand() {
		return brand;
	}


	public Garage getGarage() {
		return garage;
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


	public void setGarage(Garage garage) {
		this.garage = garage;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setWheels(List<Wheel> wheels) {
		this.wheels = wheels;
	}
	
	// adding to List and removing
	public void addWheel(Wheel wheel) {
		wheel.setCar(this);
		this.wheels.add(wheel);
	}
	
	public void removeWheel(Wheel wheel) {
		wheel.setCar(null);
		this.wheels.remove(wheel);
	}
}
