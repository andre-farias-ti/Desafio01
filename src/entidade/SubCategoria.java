package entidade;

public class SubCategoria {

	private String noSubCategoria;
	private Item item;

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public SubCategoria(String noSubCategoria) {
		super();
		this.noSubCategoria = noSubCategoria;
	}

	public String getNoSubCategoria() {
		return noSubCategoria;
	}

	public void setNoSubCategoria(String noSubCategoria) {
		this.noSubCategoria = noSubCategoria;
	}
}
