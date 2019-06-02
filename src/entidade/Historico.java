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
		// TODO Auto-generated method stub
		
	}
}
