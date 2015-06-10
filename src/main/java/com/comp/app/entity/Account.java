package com.comp.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Account {
	@Id
	@GeneratedValue
	private Long id;
	
	private String number;
	
	@OneToOne(mappedBy="account")
	private Person person;

	public Long getId() {
		return id;
	}

	public String getNumber() {
		return number;
	}

	public Person getPerson() {
		return person;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
}
