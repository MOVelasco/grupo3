package main.tarefa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import main.tarefa.modelo.Usuario;

public interface UsuarioBD extends JpaRepository<Usuario, Long>  {

}
