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
@Table(name = "state")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class State extends Base{
	
	@Column(name = "name", length = 50)
	private String name;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "fk_country")
	private Country country;

}
