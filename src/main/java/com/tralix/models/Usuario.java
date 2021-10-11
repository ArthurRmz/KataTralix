package com.tralix.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.AssertTrue;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import lombok.Data;

@Data
@Entity
@Table(name="usuarios")
public class Usuario implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Email(message = "El correo no tiene formato valido")
	private String email;
	
	@NotEmpty(message = "El nombre no puede ser vacio")
	private String nombre;
	
	@NotEmpty(message = "Especifica el nombre de empresa")
	private String empresa;
	
	@NotEmpty(message = "El estado no puede ser vacio")
	private String estado;
	
	@AssertTrue(message = "Acepta las politicas de privacidad")
	@Column(name="politicas_privacidad")
	private Boolean politicasPrivacidad=false;
}
