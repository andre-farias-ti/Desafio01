package entidade;

import java.util.ArrayList;
import java.util.List;

public enum ItenEnum {
	

	REINSTALADO(1),CONFIGURADO(1),

	TROCADO(2),LIMPADO(2),RETIRADO(2);
	
	private int categoriaPai;
	
	ItenEnum(int categoriaPai) {
		this.setCategoriaPai(categoriaPai);
	}

	public int getCategoriaPai() {
		return categoriaPai;
	}

	public void setCategoriaPai(int categoriaPai) {
		this.categoriaPai = categoriaPai;
	}
	
	public static Object[] listarItemSubCategorias(CategoriaEnum categoriaEnum) {
		
		List<String> subs = new ArrayList<>();
		
		for (ItenEnum sub : ItenEnum.values()) {
			if (sub.getCategoriaPai() ==  categoriaEnum.getId()) {
				subs.add(sub.name());
			}
		}
		
		return subs.toArray();
	}

}
