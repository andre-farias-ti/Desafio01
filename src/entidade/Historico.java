package entidade;

import java.util.Date;

import service.GerenciaHistoricoService;

public class Historico implements GerenciaHistoricoService{

	private Cliente cliente;
	private OS os;
	private Tecnico tecnico;
	private Date dtInicial;
	private Date dtFinal;
	private String descricao;
	
	public Historico(Cliente cliente, OS os, Tecnico tecnico, Date dtInicial, 
			Date dtFinal, String descricao) {
		super();
		this.cliente = cliente;
		this.os = os;
		this.tecnico = tecnico;
		this.dtInicial = dtInicial;
		this.dtFinal = dtFinal;
		this.descricao = descricao;
	}
	
	public Date getDtInicial() {
		return dtInicial;
	}
	public void setDtInicial(Date dtInicial) {
		this.dtInicial = dtInicial;
	}
	public Date getDtFinal() {
		return dtFinal;
	}
	public void setDtFinal(Date dtFinal) {
		this.dtFinal = dtFinal;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public OS getOs() {
		return os;
	}
	public void setOs(OS os) {
		this.os = os;
	}
	public Tecnico getTecnico() {
		return tecnico;
	}
	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}
	
	@Override
	public void exibirHistorico() {

		System.out.println("Nome Cliente: " + this.getCliente().getNome());
		System.out.println("Contrato Cliente: " + this.getCliente().getContrato());
		System.out.println("Nome Tecnico: " + this.getTecnico().getNome());
		System.out.println("Data do Registro: " + this.getDtFinal());
		System.out.println("Resumo: " + this.getDescricao());
		System.out.println("Fim do Historico!");

	}
}
