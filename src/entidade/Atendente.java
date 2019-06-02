package entidade;

import java.util.Date;
import java.util.Scanner;

import service.GerenciaAtendenteService;

public class Atendente extends Pessoa implements GerenciaAtendenteService {

	private String matricula;

	public Atendente() {
		super();
		this.matricula = "10005";
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public void fazAniversario() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Atendente salvarAtendente() {
		Scanner scanner = new Scanner(System.in);  
		System.out.println("Digite o nome do Atendente:");
		String s1 = scanner.nextLine();
		System.out.println("Digite a Matricula:");
		String s2 = scanner.nextLine();
		Atendente atendente = new Atendente();
		atendente.setNome(s1);
		atendente.setMatricula(s2);
		
		return atendente;
	}
}
