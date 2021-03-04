import java.util.ArrayList;
import java.util.Collections;

public class Fila {

	private static ArrayList<Paciente> fila = new ArrayList<Paciente>();
	
	public boolean addPaciente(String nome, int idade, String horaChegada, int prioridade) {
		Paciente paciente = new Paciente(nome, idade, horaChegada, prioridade);
		return fila.add(paciente);
	}
	
	public void ordenar() {
		Collections.sort(fila);
	}
	
	public String mostrarFila(int i) {
		return fila.get(i).getNome();
	}
	
	public static Paciente atender() {
		return fila.get(0);
	}
	
	public static void remover() {
		fila.remove(0);
	}
	
	public int getFilaSize() {
		return fila.size();
	}
}
