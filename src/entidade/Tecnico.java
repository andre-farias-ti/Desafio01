package entidade;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import frame.CadastrarTecnicoFrame;
import service.GerenciaTecnicoService;
import service.MenssagenService;

public class Tecnico extends Pessoa implements GerenciaTecnicoService{

	private String matricula;
	
	private Grupo grupo;

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public void resolverOS(ArrayList<OS> listaOS) throws ParseException {
		
		
		if(listaOS.isEmpty()) {
			MenssagenService.menssagen("Não existe Ordende serviço Cadastrada");
		}else {
			
			List<String> nrOs = new ArrayList<String>();
			
			for (OS os : listaOS) {
				nrOs.add(os.getNumeroOS());
			}
			
			Object nrOSselct = JOptionPane.showInputDialog(null, "Por Favor Escolha um Orden de Serviço", "Nome",
					JOptionPane.QUESTION_MESSAGE, null, nrOs.toArray() , 1);
			
			
			for (OS os : listaOS) {
				if(os.getNumeroOS().equals(nrOSselct.toString())) {
					
					Object categoria = JOptionPane.showInputDialog(null,
							String.format("OS DE NUMERO: %s \nNOME DO CLIENTE: %s \nEscolha a categoria: ",
									os.getNumeroOS(), os.getCliente().getNome()),
							"Categoria", JOptionPane.QUESTION_MESSAGE, null, CategoriaEnum.getListaValores(), 1);
					
					Object subCategoria = JOptionPane.showInputDialog(null,
							String.format(
									"OS DE NUMERO: %s \nNOME DO CLIENTE: %s \nCategoria: %s \nEscolha a Subategoria: ",
									os.getNumeroOS(), os.getCliente().getNome(), categoria.toString()),
							"Categoria", JOptionPane.QUESTION_MESSAGE, null,
							SubCategoriaEnum.listarSubCategorias(CategoriaEnum.valueOf(categoria.toString())), 1);
					
					Object item = JOptionPane.showInputDialog(null,
							String.format(
									"OS DE NUMERO: %s \nNOME DO CLIENTE: %s \nCATEGORIA: %s \nSUBCATEGOTIA: %s \nEscolha o Item: ",
									os.getNumeroOS(), os.getCliente().getNome(), categoria.toString(), subCategoria.toString()),
							"Categoria", JOptionPane.QUESTION_MESSAGE, null,
							ItenEnum.listarItemSubCategorias(CategoriaEnum.valueOf(categoria.toString())), 1);
					
					
					Categoria categ = new Categoria(categoria.toString(),
							new SubCategoria(subCategoria.toString(), new Item(item.toString())));
					os.setCategorias(categ);
					
					break;
				}
			}
			
		}
		
	}

	@Override
	public void fazAniversario() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Tecnico salvarTecnico(ArrayList<Tecnico> listaTecnico) throws ParseException {

		JFrame frame = new CadastrarTecnicoFrame(listaTecnico);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setLocationRelativeTo( null );
        frame.setVisible( true );
		
		return null;
	}
	
}
