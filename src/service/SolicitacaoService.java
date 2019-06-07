package service;

import entidade.Atendente;
import entidade.Cliente;
import entidade.OS;
import entidade.Solicitacao;

public interface SolicitacaoService {
	
	public Solicitacao gerarSolicitacao(Cliente cliente, Atendente atendente, OS ordemServico);

}
