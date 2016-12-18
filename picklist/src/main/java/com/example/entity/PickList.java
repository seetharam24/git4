package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PickList {

	@Id
	private String pickListCode;
	private String description;
	
	
	public String getPickListCode() {
		return pickListCode;
	}
	public void setPickListCode(String pickListCode) {
		this.pickListCode = pickListCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
