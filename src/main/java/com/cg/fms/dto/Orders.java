package com.cg.fms.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
 

@Entity
public class Orders {
	
	@Id
	@GeneratedValue
	private int orderNumber;
	@NotNull
	private String deliveryPlace;
	@NotNull
	private String deliveryDate;
	@NotNull
	private String quantity;
	
	@Autowired
	@OneToOne(targetEntity=Customer.class,cascade=CascadeType.ALL)
	private Customer customer;
	@Autowired
	@OneToOne(targetEntity=Product.class,cascade=CascadeType.ALL)
	private Product product;
	@Autowired
	@OneToOne(targetEntity=Scheduler.class,cascade=CascadeType.ALL)
	private Scheduler scheduler;
	@Autowired
	@OneToOne(targetEntity=Contract.class,cascade=CascadeType.ALL)
	private Contract contract;
	

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
	public Contract getContract() {
		return contract;
	}
	public void setContract(Contract contract) {
		this.contract = contract;
	}
	public int getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
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
