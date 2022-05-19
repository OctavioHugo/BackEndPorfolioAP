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
@Table(name = "education")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Education extends Base {
	
	@Column(name = "description", length = 500)
	private String description;
	
	@Column(name = "start", length = 50)
	private String start;
	
	@Column(name = "end", length = 50)
	private String end;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "fk_owner")
	private Owner owner;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "fk_title")
	private Title title;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "fk_institution")
	private Institution institution;
	
}
