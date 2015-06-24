package com.comp.app.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PostLoad;
import javax.persistence.PostUpdate;
import javax.persistence.Transient;

@Entity
public class TestResultWithDuration {
	
	public static enum Result {
		NONE, SUCCESS, FAILURE, SKIPPED
	}
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Enumerated(EnumType.STRING)
	private Result result;
	
	private Long startTime;
	
	private Long endTime;
	
	@Transient
	private Long duration;
	
	@PostLoad
	@PostUpdate
	public void calculateDuration() {
		this.duration = this.endTime - this.startTime;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Result getResult() {
		return result;
	}
	
	public void setResult(Result result) {
		this.result = result;
	}
	
	public Long getStartTime() {
		return startTime;
	}
	
	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}
	
	public Long getEndTime() {
		return endTime;
	}
	
	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}
	
	public Long getDuration() {
		return duration;
	}
	
	public void setDuration(Long duration) {
		this.duration = duration;
	}
}
