package entidade;

import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.JFrame;

import frame.CadastraAtendenteFrame;
import service.GerenciaAtendenteService;

public class Atendente extends Pessoa implements GerenciaAtendenteService {

	private String matricula;

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
	public Atendente salvarAtendente(ArrayList<Atendente> listaAtendente) throws ParseException {

		JFrame frame = new CadastraAtendenteFrame(listaAtendente);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setLocationRelativeTo( null );
        frame.setVisible( true );
		
		//		String nome = JOptionPane.showInputDialog("Digite o nome do Atendente:");
//		String telefone = JOptionPane.showInputDialog("Digite o Telefone:");
//		String dtNascimento = JOptionPane.showInputDialog("Digite a data de nascimento");
//		String cpf = JOptionPane.showInputDialog("Digite o numero de CPF");
//		Atendente atendente = new Atendente();
//		atendente.setNome(nome);
//		Random gerador  = new Random();
//		Long matricula = gerador.nextLong();
//		atendente.setMatricula(matricula.toString());
//		atendente.setTelefone(telefone);
//		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
//		Date dataFormatada = formato.parse(dtNascimento);
//		atendente.setDtNascimento(dataFormatada);
//		atendente.setCPF(cpf);
//		
//		JOptionPane.showMessageDialog(null, "Atendente Salvo!", null, 1);
//		
		return null;
	}
}
