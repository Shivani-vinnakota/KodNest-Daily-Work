package com.hib.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Technology 
{
  @Id
  int techId;
  String techName;
  @ManyToMany
  List<Employee> employees;
  public Technology() {
	  super();
  }
public Technology(int techId, String techName, List<Employee> employees) {
	super();
	this.techId = techId;
	this.techName = techName;
	this.employees = employees;
}
public int getTechId() {
	return techId;
}
public void setTechId(int techId) {
	this.techId = techId;
}
public String getTechName() {
	return techName;
}
public void setTechName(String techName) {
	this.techName = techName;
}
public List<Employee> getEmployees() {
	return employees;
}
public void setEmployees(List<Employee> employees) {
	this.employees = employees;
}
@Override
public String toString() {
	return "Technology [techId=" + techId + ", techName=" + techName + ", employees=" + employees + "]";
}
  
  
}
