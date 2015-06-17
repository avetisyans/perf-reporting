package com.comp.app.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class RunInfo {

	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String buildNumber;

	@ManyToOne
	private RunInfo parent;

	@OneToMany(mappedBy="parent", fetch=FetchType.EAGER)
	private List<RunInfo> children;

	public String getBuildNumber() {
		return buildNumber;
	}

	public List<RunInfo> getChildren() {
		return children;
	}

	public Long getId() {
		return id;
	}

	public RunInfo getParent() {
		return parent;
	}

	public void setBuildNumber(String buildNumber) {
		this.buildNumber = buildNumber;
	}

	public void setChildren(List<RunInfo> children) {
		this.children = children;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setParent(RunInfo parent) {
		this.parent = parent;
	}
}
