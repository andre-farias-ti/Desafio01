package entidade;

public class Solicitacao {

	private int id;
	private Cliente cliente;
	private Atendente atendente;
	private int prioridade;
	private int tipoSol;
	private OS ordemServico;
	
	public Solicitacao(Cliente cliente, Atendente atendente, int prioridade, int tipoSol, OS ordemServico) {
		super();
		this.cliente = cliente;
		this.atendente = atendente;
		this.prioridade = prioridade;
		this.tipoSol = tipoSol;
		this.ordemServico = ordemServico;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Atendente getAtendente() {
		return atendente;
	}
	public void setAtendente(Atendente atendente) {
		this.atendente = atendente;
	}
	public int getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
	public int getTipoSol() {
		return tipoSol;
	}
	public void setTipoSol(int tipoSol) {
		this.tipoSol = tipoSol;
	}
	public OS getOrdemServico() {
		return ordemServico;
	}
	public void setOrdemServico(OS ordemServico) {
		this.ordemServico = ordemServico;
	}
}
