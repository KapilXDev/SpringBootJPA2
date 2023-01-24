package com.cg.fms.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Scheduler {
	
	@Id
	@GeneratedValue
	private int schedulerId;
	@NotNull
	private String schedulerName;
	@NotNull
	private String schedulerContact;
	@NotNull
	private String truckNumber;
	
	public int getSchedulerId() {
		return schedulerId;
	}
	public void setSchedulerId(int schedulerId) {
		this.schedulerId = schedulerId;
	}
	public String getSchedulerName() {
		return schedulerName;
	}
	public void setSchedulerName(String schedulerName) {
		this.schedulerName = schedulerName;
	}
	public String getSchedulerContact() {
		return schedulerContact;
	}
	public void setSchedulerContact(String schedulerContact) {
		this.schedulerContact = schedulerContact;
	}
	public String getTruckNumber() {
		return truckNumber;
	}
	public void setTruckNumber(String truckNumber) {
		this.truckNumber = truckNumber;
	}
	
	

}
