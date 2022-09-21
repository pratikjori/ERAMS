package com.example.Project.entity;

import java.time.LocalDate;

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
import javax.persistence.criteria.Fetch;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true,exclude = "Password")
/*
 * @Getter
 * 
 * @Setter
 */

@Entity
@Table(name = "Employee")
public class EmployeeEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Emp_id;
	
	@Column(nullable = false,length = 100)
	private String First_name;
	
	@Column(nullable = false,length = 100)
	private String Last_name;
	
	@Column(nullable = false)
	private LocalDate Date_of_Birth;
	
	@Column(nullable = false,unique = true)
	private int Contact_no;
	
	@Column(nullable = false,length = 100,unique = true)
	private String E_mail;
	
	@Column(nullable = false,length = 255)
	private String Address;
	
	@Column(nullable = false,length = 100,unique = true)
	private String Password;
	
	@Column(nullable = false)
	private LocalDate Date_of_Joining;
	
	@Column(unique = true)
	private String Emp_code;
	
	@Column(nullable = false)
	private boolean status;
	
	
	
	public int getEmp_id() {
		return Emp_id;
	}



	public void setEmp_id(int emp_id) {
		Emp_id = emp_id;
	}



	public String getFirst_name() {
		return First_name;
	}



	public void setFirst_name(String first_name) {
		First_name = first_name;
	}



	public String getLast_name() {
		return Last_name;
	}



	public void setLast_name(String last_name) {
		Last_name = last_name;
	}



	public LocalDate getDate_of_Birth() {
		return Date_of_Birth;
	}



	public void setDate_of_Birth(LocalDate date_of_Birth) {
		Date_of_Birth = date_of_Birth;
	}



	public int getContact_no() {
		return Contact_no;
	}



	public void setContact_no(int contact_no) {
		Contact_no = contact_no;
	}



	public String getE_mail() {
		return E_mail;
	}



	public void setE_mail(String e_mail) {
		E_mail = e_mail;
	}



	public String getAddress() {
		return Address;
	}



	public void setAddress(String address) {
		Address = address;
	}



	public String getPassword() {
		return Password;
	}



	public void setPassword(String password) {
		Password = password;
	}



	public LocalDate getDate_of_Joining() {
		return Date_of_Joining;
	}



	public void setDate_of_Joining(LocalDate date_of_Joining) {
		Date_of_Joining = date_of_Joining;
	}



	public String getEmp_code() {
		return Emp_code;
	}



	public void setEmp_code(String emp_code) {
		Emp_code = emp_code;
	}



	public boolean isStatus() {
		return status;
	}



	public void setStatus(boolean status) {
		this.status = status;
	}



	public UserEntity getUserentity() {
		return userentity;
	}



	public void setUserentity(UserEntity userentity) {
		this.userentity = userentity;
	}



	//@OneToOne(mappedBy = "employeeentity",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id")
    @JsonIgnore
	private UserEntity userentity;

}
