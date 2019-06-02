package service;

import java.text.ParseException;

import entidade.OS;
import entidade.Tecnico;

public interface GerenciaTecnicoService {
	
	public Tecnico salvarTecnico();

	public void resolverOS(OS os) throws ParseException;
	
	public void fazAniversario(); 
}
