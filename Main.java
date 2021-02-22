public class Main {
	public static void main(String[] args) {
		Energia energ = new Energia(true); 
		System.out.println(energ);
		System.out.println("");
		
		Eletronico eletr = new Eletronico(energ);
		System.out.println(eletr);
		System.out.println("");
		
		Gpu gpu1 = new Gpu("NVIDIA");
		Gpu gpu2 = new Gpu("NVIDIA");
		Gpu gpu3 = new Gpu("NVIDIA");
		System.out.print("");
		
		Computador pc = new Computador("Samsung", energ);
		pc.addGpu(gpu1);
		pc.addGpu(gpu2);
		pc.addGpu(gpu3);
		System.out.println(pc);
		System.out.println("");
		
		Teclado teclado = new Teclado("Razer", energ);
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



















