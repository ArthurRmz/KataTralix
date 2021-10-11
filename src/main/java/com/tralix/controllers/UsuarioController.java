package com.tralix.controllers;

import java.io.IOException;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.tralix.models.Usuario;
import com.tralix.services.UsuarioService;
import com.tralix.services.injector.UsuarioInjector;
import lombok.Data;
import lombok.extern.log4j.Log4j2;

@Named
@Log4j2
@ViewScoped
@Data
public class UsuarioController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private UsuarioService userFacade;
	
	private Usuario usuario;
	
	@PostConstruct
	private void init() {
		Injector injector = Guice.createInjector(new UsuarioInjector());
		setUserFacade(injector.getInstance(UsuarioService.class));
        
        setUsuario(new Usuario());
        log.info("Init...");
	}
	
	public void guardarUsuario() {
		
		log.info("guardarUsuario: ".concat(getUsuario().toString()));
		userFacade.agregarUsuario(getUsuario());
		cambiarPagina();
	}
	
	public void cambiarPagina() {
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect("success.xhtml");
		} catch (IOException e) {
		}
	}

}
