package service;

import entidade.Cliente;

public interface GerenciaClienteService {
	
	public void solicitarAtendimento();
	
	public Cliente salvarCliente();

	public void fazAniversario(); 
}
