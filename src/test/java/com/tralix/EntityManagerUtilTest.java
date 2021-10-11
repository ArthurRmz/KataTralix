package com.tralix;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;

import org.junit.Test;

public class EntityManagerUtilTest {

	@Test
	public void checarInstancia() {
		EntityManagerUtil impl = new EntityManagerUtil();
		assertEquals(impl.getClass(), EntityManagerUtil.class);
	}

	@Test
	public void checarNull() {
		EntityManager tipo = EntityManagerUtil.getEntityManager();
		assertNotNull(tipo);
	}

}
