public class Energia {

	private boolean energia;

	public Energia(boolean corrente) {
		setEnergia(corrente);
	}
	
	public boolean getEnergia() {
		return energia;
	}

	public void setEnergia(boolean corrente) {
		this.energia = corrente;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Energia [energia=");
		builder.append(energia);
		builder.append("]");
		return builder.toString();
	}
	
}
