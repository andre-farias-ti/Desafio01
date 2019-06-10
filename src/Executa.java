import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.JFrame;

import entidade.Atendente;
import entidade.Cliente;
import entidade.OS;
import entidade.Tecnico;
import frame.JFrameMain;

public class Executa {

	public static void main(String[] args) throws ParseException {

		ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
		ArrayList<Atendente> listaAtendente = new ArrayList<Atendente>();
		ArrayList<OS> listaOS = new ArrayList<OS>();
		ArrayList<Tecnico> listaTecnico = new ArrayList<Tecnico>();

		JFrame frame = new JFrameMain(listaCliente, listaAtendente, listaOS, listaTecnico);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}
	

}

