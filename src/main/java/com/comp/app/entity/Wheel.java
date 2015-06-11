package com.comp.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Wheel {
	@Id
	@GeneratedValue
	private Long id;
	
	private String producerName;
	
	@ManyToOne
	@JoinColumn(name="car_id")
	private Car car;	                                    
	
	@ManyToOne
	@JoinColumn(name="bike_id")
	private Bike bike;

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public String getProducerName() {
		return producerName;
	}

	public void setProducerName(String producerName) {
		this.producerName = producerName;
	}

}
