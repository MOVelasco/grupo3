package main.tarefa.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(length=60)
	private String nome;
	@Column(length=70, nullable=false)
	private String senha;
	@Column(length=60, unique=true, nullable=false)
	private String email;
	@ManyToMany(mappedBy="usuariosDestino")
	private List<Tarefa> listatarefas;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public List<Tarefa> getListatarefas() {
		return listatarefas;
	}
	public void setListatarefas(List<Tarefa> listatarefas) {
		this.listatarefas = listatarefas;
	}

}