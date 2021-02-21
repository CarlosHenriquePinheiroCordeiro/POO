public class Energia {

	private boolean energia;
	
	public boolean getEnergia() {
		return energia;
	}

	public void setEnergia(boolean corrente) {
		if (corrente)
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
