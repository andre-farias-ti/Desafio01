package frame;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import entidade.Cliente;

public class CadastroClienteFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	public CadastroClienteFrame(ArrayList<Cliente> listaCliente) {

        // setting up JFrame
        setLayout(new GridLayout(1, 1));
        setPreferredSize(new Dimension(350, 200));
        setResizable(false);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
        JPanel principal = new JPanel( new GridLayout(2, 1) );
        
        JPanel panel = new JPanel( new GridLayout(5, 2) );
        
        panel.add( new JLabel("Nome do cliente") );
        JTextField nomeCliente = new JTextField(50);
        panel.add( nomeCliente );
        panel.add( new JLabel("Numero de contrato") );
        JTextField numeroContrato = new JTextField(50);
        panel.add( numeroContrato );
        panel.add( new JLabel("Telefone") );
        JTextField telefone = new JTextField(50);
        panel.add( telefone );
        panel.add( new JLabel("Data de nascimento") );
        
        JFormattedTextField dataNascimento = new JFormattedTextField();
        MaskFormatter maskDataNacimento;
		try {
			maskDataNacimento = new MaskFormatter("##/##/####");
			maskDataNacimento.install(dataNascimento); 
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
        
        panel.add( dataNascimento );
        panel.add( new JLabel("Numero de CPF") );
        
        JFormattedTextField numeroCPF = new JFormattedTextField();
        MaskFormatter maskData;
		try {
			maskData = new MaskFormatter("###.###.###-##");
			maskData.install(numeroCPF); 
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
        
        panel.add( numeroCPF );
        principal.add(panel);
        
        JButton CadastrarCliente = new JButton("Cadastrar Cliente");
        CadastrarCliente.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					Cliente cliente = new Cliente();
					cliente.setNome(nomeCliente.getText());
					cliente.setContrato(numeroContrato.getText());
					SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
					Date dataFormatada = formato.parse(dataNascimento.getText());
					cliente.setDtNascimento(dataFormatada);
					cliente.setTelefone(telefone.getText());
					cliente.setId(UUID.randomUUID());
					cliente.setCPF(numeroCPF.getText());
					
					listaCliente.add(cliente);
					
					JOptionPane.showMessageDialog(null, "cliente Salvo!", null, 1);
					
					CadastroClienteFrame.this.dispose();
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
				
			}
        });
        
        principal.add( CadastrarCliente );
        
        add(principal);

        pack();

    }
}