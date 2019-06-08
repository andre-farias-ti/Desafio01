package entidade;

import java.util.ArrayList;
import java.util.List;

public enum SubCategoriaEnum {
	
	//software
	WINDOWS(1),WORD(1),POWERPOINT(1),CORELDRAW(1),
	//hadware
	PLACA(2),CABO(2),MEMORIA(2),HD(2);
	
	private int categoriaPai;
	
	SubCategoriaEnum(int categoriaPai) {
		this.setCategoriaPai(categoriaPai);
	}

	public int getCategoriaPai() {
		return categoriaPai;
	}

	public void setCategoriaPai(int categoriaPai) {
		this.categoriaPai = categoriaPai;
	}
	
	public static Object[] listarSubCategorias(CategoriaEnum categoriaEnum) {
		
		List<String> subs = new ArrayList<>();
		
		for (SubCategoriaEnum sub : SubCategoriaEnum.values()) {
			if (sub.getCategoriaPai() ==  categoriaEnum.getId()) {
				subs.add(sub.name());
			}
		}
		
		return subs.toArray();
	}
}
