package com.tralix.services.impl;

import static org.junit.Assert.*;
import org.junit.Test;
import com.tralix.services.UsuarioService;

public class UsuarioServiceImplTest {

	@Test
	public void checarInstancia() {
		UsuarioServiceImpl impl = new UsuarioServiceImpl();
		assertEquals(impl.getClass(), UsuarioServiceImpl.class);
	}
	
	@Test
	public void checarSiTieneInterface() {
		assertEquals(true, UsuarioService.class.isAssignableFrom(UsuarioServiceImpl.class));
	}

}
