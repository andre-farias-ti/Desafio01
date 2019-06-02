import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import entidade.Atendente;
import entidade.Cliente;
import entidade.Historico;
import entidade.OS;
import entidade.Tecnico;

public class Executa {

	public static void main(String[] args) throws ParseException {
		
		ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
		ArrayList<Atendente> listaAtendente = new ArrayList<Atendente>();
		ArrayList<OS> listaOS = new ArrayList<OS>();
		
		while (true) {
			Scanner scanner = new Scanner(System.in);

			System.out.println("O QUE DESEJA FAZER:");
			System.out.println("Cadastra Cliente digite 1->");
			System.out.println("Cadastra Atendente digite 2->");
			System.out.println("Cadastra Orden de Serviço digite 3->");
			System.out.println("Resolver Orden de Serviço digite 4->");
			System.out.println("Exibir historico digite 5->");

			int i1 = scanner.nextInt();

			if (1 == i1) {
				Cliente cliente = new Cliente();
				listaCliente.add(cliente.salvarCliente());
				System.out.println("cliente Salvo!\n\n");
			} else if (2 == i1) {
				Atendente atendente = new Atendente();
				listaAtendente.add(atendente.salvarAtendente());
			} else if (3 == i1) {
				OS os = new OS();
				listaOS.add(os.cadastraOS());
				System.out.println("Atendente Salvo!\n\n");
			} else if (4 == i1) {
				if (!listaOS.isEmpty()) {
					Tecnico tecnico = listaOS.get(0).getTecnico();
					tecnico.resolverOS(listaOS.get(0));
					System.out.println("OS Cadastrada!\n\n");
				} else {
					System.out.println("Nenhuma OS cadastrada!\n\n");
				}
			}else if (5 == i1){
				if(!listaOS.isEmpty()) {
					Historico historico = new Historico(listaCliente.get(0), listaOS.get(0), 
							listaOS.get(0).getTecnico(), new Date(), new Date(), listaOS.get(0).getResumo());
				}else {
					System.out.println("Não exite Historico!\n\n5");
				}
			}

			//limpatela();
		}

	}
	
	public static void limpatela() {	 
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
			+"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
			+"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
			+"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
			+"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
			+"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
			+"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	 }

}
