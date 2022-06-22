package com.bankDemo.model.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;




@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	@Id
	private String userId;
	
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="mobileNo")
	private int mobileNo;
	
	@Column(name="address")
	private String address;
	
	@Column(name="idProof")
	private int idProof;
	
	@Column(name="accountType")
	private String accountType;
}
