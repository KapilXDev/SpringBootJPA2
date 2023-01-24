package com.cg.fms.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;


@Entity
public class Contract {
	
	@Id
	@GeneratedValue
	private int contractNumber;
	@NotNull
	private String deliveryPlace;
	@NotNull
	private String deliveryDate;
	@NotNull
	private String quantity;
	@NotNull
	@Autowired
	@OneToOne(targetEntity=Customer.class,cascade=CascadeType.ALL)
	private Customer customer;
	@NotNull
	@Autowired
	@OneToOne(targetEntity=Product.class,cascade=CascadeType.ALL)
	private Product product;
	@NotNull
	@Autowired
	@OneToOne(targetEntity=Scheduler.class,cascade=CascadeType.ALL)
	private Scheduler scheduler;
	
	
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Scheduler getScheduler() {
		return scheduler;
	}
	public void setScheduler(Scheduler scheduler) {
		this.scheduler = scheduler;
	}
	public int getContractNumber() {
		return contractNumber;
	}
	public void setContractNumber(int contractNumber) {
		this.contractNumber = contractNumber;
	}
	public String getDeliveryPlace() {
		return deliveryPlace;
	}
	public void setDeliveryPlace(String deliveryPlace) {
		this.deliveryPlace = deliveryPlace;
	}
	public String getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
	
	
}
