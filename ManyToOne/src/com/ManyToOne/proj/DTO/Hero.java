package com.ManyToOne.proj.DTO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name = "hero")
public class Hero implements Serializable
{
	@Id
	@GenericGenerator(name = "h_auto", strategy = "increment")
	@GeneratedValue(generator = "h_auto")
	@Column(name = "h_id")
	private int id;
	
	@Column(name = "h_name")
	private String name;
	
	@Column(name = "h_age")
	private int age;
	
	@Column(name = "h_sal")
	private Double sal;

	public Hero() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() 
	{
		return "Hero [id=" + id + ", name=" + name + ", age=" + age + ", sal=" + sal + "]";
	}
	
	
}
