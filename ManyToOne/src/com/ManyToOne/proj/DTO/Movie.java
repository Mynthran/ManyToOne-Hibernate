package com.ManyToOne.proj.DTO;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "movie")
public class Movie implements Serializable
{
	@Id
	@GenericGenerator(name = "m_auto", strategy = "increment")
	@GeneratedValue(generator = "m_auto")
	@Column(name = "m_id")
	private int id;
	
	@Column(name = "m_name")
	private String name;
	
	@Column(name = "m_boxOffice")
	private Double boxOffice;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="h_fk")
	private Hero hero;

	public Movie() {
	
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

	public Double getBoxOffice() {
		return boxOffice;
	}

	public void setBoxOffice(Double boxOffice) {
		this.boxOffice = boxOffice;
	}

	public Hero getHero() {
		return hero;
	}

	public void setHero(Hero hero) {
		this.hero = hero;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", boxOffice=" + boxOffice + ", hero=" + hero + "]";
	}
	
	
}
