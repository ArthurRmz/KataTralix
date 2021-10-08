package com.tralix.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;

import lombok.Data;

@Data
@Entity(name="usuarios")
public class Usuario {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Email
	private String email;
	
	@NotNull
	private String nombre;
	
	@NotNull
	private String empresa;
	
	@NotNull
	private String estado;
	
	@AssertTrue
	private Boolean politicasPrivacidad=false;
}
