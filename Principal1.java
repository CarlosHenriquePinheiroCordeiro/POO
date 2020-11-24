import java.util.Scanner;

public class Principal1 {
//-------------------------------------------------------------------------------------------------------------------------------------------//
	//ESCOLHA DO EXERC�CIO//
	public static void main(String[] args) {
		System.out.println("Digite o exerc�cio a ser feito: 1 / 2 / 3");
		Scanner digite = new Scanner(System.in);
		String exercicio = digite.next();
//-------------------------------------------------------------------------------------------------------------------------------------------//
		//EXERC�CIO 1//
		if (exercicio.equals("1")) {
			System.out.println("------------------------------------------------------------------------------------------------------------------");
			System.out.println("Digite sua altura.");
			double altura = digite.nextDouble();
			System.out.println("------------------------------------------------------------------------------------------------------------------");
			System.out.println("Digite seu peso.");
			int peso = digite.nextInt();
			System.out.println("------------------------------------------------------------------------------------------------------------------");
			System.out.println("Informe seu sexo: Masculino (M) / Feminino (F).");
			String sexo = digite.next();
			if (sexo.equals("M")) {
				System.out.println(altura + "m, " + peso + "Kg, Masculino");
				double peso_ideal = (72.7 * altura) - 58;
				System.out.println("Seu peso ideal �: "+peso_ideal+ "Kg.");
				if (peso < peso_ideal)
					System.out.println("Voc� est� abaixo do seu peso ideal.");
				else if (peso > peso_ideal)
					System.out.println("Voc� est� acima do seu peso ideal.");
				else
					System.out.println("Voc� est� com o seu peso ideal.");
			}else {
				System.out.println(altura + ",, " + peso + "Kg, Feminino");
				double peso_ideal = (62.1 * altura) - 44.7;
				System.out.println("Seu peso ideal �: "+peso_ideal+ "Kg.");
				if (peso < peso_ideal)
					System.out.println("Voc� est� abaixo do seu peso ideal.");
				else if (peso > peso_ideal)
					System.out.println("Voc� est� acima do seu peso ideal.");
				else
					System.out.println("Voc� est� com o seu peso ideal.");	
			}
		}
//-------------------------------------------------------------------------------------------------------------------------------------------//
		//EXERC�CIO 2//
		else if (exercicio.equals("2")) {
			System.out.println("Digite seu sal�rio:");
			double salario = digite.nextDouble();
			if (salario + (salario + salario * 0.2) < 280) {
				System.out.println("Seu sal�rio antes do reajuste �: R$"+salario+".");
				System.out.println("O percentual do aumento aplicado � de 20%");
				System.out.println("O valor do aumento �: "+ (salario * 0.2));
				System.out.println("Seu sal�rio agora �: "+(salario + salario * 0.2));
			}
			else if (salario >= 280 && salario < 700) {
				System.out.println("Seu sal�rio antes do reajuste �: R$"+salario+".");
				System.out.println("O percentual do aumento aplicado � de 15%");
				System.out.println("O valor do aumento �: "+ (salario * 0.15));
				System.out.println("Seu sal�rio agora �: "+(salario + salario * 0.15));
			}
			else if (salario >= 700 && salario < 1500) {
				System.out.println("Seu sal�rio antes do reajuste �: R$"+salario+".");
				System.out.println("O percentual do aumento aplicado � de 10%");
				System.out.println("O valor do aumento �: "+ (salario * 0.1));
				System.out.println("Seu sal�rio agora �: "+(salario + salario * 0.1));
			}
			else if (salario >= 1500) {
				System.out.println("Seu sal�rio antes do reajuste �: R$"+salario+".");
				System.out.println("O percentual do aumento aplicado � de 5%");
				System.out.println("O valor do aumento �: "+ (salario * 0.05));
				System.out.println("Seu sal�rio agora �: "+(salario + salario * 0.05));
			}
		}
//-------------------------------------------------------------------------------------------------------------------------------------------//
			//EXERC�CIO 3//
		else  if (exercicio.equals("3")){
			System.out.println("Informe o valor do saque (m�nimo de R$1 e m�ximo de R$600):");
			int aux = 0;
			int saque = digite.nextInt();
			System.out.println("Voc� sacar�:");
			if (saque >= 1 && saque <= 600) {
				if (saque >= 100) {
					aux = saque / 100;
					System.out.println(aux + " nota(s) de R$100.");
					saque = saque - (aux * 100);
				}
				if (saque >= 50) {
					aux = saque / 50;
					System.out.println(aux + " nota(s) de R$50.");
					saque = saque - (aux * 50);
				}
				if (saque >= 10) {
					aux = saque / 10;
					System.out.println(aux + " nota(s) de R$10.");
					saque = saque - (aux * 10);
				}
				if (saque >= 5) {
					aux = saque / 5;
					System.out.println(aux + " nota(s) de R$5.");
				}
				System.out.println(saque+ " nota(s) de R$1.");	
			}
		}
	}
}	
		








