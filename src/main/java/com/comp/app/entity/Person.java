package com.comp.app.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;

	@OneToOne
	private Account account;

	public Account getAccount() {
		return account;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public void setAccount(Account account) {
		this.account = account;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
}
