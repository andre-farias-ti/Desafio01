package entidade;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import service.GerenciaTecnicoService;

public class Tecnico extends Pessoa implements GerenciaTecnicoService{

	private String matricula;
	
	private Grupo grupo;

	public Tecnico() {
		super();
		this.matricula = "0002";
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public void resolverOS(OS os) throws ParseException {

		Scanner scanner = new Scanner(System.in);  
		System.out.println("OS de numero: "+ os.getNumeroOS());
		System.out.println("Contrato do Cliente: "+ os.getCliente().getContrato());
		System.out.println("Nome do Cliente: "+ os.getCliente().getNome());
		System.out.println("Digite o nome da categoria:");
		String s1 = scanner.nextLine();
		os.setCategorias(new Categoria(s1));
		System.out.println("Digite o nome da subCategoria:");
		String s2 = scanner.nextLine();
		os.getCategorias().setSubCategoria(new SubCategoria(s2));
		System.out.println("Digite o nome do item:");
		String s3 = scanner.nextLine();
		os.getCategorias().getSubCategoria().setItem(new Item(s3));
		System.out.println("Digite a situação:");
		String s4 = scanner.nextLine();
		os.setSituacao(s4);
		System.out.println("Digite a Resumo:");
		String s5 = scanner.nextLine();
		os.setResumo(s5);
		System.out.println("Digite a Data Final:");
		String s6 = scanner.nextLine();
		//convertendendo String em data
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date dataFormatada = formato.parse(s6);
		os.setDhFinal(dataFormatada);
		System.out.println("SUA OS FOI RESOLVIDA E ESTARA NO HISTORICO");
	}

	@Override
	public void fazAniversario() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Tecnico salvarTecnico() {
		Scanner scanner = new Scanner(System.in);  
		System.out.println("Digite o nome do tecnico:");
		String s1 = scanner.nextLine();
		Tecnico tecnico = new Tecnico();
		tecnico.setNome(s1);
		tecnico.setGrupo(new Grupo());
		return tecnico;
	}
	
}
