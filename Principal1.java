import java.util.Scanner;

public class Principal1 {
//-------------------------------------------------------------------------------------------------------------------------------------------//
	//ESCOLHA DO EXERCÍCIO//
	public static void main(String[] args) {
		System.out.println("Digite o exercício a ser feito: 1 / 2 / 3");
		Scanner digite = new Scanner(System.in);
		String exercicio = digite.next();
//-------------------------------------------------------------------------------------------------------------------------------------------//
		//EXERCÍCIO 1//
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
				System.out.println("Seu peso ideal é: "+peso_ideal+ "Kg.");
				if (peso < peso_ideal)
					System.out.println("Você está abaixo do seu peso ideal.");
				else if (peso > peso_ideal)
					System.out.println("Você está acima do seu peso ideal.");
				else
					System.out.println("Você está com o seu peso ideal.");
			}else {
				System.out.println(altura + ",, " + peso + "Kg, Feminino");
				double peso_ideal = (62.1 * altura) - 44.7;
				System.out.println("Seu peso ideal é: "+peso_ideal+ "Kg.");
				if (peso < peso_ideal)
					System.out.println("Você está abaixo do seu peso ideal.");
				else if (peso > peso_ideal)
					System.out.println("Você está acima do seu peso ideal.");
				else
					System.out.println("Você está com o seu peso ideal.");	
			}
		}
//-------------------------------------------------------------------------------------------------------------------------------------------//
		//EXERCÍCIO 2//
		else if (exercicio.equals("2")) {
			System.out.println("Digite seu salário:");
			double salario = digite.nextDouble();
			if (salario + (salario + salario * 0.2) < 280) {
				System.out.println("Seu salário antes do reajuste é: R$"+salario+".");
				System.out.println("O percentual do aumento aplicado é de 20%");
				System.out.println("O valor do aumento é: "+ (salario * 0.2));
				System.out.println("Seu salário agora é: "+(salario + salario * 0.2));
			}
			else if (salario >= 280 && salario < 700) {
				System.out.println("Seu salário antes do reajuste é: R$"+salario+".");
				System.out.println("O percentual do aumento aplicado é de 15%");
				System.out.println("O valor do aumento é: "+ (salario * 0.15));
				System.out.println("Seu salário agora é: "+(salario + salario * 0.15));
			}
			else if (salario >= 700 && salario < 1500) {
				System.out.println("Seu salário antes do reajuste é: R$"+salario+".");
				System.out.println("O percentual do aumento aplicado é de 10%");
				System.out.println("O valor do aumento é: "+ (salario * 0.1));
				System.out.println("Seu salário agora é: "+(salario + salario * 0.1));
			}
			else if (salario >= 1500) {
				System.out.println("Seu salário antes do reajuste é: R$"+salario+".");
				System.out.println("O percentual do aumento aplicado é de 5%");
				System.out.println("O valor do aumento é: "+ (salario * 0.05));
				System.out.println("Seu salário agora é: "+(salario + salario * 0.05));
			}
		}
//-------------------------------------------------------------------------------------------------------------------------------------------//
			//EXERCÍCIO 3//
		else  if (exercicio.equals("3")){
			System.out.println("Informe o valor do saque (mínimo de R$1 e máximo de R$600):");
			int aux = 0;
			int saque = digite.nextInt();
			System.out.println("Você sacará:");
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
		








