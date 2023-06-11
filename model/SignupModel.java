package com.productData.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class SignupModel {
@Id
   private int cust_id;
   private String firstName;
   private String LastName;
   private String password;
   private String mail;
   public int getCust_id() {
	   return cust_id;
   }
   public void setCust_id(int cust_id) {
	   this.cust_id = cust_id;
   }
   public String getFirstName() {
	   return firstName;
   }
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
}
