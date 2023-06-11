package com.productData.model;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class CustomerModel {
	@Id
	private int cust_id;
    private String name;
    private String contact;
    private String purchased;
//    @OneToOne(cascade=CascadeType.ALL)
//    @JoinColumn(name="tax")
//    private Product tax;
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getPurchased() {
		return purchased;
	}
	public void setPurchased(String purchased) {
		this.purchased = purchased;
	}
}
