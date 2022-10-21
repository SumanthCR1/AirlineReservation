package com.digisprint.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="passanger")
public class Passanger {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	private String firstname;
	@Column
	private String lastname;
	@Column
	private int age;
	@Column
	private String gender;
	@Column
	private String phonenumber;
	@Column
	private String contactaddress;
	@Column
	private String emailid;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getContactaddress() {
		return contactaddress;
	}
	public void setContactaddress(String contactaddress) {
		this.contactaddress = contactaddress;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	@Override
	public String toString() {
		return "Passanger [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", age=" + age
				+ ", gender=" + gender + ", phonenumber=" + phonenumber + ", contactaddress=" + contactaddress
				+ ", emailid=" + emailid + "]";
	}

}
