package entidade;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;

import service.GerenciarOSService;

public class OS implements GerenciarOSService{
	
	private Tecnico tecnico;
	private Date dhFinal;
	private String numeroOS;
	private Date dhInicial;
	private Categoria categorias;
	private Date agendamento;
	private String resumo;
	private String situacao;
	private Cliente cliente;
	
	public OS() {
		super();
		Long numeroOS = new Random().nextLong();
		this.numeroOS = numeroOS.toString();
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
	public String getNumeroOS() {
		return numeroOS;
	}
	public void setNumeroOS(String numeroOS) {
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
	public OS cadastraOS(ArrayList<Cliente> listaCliente, ArrayList<Tecnico> listaTecnico) throws ParseException {
		
		if(listaCliente.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Cadastre um Cliente!", null, 1);
			return null;
		}else {
			List<String> nomes = new ArrayList<String>();

			for (Cliente c : listaCliente) {
				nomes.add(c.getNome());
			}

			Object cliente = JOptionPane.showInputDialog(null, "Por Favor Escolha um Cliente", "Nome",
					JOptionPane.QUESTION_MESSAGE, null, nomes.toArray(), 1);

			for (Cliente c : listaCliente) {
				if (c.getNome().equals(cliente)) {
					this.setCliente(c);
				}
			}
		}
			
		
		if (listaTecnico.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Cadastre um Tecnico!", null, 1);
			return null;
		} else {

			List<String> nomes = new ArrayList<String>();

			for (Tecnico tec : listaTecnico) {
				nomes.add(tec.getNome());
			}

			Object tecnico = JOptionPane.showInputDialog(null, "Por Favor Escolha um Tecnico", "Nome",
					JOptionPane.QUESTION_MESSAGE, null, nomes.toArray(), 1);

			for (Tecnico tec : listaTecnico) {
				if (tec.getNome().equals(tecnico.toString())) {
					this.setTecnico(tec);
				}
			}
		}

		return this;
	}

}
