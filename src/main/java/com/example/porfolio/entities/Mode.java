package com.example.porfolio.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "mode")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Mode extends Base{
	
	@Column(name = "name", length = 50)
	private String name;

}
