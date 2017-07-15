package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import moduloTarefa.Usuario;

public interface UsuarioBD extends JpaRepository<Usuario, Long>  {

}
