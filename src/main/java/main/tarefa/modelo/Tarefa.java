package main.tarefa.modelo;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity
public class Tarefa {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long tarefaID;
	
	//@ManyToOne(fetch=FetchType.LAZY)
	@Column
	private Long usuarioOrigem;
	
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="tarefas_usuarios", joinColumns=@JoinColumn(name="fk_tarefa"),
	inverseJoinColumns=@JoinColumn(name="fk_usuario"))
	private List<Usuario> usuariosDestino;
	
	private Date dataInicio;
	
	private Date dataFim;
	
	private String status;
	
	private String prioridade;

	public Tarefa() {
		// TODO Auto-generated constructor stub
	}
	
	public Tarefa(Long tarefaID, long usuarioOrigem, List<Usuario> usuariosDestino, Date dataInicio, Date dataFim,
			String status, String prioridade) {
		super();
		this.tarefaID = tarefaID;
		this.usuarioOrigem = usuarioOrigem;
		this.usuariosDestino = usuariosDestino;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.status = status;
		this.prioridade = prioridade;
	}

	public Long getTarefaID() {
		return tarefaID;
	}

	public void setTarefaID(Long tarefaID) {
		this.tarefaID = tarefaID;
	}

	public Long getUsuarioOrigem() {
		return usuarioOrigem;
	}

	public void setUsuarioOrigem(Long usuarioOrigem) {
		this.usuarioOrigem = usuarioOrigem;
	}

	public List<Usuario> getUsuariosDestino() {
		return usuariosDestino;
	}

	public void setUsuariosDestino(List<Usuario> usuariosDestino) {
		this.usuariosDestino = usuariosDestino;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}
	
}
