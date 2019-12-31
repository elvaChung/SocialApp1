package com.elva.social1.location;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Location {

	@Id
	private String id;
	private String name;
	
		
	
	public Location(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Location() {
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}