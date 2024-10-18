package com.hib.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
//import jakarta.persistence.Table;

@Entity
//@Table(name="Product")if you don't want  the class name as table name then you can write this line 
public class Product
{
   @Id
   int productId;
   String prodName;
   double cost;
   @ManyToOne
   Customer customer;
   public Product() {
	   super();
   }
public Product(int productId, String prodName, double cost, Customer customer) {
	super();
	this.productId = productId;
	this.prodName = prodName;
	this.cost = cost;
	this.customer = customer;
}
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProdName() {
	return prodName;
}
public void setProdName(String prodName) {
	this.prodName = prodName;
}
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
@Override
public String toString() {
	return "Product [productId=" + productId + ", prodName=" + prodName + ", cost=" + cost + ", customer=" + customer
			+ "]";
}
   
}
