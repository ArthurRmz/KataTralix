package com.tralix.services;

import javax.persistence.PersistenceException;
import javax.persistence.QueryTimeoutException;
import javax.persistence.TransactionRequiredException;
import com.tralix.models.Usuario;

public interface UsuarioService {
	
	public Usuario agregarUsuario(Usuario usuario) throws IllegalStateException, TransactionRequiredException, QueryTimeoutException, PersistenceException;
}
