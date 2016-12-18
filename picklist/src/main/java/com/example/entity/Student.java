package com.example.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

@Entity
@IdClass(MyKey.class)
public class Student implements Serializable{
	
	@Id
	private String stuclass;
	@Id
	private String stuname;
	private String school;
	private String country;
	
	private String city;
	
	@ManyToOne
    @JoinColumns({@JoinColumn(name="city",referencedColumnName="city", insertable=false, updatable=false),
                  @JoinColumn(name="country",referencedColumnName="country", insertable=false, updatable=false)})
	private Address address;
	
	
	
	
	
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStuclass() {
		return stuclass;
	}
	public void setStuclass(String stuclass) {
		this.stuclass = stuclass;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
	
	
	
	@Override
	public String toString() {
		return stuclass+stuname;
	}
	
	
}
