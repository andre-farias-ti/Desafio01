package entidade;

import java.util.Date;
import java.util.Scanner;

import service.GerenciarOSService;

public class OS implements GerenciarOSService{
	
	private Tecnico tecnico;
	private Date dhFinal;
	private int numeroOS;
	private Date dhInicial;
	private Categoria categorias;
	private Date agendamento;
	private String resumo;
	private String situacao;
	private Cliente cliente;
	
	public OS() {
		super();
		this.numeroOS = 001;
	}
	
	public Tecnico getTecnico() {
		return tecnico;
	}
	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}
	public Date getDhFinal() {
		return dhFinal;
	}
	public void setDhFinal(Date dhFinal) {
		this.dhFinal = dhFinal;
	}
	public int getNumeroOS() {
		return numeroOS;
	}
	public void setNumeroOS(int numeroOS) {
		this.numeroOS = numeroOS;
	}
	public Date getDhInicial() {
		return dhInicial;
	}
	public void setDhInicial(Date dhInicial) {
		this.dhInicial = dhInicial;
	}
	public Categoria getCategorias() {
		return categorias;
	}
	public void setCategorias(Categoria categorias) {
		this.categorias = categorias;
	}
	public Date getAgendamento() {
		return agendamento;
	}
	public void setAgendamento(Date agendamento) {
		this.agendamento = agendamento;
	}
	public String getResumo() {
		return resumo;
	}
	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public OS cadastraOS() {
		OS os = new OS();
		Scanner scanner = new Scanner(System.in);  
		os.setDhInicial(new Date());
		System.out.println("Insira um Tecnico:");
		os.setTecnico(new Tecnico().salvarTecnico());
		System.out.println("Insira um Cliente:");
		os.setCliente(new Cliente().salvarCliente());
		
		return os;
	}

}
