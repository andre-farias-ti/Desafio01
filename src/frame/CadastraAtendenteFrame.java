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

import entidade.Atendente;

public class CadastraAtendenteFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	public CadastraAtendenteFrame(ArrayList<Atendente> listaAtendente) {

        // setting up JFrame
        setLayout(new GridLayout(1, 1));
        setPreferredSize(new Dimension(350, 200));
        setResizable(false);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
        JPanel principal = new JPanel( new GridLayout(2, 1) );
        
        JPanel panel = new JPanel( new GridLayout(5, 2) );
        
        panel.add( new JLabel("Nome do Atendente") );
        JTextField nomeAtendente = new JTextField(50);
        panel.add( nomeAtendente );
        panel.add( new JLabel("Numero de Matricula") );
        JTextField numeroMatricula = new JTextField(50);
        panel.add( numeroMatricula );
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
        
        JButton CadastrarCliente = new JButton("Cadastrar Atendente");
        CadastrarCliente.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					Atendente atendente = new Atendente();
					atendente.setNome(panel.getPropertyChangeListeners("nome").toString());
					atendente.setMatricula(numeroMatricula.getText());
					SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
					Date dataFormatada = formato.parse(dataNascimento.getText());
					atendente.setDtNascimento(dataFormatada);
					atendente.setTelefone(telefone.getText());
					atendente.setId(UUID.randomUUID());
					atendente.setCPF(numeroCPF.getText());
					
					listaAtendente.add(atendente);
					
					JOptionPane.showMessageDialog(null, "Atendente Salvo!", null, 1);
					
					CadastraAtendenteFrame.this.dispose();
					
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
