public class Gpu {

	private String marca;

	public Gpu (String marca) {
		setMarca(marca);
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		if (marca.length() > 0)
			this.marca = marca;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Gpu [marca=");
		builder.append(marca);
		builder.append("]");
		return builder.toString();
	}
	
}
