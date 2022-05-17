package com.jobiak.mvcforms.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userdata")
public class User{
@Id
private Long user_id;
private String name;
private String email;
private String mobile;

public User()
{
	
}


public User(Long user_id, String name, String email, String mobile) {
	super();
	this.user_id = user_id;
	this.name = name;
	this.email = email;
	this.mobile = mobile;
}


public Long getUser_id() {
	return user_id;
}
public void setUser_id(Long user_id) {
	this.user_id = user_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
}
