package com.tralix.services.injector;

import com.google.inject.AbstractModule;
import com.tralix.services.UsuarioService;
import com.tralix.services.impl.UsuarioServiceImpl;

public class UsuarioInjector extends AbstractModule {

	@Override
	protected void configure() {
		bind(UsuarioService.class).to(UsuarioServiceImpl.class);
	}

}
