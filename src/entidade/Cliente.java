
package entidade;

import java.util.Scanner;

import service.GerenciaClienteService;

public class Cliente extends Pessoa implements GerenciaClienteService{

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
	public void solicitarAtendimento() {
		Atendente atendente = new Atendente();
	}
	
	@Override
	public void fazAniversario() {
		// TODO Auto-generated method stub
	}
	@Override
	public Cliente salvarCliente() {
		Scanner scanner = new Scanner(System.in);  
		System.out.println("Digite o nome do cliente:");
		String s1 = scanner.nextLine();
		System.out.println("Digite o contrato:");
		String s2 = scanner.nextLine();
		Cliente cliente = new Cliente();
		cliente.setNome(s1);
		cliente.setContrato(s2);
		
		return cliente;
	}
}
