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

        return null;
	}
}
