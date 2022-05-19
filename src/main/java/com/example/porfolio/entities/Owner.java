package com.example.porfolio.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "owner")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Owner extends Base{
	
	@Column(name = "photo", length = 2000)
	private String photo;
	
	@Column(name = "name", length = 50)
	private String name;
	
	@Column(name = "facebook", length = 2000)
	private String facebook;
	
	@Column(name= "twitter", length = 2000)
	private String twitter;
	
	@Column(name = "instagram", length = 2000)
	private String instagram;
	
	@Column(name ="about", length = 2000)
	private String about;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "fk_city")
	private City city;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "fk_position")
	private Position position;
}
