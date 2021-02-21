import java.util.ArrayList;
import java.util.List;
public class Teclado extends Eletronico {
	
	private List<Tecla> teclas = new ArrayList<Tecla>();
	private String marca;

	public boolean addTecla(String simbolo) {
		Tecla tecla = new Tecla(simbolo);
		return teclas.add(tecla); 
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
		builder.append("Teclado [marca=");
		builder.append(marca);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		for (Tecla tecla : teclas) {
			builder.append(tecla.toString());
		}
		return builder.toString();
	}
	
}
