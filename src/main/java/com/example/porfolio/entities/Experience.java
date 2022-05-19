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
@Table(name = "experience")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Experience extends Base {
	
	@Column(name = "start", length = 50)
	private String start;

	@Column(name = "end", length = 50)
	private String end;
	
	@Column(name = "duration", length = 50)
	private String duration;

	@Column(name = "description", length = 500)
	private String description;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "fk_company")
	private Company company;

	@ManyToOne(optional = false)
	@JoinColumn(name = "fk_mode")
	private Mode mode;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "fk_position")
	private Position position;

	@ManyToOne(optional = false)
	@JoinColumn(name = "fk_owner")
	private Owner owner;

	
}
