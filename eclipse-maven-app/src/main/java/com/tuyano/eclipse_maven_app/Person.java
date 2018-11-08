package com.tuyano.eclipse_maven_app;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	private String mail;
	private String age;
	
	
	public Person() {
		super();
		this.name = "";
		this.mail ="";
		this.age = "";
	}
	

	public Person(String name, String mail, String age) {
		this.name = name;
		this.mail = mail;
		this.age = age;
	}
	
	
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", mail=" + mail + ", age=" + age + "]";
	}


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
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	
}
