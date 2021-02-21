public class Eletronico {
	
	private boolean ligado;

	public void desligar(Energia energia) {
		
	}
	
	public void ligar(Energia energia) {
		if (energia.getEnergia())
			setLigado(energia.getEnergia());
	}
	
	public boolean getLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		if (ligado)
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
