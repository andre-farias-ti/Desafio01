
package entidade;

import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.JFrame;

import frame.CadastroClienteFrame;
import service.GerenciaClienteService;

public class Cliente extends Pessoa implements GerenciaClienteService {

	private String contrato;
	private String equipamento;

	public String getContrato() {
		return contrato;
	}
	public void setContrato(String contrato) {
		this.contrato = contrato;
	}
	public String getEquipamento() {
		return equipamento;
	}
	public void setEquipamento(String equipamento) {
		this.equipamento = equipamento;
	}
	
	@Override
	public void solicitarAtendimento(Cliente cliente, Atendente atendente, OS ordemServico) {
		Solicitacao solicitacao = new Solicitacao();
		solicitacao.gerarSolicitacao(cliente, atendente, ordemServico);
	}
	
	@Override
	public void fazAniversario() {
		// TODO Auto-generated method stub
	}
	
	@Override
	public Cliente salvarCliente(ArrayList<Cliente> listaCliente) throws ParseException {
		
		JFrame frame = new CadastroClienteFrame(listaCliente);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setLocationRelativeTo( null );
        frame.setVisible( true );
		
		return null;
	}
}
