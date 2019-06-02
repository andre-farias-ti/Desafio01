package entidade;

import java.util.Date;
import java.util.Scanner;

import service.GerenciaAtendenteService;

public class Atendente extends Pessoa implements GerenciaAtendenteService {

	private String matricula;

	public Atendente() {
		super();
		this.matricula = "10005";
		geraAtendimento();
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public void geraAtendimento() {

		Scanner scanner = new Scanner(System.in);  
		OS os = new OS();
		
		//incluindo tecnico
		System.out.println("Digite o nome do tecnico:");
		String s2 = scanner.nextLine();
		Tecnico tec = new Tecnico();
		tec.setNome(s2);
		
		System.out.println("Digite o nome do categoria:");
		String s3 = scanner.nextLine();
		Categoria categoria = new Categoria(s3);
		
		System.out.println("Digite o nome do subCategotia:");
		String s4 = scanner.nextLine();
		SubCategoria subcat = new SubCategoria(s4);
		
		System.out.println("Digite o nome do item:");
		String s5 = scanner.nextLine();
		Item item = new Item(s5);		
		
		os.setTecnico(tec);
		os.setDhInicial(new Date());
		
		
		//Solicitacao solitacao = new Solicitacao(c, this, 1, 1, os);
		System.out.println("Orden de Srviço Gerada com Sucesso de numero: "+ os.getNumeroOS());
		
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
