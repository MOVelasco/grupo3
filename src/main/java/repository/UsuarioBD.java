package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tarefa.modelo.Usuario;


public interface UsuarioBD extends JpaRepository<Usuario, Long>  {

}
