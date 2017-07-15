package tarefa.modelo;

import java.util.Date;
import java.util.List;

public class Tarefa {

	private Long tarefaID;
	
	private Usuario usuarioOrigem;
	
	private List<Usuario> usuariosDestino;
	
	private Date dataInicio;
	
	private Date dataFim;
	
	private String status;
	
	private String prioridade;

	public Tarefa(Long tarefaID, Usuario usuarioOrigem, List<Usuario> usuariosDestino, Date dataInicio, Date dataFim,
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

	public Usuario getUsuarioOrigem() {
		return usuarioOrigem;
	}

	public void setUsuarioOrigem(Usuario usuarioOrigem) {
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
