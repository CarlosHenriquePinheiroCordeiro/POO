
public class Tecla {

	private String simbolo;

	public Tecla(String simbolo) {
		setSimbolo(simbolo);
	}
	
	public String getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tecla [simbolo=");
		builder.append(simbolo);
		builder.append("]");
		return builder.toString();
	}
	
}
