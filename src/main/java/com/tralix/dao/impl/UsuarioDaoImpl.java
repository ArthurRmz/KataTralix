package com.tralix.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import com.tralix.dao.UsuarioDao;
import com.tralix.models.Usuario;

@Repository
public class UsuarioDaoImpl implements UsuarioDao {

	@PersistenceContext
    private EntityManager entityManager;
	
	@Override
	public void agregarUsuario(Usuario usuario) {
		entityManager.createNativeQuery("INSERT INTO person (email, nombre, empresa, estado, politicas_privacidad) VALUES (?,?,?,?)")
	      .setParameter(1, usuario.getEmail())
	      .setParameter(2, usuario.getNombre())
	      .setParameter(3, usuario.getEmpresa())
	      .setParameter(4, usuario.getEstado())
	      .setParameter(5, usuario.getPoliticasPrivacidad())
	      .executeUpdate();
	}

}
