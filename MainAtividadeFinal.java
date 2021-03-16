import java.io.IOException;

public class MainAtividadeFinal {
	
	public static void main(String[] args) throws IOException {
		System.out.println("||------------------------------------------------------------||");
		Energia.setEnergia(false);
		System.out.println("Energia = "+Energia.getEnergia());
		System.out.println("||------------------------------------------------------------||");
		System.out.println("");
		
		MarcaGpu marca = MarcaGpu.MSI;
		String marcaEletronico = null;
		
		switch (marca) {
			case MSI: marcaEletronico = "MSI";
				break;
			case Asus: marcaEletronico = "Asus";
				break;
			case Redragon: marcaEletronico = "Redragon";
				break;
			default: System.out.println("Erro na marca");
				break;
		}
		
		System.out.println("||------------------------------------------------------------||");
		Computador pc = new Computador(marcaEletronico, Energia.getEnergia());
		Gpu gpu = new Gpu(marcaEletronico);
		pc.addGpu(gpu);
		System.out.println(gpu);
		gpu = new Gpu(marcaEletronico);
		pc.addGpu(gpu);
		System.out.println(gpu);
		gpu = new Gpu(marcaEletronico);
		pc.addGpu(gpu);
		System.out.println(gpu);
		System.out.println();
		System.out.println(pc);
		System.out.println();
		System.out.println("Dado inserido pelo Computador: "+pc.inserirDado());
		System.out.println("||------------------------------------------------------------||");
		System.out.println();
		
		System.out.println("||------------------------------------------------------------||");
		System.out.println("Leitura CSV (GPU's):");
		pc.salvarCSV();
		System.out.println("||------------------------------------------------------------||");
		System.out.println();
		System.out.println("||------------------------------------------------------------||");
		System.out.println("Leitura XML (GPU's):");
		pc.salvarXML();
		System.out.println("||------------------------------------------------------------||");
		System.out.println();
		System.out.println("||------------------------------------------------------------||");
		System.out.println("Leitura JSON (GPU's)");
		pc.salvarJSON();
		System.out.println("||------------------------------------------------------------||");
		System.out.println();
		
		String marcaTeclado = null;
		switch (marca) {
		case MSI: marcaTeclado = "MSI";
			break;
		case Asus: marcaTeclado = "Asus";
			break;
		case Redragon: marcaTeclado = "Redragon";
			break;
		default: System.out.println("Erro na marca");
			break;
		}

		System.out.println("||------------------------------------------------------------||");
		Teclado teclado = new Teclado(marcaTeclado, Energia.getEnergia());
		teclado.addTecla("A");
		teclado.addTecla("a");
		teclado.addTecla("1");
		teclado.addTecla("!");
		System.out.println(teclado);
		System.out.println("Dado inserido pelo Teclado (1/3): "+teclado.inserirDado());
		System.out.println("Dado inserido pelo Teclado (2/3): "+teclado.inserirDado());
		System.out.println("Dado inserido pelo Teclado (3/3): "+teclado.inserirDado());
		System.out.println("||------------------------------------------------------------||");
		System.out.println();
		System.out.println("||------------------------------------------------------------||");
		System.out.println("Leitura CSV (Teclas):");
		teclado.salvarCSV();
		System.out.println("||------------------------------------------------------------||");
		System.out.println();
		System.out.println("||------------------------------------------------------------||");
		System.out.println("Leitura XML (Teclas):");
		teclado.salvarXML();
		System.out.println("||------------------------------------------------------------||");
		System.out.println();
		System.out.println("||------------------------------------------------------------||");
		System.out.println("Leitura JSON (Teclas)");
		teclado.salvarJSON();
		System.out.println("||------------------------------------------------------------||");
	}
}




















