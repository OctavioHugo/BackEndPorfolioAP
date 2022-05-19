package com.example.porfolio.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "project")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Project extends Base{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "title", length = 50)
	private String title;
	
	@Column(name = "description", length = 1000)
	private String description;
	
	@Column(name = "photo", length = 2000)
	private String photo;
	
	@Column(name = "url", length = 2000)
	private String url;

	@ManyToOne(optional = false)
	@JoinColumn(name = "fk_owner")
	private Owner owner;
}
