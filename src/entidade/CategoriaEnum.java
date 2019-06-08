package entidade;

import java.util.Arrays;

public enum CategoriaEnum {

	HARDWARE(2),SOFTWARE(1);
	
	private int id;
	
	CategoriaEnum(int id) {
		this.setId(id);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public static Object[] getListaValores() {
		return Arrays.asList(CategoriaEnum.HARDWARE.toString(), CategoriaEnum.SOFTWARE.toString()).toArray();
	}
	
}
