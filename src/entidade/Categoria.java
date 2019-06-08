package entidade;

public class Categoria {
	
	private SubCategoria subCategoria;
	
	private String noCategoria;

	public Categoria(String noCategoria, SubCategoria subCategoria) {
		this.noCategoria = noCategoria;
		this.subCategoria = subCategoria;
	}

	public SubCategoria getSubCategoria() {
		return subCategoria;
	}

	public void setSubCategoria(SubCategoria subCategoria) {
		this.subCategoria = subCategoria;
	}

	public String getNoCategoria() {
		return noCategoria;
	}

	public void setNoCategoria(String noCategoria) {
		this.noCategoria = noCategoria;
	}
}
