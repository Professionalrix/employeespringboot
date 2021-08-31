package com.springboot.project.enities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String portfolio;
	private String position;
	private String salaryRequirement;
	private String whenWeStart;
	private Long  mobileNo;
	private String imgUrl;
	private String lastCompany;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPortfolio() {
		return portfolio;
	}
	public void setPortfolio(String portfolio) {
		this.portfolio = portfolio;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getSalaryRequirement() {
		return salaryRequirement;
	}
	public void setSalaryRequirement(String salaryRequirement) {
		this.salaryRequirement = salaryRequirement;
	}
	public String getWhenWeStart() {
		return whenWeStart;
	}
	public void setWhenWeStart(String whenWeStart) {
		this.whenWeStart = whenWeStart;
	}
	public Long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getLastCompany() {
		return lastCompany;
	}
	public void setLastCompany(String lastCompany) {
		this.lastCompany = lastCompany;
	}
	
	

}
