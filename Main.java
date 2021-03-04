import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Fila fila = new Fila();
		Medico medico_fernando = new Medico("Fernando", 19);
		Medico medico_marco = new Medico("Marco", 19);
		Scanner digite = new Scanner(System.in);
		String nome;
		String resposta;
		String horaAtendimento;
		String horaChegada;
		int idade;
		int medico;
		int opcao;
		int prioridade;
		boolean rodando = true;
		fila.addPaciente("Julia", 39, "09:40", 2);
		fila.addPaciente("Carolina", 28, "6:44", 1);
		fila.addPaciente("Vinicius", 25, "6:17", 4);
		fila.addPaciente("Isabela", 16, "04:35", 3);
		fila.addPaciente("�fora", 17, "13:37", 1);
		fila.addPaciente("Camila", 27, "5:50", 2);
		fila.addPaciente("Teresa", 15, "10:24", 1);
		fila.addPaciente("Marcelo", 42, "04:49", 3);
		fila.addPaciente("Eduardo", 23, "5:05", 4);
		fila.addPaciente("Luiz", 18, "5:12", 3);
		fila.addPaciente("Victor", 14, "5:39", 2);
		fila.addPaciente("Maria", 32, "09:19", 1);
		fila.addPaciente("Ludwig", 55, "6:01", 3);
		fila.addPaciente("Catarina", 31, "6:09", 2);
		fila.addPaciente("Julio", 20, "6:31", 4);
		fila.addPaciente("Diogo", 9, "10:00", 1);
		fila.addPaciente("�nio", 70, "6:59", 2);
		fila.addPaciente("Matheus", 31, "14:01", 3);
		fila.addPaciente("Marinaldo", 43, "7:01", 2);
		fila.addPaciente("Fausto", 47, "7:19", 1);
		fila.ordenar();
		while (rodando) {
			System.out.println();
			System.out.println("//---------------------------------------------------//");
			System.out.println("Informe uma das op��es abaixo:");
			System.out.println("1- Inserir paciente na fila.");
			System.out.println("2 - Mostrar a fila.");
			System.out.println("3 - Atender um paciente.");
			System.out.println("4 - Consultar hist�rico de atendimento de cada m�dico.");
			System.out.println("5 - Consultar hist�rico geral.");
			opcao = digite.nextInt();
			if (opcao == 1) {
				System.out.println("Informe o nome do paciente:");
				nome = digite.next();
				System.out.println("Informe a idade do paciente:");
				idade = digite.nextInt();
				System.out.println("Informe a hora de chegada do paciente:");
				horaChegada = digite.next();
				prioridade = 0;
				System.out.println("Antes de entrar na fila � necess�rio que sejam respondidas quatro perguntas.");
				System.out.println("Responda apenas com 'S' (simbolizar� o 'Sim') ou 'N' (simbolizar� o 'N�o').");
				System.out.println("1 - O paciente deseja apenas coletar/realizar exames, Raio X, reavalia��o mensal, garantir receita farmac�utica ou fazer uma consulta de retorno?");
				System.out.println("(N�o urgente)");
				resposta = digite.next();
				if(resposta.equals("S"))
					prioridade = 1;
				System.out.println("2 - O paciente necessita de atendimento a uma doen�a cr�nica, acidentes ou queda leve? / Gripe ou febre h� dias?");
				System.out.println("(Pouco urgente)");
				resposta = digite.next();
				if(resposta.equals("S"))
					prioridade = 2;
				System.out.println("3 - O paciente necessita de atendimento a dor mediana, doen�as cr�nicas ou agudas / amea�a a �rg�os vitais?");
				System.out.println("(Urgente)");
				resposta = digite.next();
				if(resposta.equals("S"))
					prioridade = 3;
				System.out.println("4 - O paciente se encontra em situa��o com risco de vida? Acidente, hemorragia, amputa��o, incapacidade respirat�ria, dor excruciante, ou les�es de reparo grave e sequelas?");
				System.out.println("(Emerg�ncia)");
				resposta = digite.next();
				if(resposta.equals("S"))
					prioridade = 4;
				if (fila.addPaciente(nome, idade, horaChegada, prioridade)) {
					System.out.println("Paciente entrou na fila com sucesso.");
					fila.ordenar();
				}
				else
					System.out.println("Ocorreu um erro ao paciente entrar na fila.");
			}else if (opcao == 2) {
				System.out.println("//----------------------------Fila de pacientes---------------------------\\");
				for (int i = 0; i < fila.getFilaSize(); i++)
					System.out.println(fila.mostrarFila(i));
			}else if (opcao == 3) {
				int confere = 0;
				while (confere == 0) {
				medico = 0;
				System.out.println("Informe o hor�rio de atendimento:");
				horaAtendimento = digite.next();
				System.out.println("Informe a op��o do m�dico que vai atender:");
				System.out.println("1 - Fernando.");
				System.out.println("2 - Marco.");
				medico = digite.nextInt();
					if (medico == 1) {
						confere = 1;
						medico_fernando.atender(horaAtendimento);
					}
					else if (medico == 2) {
						confere = 1;
						medico_marco.atender(horaAtendimento);
					}
					else
						System.out.println("Por favor informe uma op��o v�lida.");
				}
			}else if (opcao == 4) {
				System.out.println();
				System.out.println("//--------------------Pacientes atendidos por Fernando-------------------\\");
				for (int i = 0; i < (medico_fernando.getAtendidosSize()); i++)
					System.out.println(medico_fernando.historico(i));
				System.out.println();
				System.out.println("//---------------------Pacientes atendidos por Marco---------------------\\");
				for (int i = 0; i < (medico_marco.getAtendidosSize()); i++)
					System.out.println(medico_marco.historico(i));
			}else if (opcao == 5) {
				System.out.println();
				System.out.println("//-  -  -  -  -  -  -  -  -  Hist�rico Geral  -  -  -  -  -  -  -  -  -  \\");
				System.out.println("//--------------------------Pacientes atendidos--------------------------\\");
				for (int i = 0; i < (medico_fernando.getAtendidosSize()); i++)
					System.out.println(medico_fernando.historico(i));
				for (int i = 0; i < (medico_marco.getAtendidosSize()); i++)
					System.out.println(medico_marco.historico(i));
				System.out.println();
				System.out.println("//------------------Pacientes que ainda ser�o atendidos------------------\\");
				for (int i = 0; i < fila.getFilaSize(); i++)
					System.out.println(fila.mostrarFila(i));
			}else 
				System.out.println("Por favor informe uma op��o v�lida.");
		}
		digite.close();
	}
}




















