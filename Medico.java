import java.util.ArrayList;

public class Medico extends Pessoa {
	
	private ArrayList<Paciente> atendidos = new ArrayList<Paciente>();
	private ArrayList<String> horarios = new ArrayList<String>();
	
	public Medico(String nome, int idade) {
		super(nome, idade);
	}
	
	public void atender(String horaAtendimento) {	
		atendidos.add(Fila.atender());
		horarios.add(horaAtendimento);
		Fila.remover();
	}
	
	public String historico(int i) {
		return (atendidos.get(i).getNome()+" - Horário de Chegada: "+atendidos.get(i).getHoraChegada()+" | Horário de Atendimento: "+horarios.get(i)+".");
	}
	
	public int getAtendidosSize() {
		return atendidos.size();
	}

}
