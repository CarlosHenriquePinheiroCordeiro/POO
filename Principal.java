import java.util.Random;
import java.util.Scanner;

public class Principal {
	//-------------------------------------------------------------------------------------------------------------------------------------------//
	//MENU PRINCIPAL//
	public static void main(String[] args) {
		Scanner digite = new Scanner(System.in);
		Random gerar = new Random();
		boolean rodando = true;
		while (rodando) {
			System.out.println("------------------------------------------------------------------");
			System.out.println("Digite a quantidade de n�meros aleat�rios desejados (de 1 a 5000 n�meros):");
			int numeros = digite.nextInt();
			if (numeros <= 0 || numeros > 5000) 
				System.out.println("O n�mero informado n�o � v�lido, por favor digite novamente outro n�mero.");
			else {
				int num[] = new int[numeros];
				for (int x = 0; x < num.length; x++) {
					num[x] = gerar.nextInt(numeros);
					System.out.println(num[x]);
				}
//-------------------------------------------------------------------------------------------------------------------------------------------//				
				//MAIOR, E MENOR N�MERO//
				boolean primeiro = true; 
				int maior_num, menor_num;
				maior_num = 0;
				menor_num = 0;
				for (int x = 0; x < num.length; x++) {
					if (primeiro) { 
						primeiro = false;
						maior_num = num[x];
						menor_num = num[x];
					}else {
						if (num[x] > maior_num) 
							maior_num = num[x];
						else if (num[x] < menor_num)
							menor_num = num[x];
					}}
				System.out.println("------------------------------------------------------------------");
				System.out.println("O maior n�mero �:" + maior_num);
				System.out.println("O menor n�mero �:" + menor_num);
				System.out.println("------------------------------------------------------------------");
				System.out.println("A lista dos n�meros pares �:");
//-------------------------------------------------------------------------------------------------------------------------------------------//
				//LISTA DOS N�MEROS PARES, �MPARES, PRIMOS E SOMA//
				for (int x = 0; x < num.length; x++) { 
					if (num[x] % 2 == 0)
						System.out.println(num[x]);
				}
				System.out.println("------------------------------------------------------------------");
				System.out.println("A lista dos n�meros �mpares �:");
				for (int x = 0; x < num.length; x++) {
					if (num[x] % 2 == 1)
						System.out.println(num[x]);
				}
				System.out.println("------------------------------------------------------------------");
				System.out.println("A lista dos n�meros primos �:");
				int divisores;
				for (int x = 0; x < num.length; x++) {
					divisores = 0;
					for (int y = 1; y <= num.length; y++) {
						if (num[x] % y == 0) 
							divisores++;
					}
					if (divisores <= 2)
						System.out.println(num[x]);
					}
				int soma;
				soma = 0;
				for (int x = 0; x < num.length; x++) {
					soma = soma + num[x];
				}
				System.out.println("------------------------------------------------------------------");
				System.out.println("A soma de todos os n�meros �: "+soma);
//-------------------------------------------------------------------------------------------------------------------------------------------//				
				//M�DIA, MEDIANA E MODA//
				double numerador, media; 
				numerador = 0;
				media = 0;
				for (int x = 0; x < num.length; x++ ) {
					numerador = numerador + num[x];
				}
				media = numerador / num.length;
				System.out.println("------------------------------------------------------------------");
				System.out.println("A m�dia �: "+media);
				if (num.length % 2 == 0) {
					double mediana;
					mediana = (double)((num[(num.length / 2) - 1] + num[num.length / 2]) / 2);
					System.out.println("------------------------------------------------------------------");
					System.out.println("A mediana �: "+(double)mediana);
				}else {
					System.out.println("------------------------------------------------------------------");
					System.out.println("A mediana �: "+(num[num.length / 2]));	
				}
				boolean primeira = true, multi_modal = false;
				int aux = 0, conta_moda = 0, moda = 0;
				for (int x = 0; x < num.length; x++) {
					aux = 0;
					for (int y = 0; y < num.length; y++) {
						if (num[x] == num[y]) 
							aux++;
					}
					if (primeira) {
						primeira = false;
						conta_moda = aux;
						moda = num[x];
					}else {
						if (aux > conta_moda) {
							conta_moda = aux;
							moda = num[x];
						}else if(aux == conta_moda)
							multi_modal = true;
					}
				}
				System.out.println("------------------------------------------------------------------");
				System.out.println("A moda �: ");
				int vezes_moda;
				if (multi_modal) {
					for (int x = 0; x < num.length; x++) {
						vezes_moda = 0;
						for (int y = 0; y < num.length; y++) {
							if (num[x] == num[y])
								vezes_moda++;
						}
						if (vezes_moda == conta_moda)
							System.out.println(num[x]);
					}
				}else
					System.out.println(moda);
//-------------------------------------------------------------------------------------------------------------------------------------------//				
				//VARI�NCIA E DESVIO PADR�O//
				numerador = 0;
				for (int x = 0; x < num.length; x++) {
					numerador = numerador + ((num[x] - media) * (num[x] - media));
				}
				System.out.println("------------------------------------------------------------------");
				System.out.println("A vari�ncia �: "+ numerador / (num.length - 1));
				System.out.println("------------------------------------------------------------------");
				System.out.println("O desvio padr�o �: "+ Math.sqrt(numerador / (num.length - 1)));
//-------------------------------------------------------------------------------------------------------------------------------------------//				
				//REINICIAR OU ENCERRAR PROGRAMA//
				System.out.println("------------------------------------------------------------------");
				System.out.println("Deseja realizar o processo novamente com outra quantidade de n�meros?");
				System.out.println("Para 'Sim', digite 'S', para 'N�o', digite 'N'.");
				String sim_nao = digite.next();
				if (sim_nao.equals("N")) {
					System.out.println("Ok, encerrando programa...");
					rodando = false;	
				}else
					System.out.println("Muito bem, retomando ao come�o!");
			}
		}
	}	
}		








