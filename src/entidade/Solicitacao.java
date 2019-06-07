package entidade;

import javax.swing.JOptionPane;

import service.SolicitacaoService;

public class Solicitacao implements SolicitacaoService {

	private int id;
	private Cliente cliente;
	private Atendente atendente;
	private String prioridade;
	private String tipoSol;
	private OS ordemServico;
	
	public Solicitacao(){};
	
	public Solicitacao(Cliente cliente, Atendente atendente, OS ordemServico) {
		this.cliente = cliente;
		this.atendente = atendente;
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
	public String getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}
	public String getTipoSol() {
		return tipoSol;
	}
	public void setTipoSol(String tipoSol) {
		this.tipoSol = tipoSol;
	}
	public OS getOrdemServico() {
		return ordemServico;
	}
	public void setOrdemServico(OS ordemServico) {
		this.ordemServico = ordemServico;
	}

	@Override
	public Solicitacao gerarSolicitacao(Cliente cliente, Atendente atendente, OS ordemServico) {
		
		String nome = JOptionPane.showInputDialog("Digite o nome do cliente:");
		String contrato = JOptionPane.showInputDialog("Digite o numero de contrato");
		
		return null;
	}
}
