public abstract class Eletronico {
	
	private boolean ligado;
	
	public abstract void ligar(boolean energia);

	public boolean getLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Eletronico [ligado=");
		builder.append(ligado);
		builder.append("]");
		return builder.toString();
	}

}
