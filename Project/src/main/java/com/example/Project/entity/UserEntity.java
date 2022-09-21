package com.example.Project.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true,exclude = {"password","employeeentity"})

@Entity
@Table(name = "User")
public class UserEntity {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
 private long user_id;

@Column(nullable = false,unique = true)
 private String username;

@Column(nullable = false,unique = true)
 private String password;

@Column(nullable = false,unique = true)
 private String useremail;



public long getUser_id() {
	return user_id;
}



public void setUser_id(long user_id) {
	this.user_id = user_id;
}



public String getUsername() {
	return username;
}



public void setUsername(String username) {
	this.username = username;
}



public String getPassword() {
	return password;
}



public void setPassword(String password) {
	this.password = password;
}



public String getUseremail() {
	return useremail;
}



public void setUseremail(String useremail) {
	this.useremail = useremail;
}



public EmployeeEntity getEmployeeentity() {
	return employeeentity;
}



public void setEmployeeentity(EmployeeEntity employeeentity) {
	this.employeeentity = employeeentity;
}



//@OneToOne(fetch = FetchType.EAGER)
//@JsonIgnore
@OneToOne(mappedBy = "userentity",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
private EmployeeEntity employeeentity;
 
}
