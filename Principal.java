import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner digitar = new Scanner(System.in);
		digitar.useLocale(Locale.ENGLISH);
		System.out.println("Digite o exerc�cio a ser feito: 1 / 2 / 3"); //Escolher exerc�cio a ser visto
		int exercicio = digitar.nextInt();
		if (exercicio == 1) { //EXERC�CIO 1
			System.out.println("Informe sua altura (use ponto para digitar 'n�meros quebrados' - para tudo o que lhe for pedido a partir de agora - por exemplo 1.80).");
			double h = digitar.nextDouble();
			System.out.println("Informe seu peso.");
			double peso = digitar.nextDouble();
			System.out.println("Informe seu sexo (Masculino / Feminino).");
			String sexo = digitar.next();
			System.out.println("Altura: "+h+" / Peso: "+peso+"Kg / Sexo: "+sexo);
			if (sexo.equals("Masculino")) {
				double peso_ideal = (72.7 * h) - 58;
				System.out.println("O peso ideal para voc� �: "+peso_ideal+"Kg");
				if (peso > peso_ideal) 
					System.out.println("O seu peso est� acima do ideal para voc�.");
				else if (peso < peso_ideal)
					System.out.println("O seu peso est� abaixo do ideal para voc�.");
				else
					System.out.println("O seu peso � o ideal para voc�.");
			}
			else {
				double peso_ideal = (62.1 * h) - 44.7;
				System.out.println("O peso ideal para voc� �: "+peso_ideal+"Kg");
				if (peso > peso_ideal) 
					System.out.println("O seu peso est� acima do ideal para voc�.");
				else if (peso < peso_ideal)
					System.out.println("O seu peso est� abaixo do ideal para voc�.");
				else
					System.out.println("O seu peso � o ideal para voc�.");
			}
		}
		else if (exercicio == 2) { //EXERC�CIO 2
			System.out.println("Colaborador digite seu sal�rio:");
			double salario = digitar.nextDouble();
			if (salario + salario * 0.2 <= 280) {
					System.out.println("Sal�rio antes do reajuste R$"+salario);
					System.out.println("Aumento de 20%");
					System.out.println("O valor do aumento � de R$"+salario*0.2);
					System.out.println("O sal�rio atual � R$:"+(salario+salario*0.2));
			}
			else if (salario >= 280 && salario <= 700) {
				System.out.println("Sal�rio antes do reajuste R$"+salario);
				System.out.println("Aumento de 15%");
				System.out.println("O valor do aumento � de R$"+salario*0.15);
				System.out.println("O sal�rio atual � R$:"+(salario+salario*0.15));
			}
			else if (salario > 700 && salario <= 1500) {
				System.out.println("Sal�rio antes do reajuste R$"+salario);
				System.out.println("Aumento de 10%");
				System.out.println("O valor do aumento � de R$"+salario*0.1);
				System.out.println("O sal�rio atual � R$:"+(salario+salario*0.1));
			}
			else {
				System.out.println("Sal�rio antes do reajuste R$"+salario);
				System.out.println("Aumento de 5%");
				System.out.println("O valor do aumento � de R$"+salario*0.05);
				System.out.println("O sal�rio atual � R$:"+(salario+salario*0.05));
			}
		}
			else { //EXERC�CIO 3
				System.out.println("Informe o valor do saque - somente valores inteiros por favor - de m�nimo R$10 e m�ximo de R$600.");
				int saque = digitar.nextInt();
				if (saque >= 10 && saque <= 600) {
					int aux;
					if (saque >= 100) {
						System.out.println(saque / 100+" nota(s) de R$100");
						aux = (saque / 100) * 100;
						saque = saque - aux;
					}
					System.out.println(saque / 50 +" nota(s) de R$50");
					aux = (saque / 50) * 50;
					saque = saque - aux;
					System.out.println(saque / 10 +" nota(s) de R$10");
					aux = (saque / 10) * 10;
					saque = saque - aux;
					System.out.println(saque / 5 +" nota(s) de R$5");
					aux = (saque / 5) * 5;
					saque = saque - aux;
					System.out.println(saque+" nota(s) de R$1");
				}
				else
					System.out.println("Por favor digite uma quantia dentro do limite proposto.");
		}
	}		
}







