package com.cg.fms.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Land {
	
	@Id
	@GeneratedValue
	private int landId;
	@NotNull
	private int surveyNumber;
	@NotNull
	private String ownerName;
	@NotNull
	private String landArea;
	
	
	public int getLandId() {
		return landId;
	}
	public void setLandId(int landId) {
		this.landId = landId;
	}
	public int getSurveyNumber() {
		return surveyNumber;
	}
	public void setSurveyNumber(int surveyNumber) {
		this.surveyNumber = surveyNumber;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getLandArea() {
		return landArea;
	}
	public void setLandArea(String landArea) {
		this.landArea = landArea;
	}
	
	

}
