package service;

import javax.swing.JOptionPane;

public final class MenssagenService {
	
	public static void menssagenSucesso() {
		JOptionPane.showMessageDialog(null, "Operação Realisada Com Sucesso!", null, 1);
	}
	
	public static void menssagenErro() {
		JOptionPane.showMessageDialog(null, "Ocorreo um erro na operação!", null, 1);
	}
	
	public static void menssagen(String meString) {
		JOptionPane.showMessageDialog(null, meString , null, 1);
	}

}
