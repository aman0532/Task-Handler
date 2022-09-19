package net.app.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tasktable")
public class Task {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private long id;
	@Column(name="name")	
	   private String name;
	   

	   @Column(name="dob")	
	   private String dob;
	   
	   @Column(name="address")
	   private String address;
	   
	   @Column(name="description")
	   private String description;
	   
	   @Column(name="createdAt")
	   private String createdAt;
	   public Task() {
		super();
	}

	
	public Task(long id, String name, String dob, String address, String description, String createdAt) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.address = address;
		this.description = description;
		this.createdAt = createdAt;
	}

	
	
   public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}


}