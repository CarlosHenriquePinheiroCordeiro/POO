import java.util.ArrayList;
import java.util.List;

public class Computador extends Eletronico {
	
	private List<Gpu> lgpus = new ArrayList<Gpu>();
	private String marca;
	
	public boolean addGpu(Gpu gpu) {
		return lgpus.add(gpu);
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Computador [marca=");
		builder.append(marca);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		for (Gpu gpu :lgpus) {
			builder.append(gpu.toString());
		}
		return builder.toString();
	}

	
	
}
