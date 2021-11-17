package com.example.springboot.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Entity

@Document(collection = "Student")
public class Student {
	
	@Id	

	public String id;
	public String username;
	public String lastname;
	private Integer birthday;
	public String standard;
	public String division;
	public String gender;
	
	
	
	public Student() {
		
	}

	public Student(String id, String username, String lastname, Integer birthday, String standard, String division,
			String gender) {
		super();
		this.id = id;
		this.username = username;
		this.lastname = lastname;
		this.birthday = birthday;
		this.standard = standard;
		this.division = division;
		this.gender = gender;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getLastname() {
		return lastname;
	}



	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	public Integer getBirthday() {
		return birthday;
	}



	public void setBirthday(Integer birthday) {
		this.birthday = birthday;
	}



	public String getStandard() {
		return standard;
	}



	public void setStandard(String standard) {
		this.standard = standard;
	}



	public String getDivision() {
		return division;
	}



	public void setDivision(String division) {
		this.division = division;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", username=" + username + ", lastname=" + lastname + ", birthday=" + birthday
				+ ", standard=" + standard + ", division=" + division + ", gender=" + gender + "]";
	}
	
	
	
}