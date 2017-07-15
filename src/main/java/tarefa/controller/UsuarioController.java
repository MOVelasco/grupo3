package tarefa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import repository.UsuarioBD;

@RequestMapping(path="/users")
public class UsuarioController {
	
	@Autowired
	private UsuarioBD usuarioBd;
	
	
}