 	package com.cg.fms.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Admin {
	
	@Id
	@GeneratedValue
	private int adminid;
	@NotNull
	@Size(min=3,message="User name should atleast 3 characters")
	@Column(name="admin_Name")
	private String adminName;
	@NotNull
	@Size(min=8,message="Password should atleast 8 characters")
	private String adminPassword;
	
	
	
	public int getAdminid() {
		return adminid;
	}
	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	
	
	

}
