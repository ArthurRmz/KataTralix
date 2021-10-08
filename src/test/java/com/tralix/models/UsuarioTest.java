package com.tralix.models;

import static org.junit.Assert.*;

import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import org.junit.Before;
import org.junit.Test;

public class UsuarioTest {
	
	private Validator validator;

    @Before
    public void setUp() {
    	ValidatorFactory vf = Validation.buildDefaultValidatorFactory();
        this.validator = vf.getValidator();
    }

	@Test
	public void checarInstancia() {
		Usuario usuario = new Usuario();
		assertEquals(usuario.getClass(), Usuario.class);
	}
	
	@Test
	public void checarCampos() {
		Usuario usuario = new Usuario();
		usuario.setEmail("prueba@gmail.com");
		usuario.setNombre("prueba");
		usuario.setEmpresa("Empresa");
		usuario.setEstado("Estado");
		usuario.setPoliticasPrivacidad(true);
		
		Set<ConstraintViolation<Usuario>> violations = this.validator.validate(usuario);
		
		assertEquals(true, violations.isEmpty());
	}

}
