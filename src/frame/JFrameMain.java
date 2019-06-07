package frame;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import entidade.Atendente;
import entidade.Cliente;
import entidade.OS;
import entidade.Tecnico;

public class JFrameMain extends JFrame {

	private static final long serialVersionUID = 1L;

	public JFrameMain(ArrayList<Cliente> listaCliente, ArrayList<Atendente> listaAtendente, ArrayList<OS> listaOS,
    		ArrayList<Tecnico> listaTecnico) {
    	
        // setting up JFrame
        setLayout(new GridLayout(1, 1));
        setPreferredSize(new Dimension(420, 600));
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        JPanel panel = new JPanel( new GridLayout(6, 1) );
        
        JButton CadastrarCliente = new JButton("Cadastrar Cliente");
        CadastrarCliente.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
					Cliente cliente = new Cliente();
					cliente.salvarCliente(listaCliente);
				} catch (Exception e2) {
					// TODO: handle exception
				}
				
			}
        });
        
        panel.add(CadastrarCliente);
        
        JButton CadastrarAtendente = new JButton("Cadastrar Atendente");
        CadastrarAtendente.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					Atendente atendente = new Atendente();
					atendente.salvarAtendente(listaAtendente);
				} catch (Exception e2) {
					// TODO: handle exception
				}
				
			}
        });
        
        panel.add(CadastrarAtendente);
        
        JButton cadastrarOS = new JButton("Cadastra Orden de Serviço");
        cadastrarOS.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					OS os = new OS();
					listaOS.add(os.cadastraOS(listaCliente, listaTecnico));
				} catch (Exception e2) {
					// TODO: handle exception
				}
				
			}
        });
        
        panel.add(cadastrarOS);
        
        JButton resolverOS = new JButton("Resolver Orden de Serviço");
        resolverOS.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					Tecnico tecnico = new Tecnico();
					tecnico.resolverOS(listaOS);
				} catch (Exception e2) {
					// TODO: handle exception
				}
				
			}
        });
        
        panel.add(resolverOS);
        
        JButton cadastraTecnico = new JButton("Cadastra Tecnico");
        cadastraTecnico.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					Tecnico tecnico = new Tecnico();
					tecnico.salvarTecnico(listaTecnico);
				} catch (Exception e2) {
					// TODO: handle exception
				}
				
			}
        });
        
        panel.add(cadastraTecnico);
        
        JButton exibirHistorico = new JButton("Exibir Historico");
        exibirHistorico.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
//					
//					Historico historico = new Historico();
//					historico.exibirHistorico();
				} catch (Exception e2) {
					// TODO: handle exception
				}
				
			}
        });
        
        panel.add(exibirHistorico);
        
        add(panel);


        pack();

    }
}