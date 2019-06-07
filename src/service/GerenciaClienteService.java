package service;

import java.text.ParseException;
import java.util.ArrayList;

import entidade.Atendente;
import entidade.Cliente;
import entidade.OS;

public interface GerenciaClienteService {
	
	public void solicitarAtendimento(Cliente cliente, Atendente atendente, OS ordemServico);
	
	public Cliente salvarCliente(ArrayList<Cliente> listaCliente) throws ParseException;

	public void fazAniversario(); 
}
