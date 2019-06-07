package service;

import java.text.ParseException;
import java.util.ArrayList;

import entidade.Atendente;

public interface GerenciaAtendenteService {
	
	public Atendente salvarAtendente(ArrayList<Atendente> listaAtendente) throws ParseException;
	
	public void fazAniversario();

}
