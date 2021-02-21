public class Main {
	public static void main(String[] args) {
		Energia energ = new Energia();
		energ.setEnergia(true);
		System.out.println(energ);
		System.out.println("");
		
		Eletronico eletr = new Eletronico();
		eletr.ligar(energ);
		System.out.println(eletr);
		System.out.println("");
		
		Gpu gpu1 = new Gpu();
		gpu1.setMarca("NVIDIA");
		Gpu gpu2 = new Gpu();
		gpu2.setMarca("NVIDIA");
		Gpu gpu3 = new Gpu();
		gpu3.setMarca("NVIDIA");
		System.out.print("");
		
		Computador pc = new Computador();
		pc.setMarca("Samsung");
		pc.ligar(energ);
		pc.addGpu(gpu1);
		pc.addGpu(gpu2);
		pc.addGpu(gpu3);
		System.out.println(pc);
		System.out.println("");
		
		Teclado teclado = new Teclado();
		teclado.setMarca("Razer");
		teclado.ligar(energ);
		teclado.addTecla("A");
		teclado.addTecla("!");
		teclado.addTecla("#");
		teclado.addTecla("56");
		teclado.addTecla("~");
		teclado.addTecla("´");
		teclado.addTecla(":");
		System.out.println(teclado);
	}
}



















