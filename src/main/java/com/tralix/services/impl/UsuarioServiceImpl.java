package com.tralix.services.impl;

import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.QueryTimeoutException;
import javax.persistence.TransactionRequiredException;
import com.tralix.EntityManagerUtil;
import com.tralix.models.Usuario;
import com.tralix.services.UsuarioService;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Singleton
public class UsuarioServiceImpl implements UsuarioService{
	
	@Override
	public Usuario agregarUsuario(Usuario usuario)
			throws IllegalStateException, TransactionRequiredException, QueryTimeoutException, PersistenceException {
		log.info("UsuarioServiceImpl");
		EntityManager entity = EntityManagerUtil.getEntityManager();
		entity.getTransaction().begin();
		entity.createNativeQuery("INSERT INTO usuarios (email, nombre, empresa, estado, politicas_privacidad) VALUES (?,?,?,?,?)")
	      .setParameter(1, usuario.getEmail())
	      .setParameter(2, usuario.getNombre())
	      .setParameter(3, usuario.getEmpresa())
	      .setParameter(4, usuario.getEstado())
	      .setParameter(5, usuario.getPoliticasPrivacidad())
	      .executeUpdate();
		entity.getTransaction().commit();
		return usuario;
	}
}
