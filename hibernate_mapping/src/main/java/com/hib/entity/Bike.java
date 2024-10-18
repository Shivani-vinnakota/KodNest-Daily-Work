package com.hib.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Bikes")
public class Bike {
	@Id
	int regNumber;
	String Model;
	double cost;
	public Bike() {
		super();
	}
	public Bike(int regNumber, String model, double cost) {
		super();
		this.regNumber = regNumber;
		Model = model;
		this.cost = cost;
	}
	public int getRegNumber() {
		return regNumber;
	}
	public void setRegNumber(int regNumber) {
		this.regNumber = regNumber;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Bike [regNumber=" + regNumber + ", Model=" + Model + ", cost=" + cost + "]";
	}
	
}
