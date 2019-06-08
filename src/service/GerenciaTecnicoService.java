package service;

import java.text.ParseException;
import java.util.ArrayList;

import entidade.OS;
import entidade.Tecnico;

public interface GerenciaTecnicoService {
	
	public Tecnico salvarTecnico(ArrayList<Tecnico> listaTecnico) throws ParseException;

	public void resolverOS(ArrayList<OS> listaOS) throws ParseException;
	
	public void fazAniversario(); 
}
