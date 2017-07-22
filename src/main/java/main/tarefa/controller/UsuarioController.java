package main.tarefa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import main.tarefa.modelo.Usuario;
import main.tarefa.repository.UsuarioBD;

@Controller
@RequestMapping(path="/users")
public class UsuarioController {
	
	@Autowired
	private UsuarioBD usuarioBd;
	
	@GetMapping()
	public @ResponseBody Iterable<Usuario> all(){
		return usuarioBd.findAll();
	}
	
	@RequestMapping(value="/salvar", method = RequestMethod.POST)
	public @ResponseBody String salvarUsuario(Usuario usuario){
		usuarioBd.save(usuario);
		return "Saved";
	}
	
	@PostMapping
	public @ResponseBody String add(@RequestBody Usuario usuario){
		usuarioBd.save(usuario);
		return "Saved";
	}
	
	@DeleteMapping(path="/{id}")
	public @ResponseBody String delete(@PathVariable Long id){
		usuarioBd.delete(id);
		return "Deleted";
	}
	
	@GetMapping(path="/{id}")
	public ResponseEntity <Usuario> getOne(@PathVariable Long id){
		Usuario usuario = usuarioBd.findOne(id);
		return new ResponseEntity<Usuario>(usuario, HttpStatus.CREATED);
	}
	
	@PutMapping(path="/{id}")
	public ResponseEntity <Usuario> update(@PathVariable Integer id,
									@RequestBody Usuario usuario){
		usuarioBd.save(usuario);
		return new ResponseEntity<Usuario>(usuario, HttpStatus.CREATED);
	}
	
}