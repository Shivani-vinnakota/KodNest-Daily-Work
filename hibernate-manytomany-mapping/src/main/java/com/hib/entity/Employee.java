package com.hib.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Employee 
{
@Id
 int empId;
 String empname;
 String team;
 @ManyToMany
 List <Technology> technologies;
 public Employee() {
	 super();
 }
public Employee(int empId, String empname, String team, List<Technology> technologies) {
	super();
	this.empId = empId;
	this.empname = empname;
	this.team = team;
	this.technologies = technologies;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public String getTeam() {
	return team;
}
public void setTeam(String team) {
	this.team = team;
}
public List<Technology> getTechnologies() {
	return technologies;
}
public void setTechnologies(List<Technology> technologies) {
	this.technologies = technologies;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empname=" + empname + ", team=" + team + ", technologies=" + technologies
			+ "]";
}

 
}
