package com.comp.app.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Garage {
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;

	@OneToMany(mappedBy="garage"/*, cascade=CascadeType.ALL*/)
	private List<Car> cars = new ArrayList<Car>();

	public List<Car> getCars() {
		return cars;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	// adding to List and removing
	public void addCar(Car car) {
		car.setGarage(this);
		this.cars.add(car);

	}
	
	public void removeCar(Car car) {
		car.setGarage(null);
		this.cars.remove(car);
	}

}
