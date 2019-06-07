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

//		while (sair) {

//			Object tests = JOptionPane.showInputDialog(null, "Please choose a name", "Example 1",
//					JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Amanda",
//							"Colin", "Don", "Fred", "Gordon", "Janet", "Jay",
//							"Joe", "Judie", "Kerstin", "Lotus", "Maciek", "Mark",
//							"Mike", "Mulhern", "Oliver", "Peter", "Quaxo", "Rita",
//							"Sandro", "Tim", "Will" }, "Joe");
//			
//			System.out.println(tests);
			
			JFrame frame = new JFrameMain(listaCliente, listaAtendente, listaOS, listaTecnico);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setLocationRelativeTo( null );
	        frame.setVisible( true );
			
//			String[] options = {"Cadastrar Cliente","Cadastrar Atendente", "Cadastra Orden de Serviço", "Resolver Orden de Serviço","Exibir historico digite", "Iniciar Atendimento"};
			
//	        JPanel panel = new JPanel( new GridLayout(6, 1) );
//	        for (String string : options) {
//				
//	        	panel.add( new JButton(string) );
//			}
//	        panel.setVisible(true);
//	        
//	        frame.add( panel );
	        
	        
//	        panel.add( new JLabel("First Name") );
//	        JTextField firstName = new JTextField(10);
//	      firstName.addAncestorListener( new RequestFocusListener(false) );
//	        panel.add( firstName );
//	        panel.add( new JLabel("Last Name") );
//	        JTextField lastName = new JTextField(10);
//	        panel.add( lastName );
//	        int x = 5;
//	        int x = JOptionPane.showOptionDialog(frame,
//	                "O QUE DESEJA FAZER:",
//					"Opções:",
//					JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, options[0]);
	        
			
//			int x = JOptionPane.showOptionDialog(frame, "O QUE DESEJA FAZER:",
//					"Opções:",
//					JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

//			switch (x) {
//
//			case 0:
//				Cliente cliente = new Cliente();
//				listaCliente.add(cliente.salvarCliente());
//				break;
//			case 1:
//				Atendente atendente = new Atendente();
//				listaAtendente.add(atendente.salvarAtendente());
//				break;
//			case 2:
//				OS os = new OS();
//				listaOS.add(os.cadastraOS(listaCliente, listaTecnico));
//				break;
//			case 3:
//					Tecnico tecnico = new Tecnico();
//					tecnico.resolverOS(listaOS);
//				break;
//			case 4:
//				if (!listaOS.isEmpty()) {
//					Historico historico = new Historico(listaCliente.get(0), listaOS.get(0),
//							listaOS.get(0).getTecnico(), new Date(), new Date(), listaOS.get(0).getResumo());
//				} else {
//					System.out.println("N�o exite Historico!");
//				}
//				break;
//			case 5:
//				sair = false;
//				break;
//			
//			case 6:
//				
//				break;	
//			}
//		}

	}
	

}

