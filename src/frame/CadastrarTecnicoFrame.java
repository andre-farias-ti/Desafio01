package frame;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import entidade.Tecnico;

public class CadastrarTecnicoFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	public CadastrarTecnicoFrame(List<Tecnico> listaTecnico) {

        // setting up JFrame
        setLayout(new GridLayout(1, 1));
        setPreferredSize(new Dimension(350, 200));
        setResizable(false);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
        JPanel principal = new JPanel( new GridLayout(2, 1) );
        
        JPanel panel = new JPanel( new GridLayout(5, 2) );
        
        panel.add( new JLabel("Nome do Tecnico") );
        JTextField nomeTecnico = new JTextField(50);
        panel.add( nomeTecnico );
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
        
        JButton CadastrarCliente = new JButton("Cadastrar Tecnico");
        CadastrarCliente.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					Tecnico tecnico = new Tecnico();
					tecnico.setNome(nomeTecnico.getText());
					tecnico.setMatricula(numeroMatricula.getText());
					SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
					Date dataFormatada = formato.parse(dataNascimento.getText());
					tecnico.setDtNascimento(dataFormatada);
					tecnico.setTelefone(telefone.getText());
					tecnico.setId(UUID.randomUUID());
					tecnico.setCPF(numeroCPF.getText());
					
					listaTecnico.add(tecnico);
					
					JOptionPane.showMessageDialog(null, "Tecnico Salvo!", null, 1);
					
					CadastrarTecnicoFrame.this.dispose();
					
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
