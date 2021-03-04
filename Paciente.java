
public class Paciente extends Pessoa implements Comparable<Paciente>{
	
	private String horaChegada;
	private int prioridade;
	
	public Paciente(String nome, int idade, String horaChegada, int prioridade) {
		super(nome, idade);
		setHoraChegada(horaChegada);
		setPrioridade(prioridade);
	}

	public String getHoraChegada() {
		return horaChegada;
	}

	public void setHoraChegada(String horaChegada) {
		if (horaChegada.length() > 0)
			this.horaChegada = horaChegada;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		if (prioridade > 0)
			this.prioridade = prioridade;
	}

	@Override
	public int compareTo(Paciente paciente) {
		// TODO Auto-generated method stub
		return (paciente.getPrioridade() - this.prioridade);
	}

}
