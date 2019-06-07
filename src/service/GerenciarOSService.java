package service;

import java.text.ParseException;
import java.util.ArrayList;

import entidade.Cliente;
import entidade.OS;
import entidade.Tecnico;

public interface GerenciarOSService {

	public OS cadastraOS(ArrayList<Cliente> listaCliente, ArrayList<Tecnico> listaTecnico) throws ParseException;
}
