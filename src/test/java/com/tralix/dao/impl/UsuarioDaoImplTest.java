package com.tralix.dao.impl;

import static org.junit.Assert.*;
import org.junit.Test;

public class UsuarioDaoImplTest {

	@Test
	public void checarInstancia() {
		UsuarioDaoImpl impl = new UsuarioDaoImpl();
		assertEquals(impl.getClass(), UsuarioDaoImpl.class);
	}

}
