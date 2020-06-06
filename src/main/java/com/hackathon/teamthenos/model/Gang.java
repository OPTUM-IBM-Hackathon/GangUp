package com.hackathon.teamthenos.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Gang")
public class Gang {
	
	@Column(name = "id")
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Integer id;

	@Column(name = "name")
    String name;
    
    @Column(name = "emailId")
    String emailId;
    
	@Column(name = "gangtype")
    String gangtype;
    
    @Column(name = "meetdate")
    String meetdate;
    
    @Column(name = "age")
    String age;
    
    @Column(name = "description")
    String description;
    
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getGangtype() {
		return gangtype;
	}

	public void setGangtype(String gangtype) {
		this.gangtype = gangtype;
	}

	public String getMeetdate() {
		return meetdate;
	}

	public void setDate(String meetdate) {
		this.meetdate = meetdate;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
