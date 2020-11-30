import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Piramide piramide = new Piramide();
		Scanner text = new Scanner(System.in);
		float h;
		float ab;
		int tipo;
		System.out.println("Digite o valor de 'h' em metros:");
		h = text.nextFloat();
		piramide.setH(h);
		System.out.println("Digite o valor de 'ab' em metros:");
		ab = text.nextFloat();
		piramide.setAb(ab);
		System.out.println("Informe o tipo de tinta a ser usado:");
		System.out.println("1 - R$129,90");
		System.out.println("2 - R$258,98");
		System.out.println("3 - R$344,34");
		tipo = text.nextInt();
		piramide.setTipo(tipo);
		piramide.setAreaDaBase();
		piramide.setA1();
		piramide.setAreaTriangulo();
		piramide.setAreaTotal();
		piramide.setLitros();
		piramide.setLatas();
		piramide.setPreco();
		piramide.setVolume();
		System.out.println("ab: "+piramide.getAb()+"m.");
		System.out.println("h: "+piramide.getH()+"m.");
		System.out.println("a1: "+piramide.getA1()+"m.");
		System.out.println("Área do Triângulo: "+piramide.getAreaTriangulo()+" metros quadrados.");
		System.out.println("Área da Base: "+piramide.getAreaDaBase()+" metros quadrados.");
		System.out.println("Área Total: "+piramide.getAreaTotal()+" metros quadrados.");
		System.out.println("Tipo de Tinta: "+piramide.getTipo()+".");
		System.out.println("Litros: "+piramide.getLitros()+"L.");
		System.out.println("Latas: "+piramide.getLatas()+" latas.");
		System.out.println("Preço: R$"+piramide.getPreco()+".");
		System.out.println("Volume: "+piramide.getVolume()+" metros cúbicos.");
		text.close();
	}	
}

public class Piramide {
	private float ab = 0;
	private float h = 0;
	private float a1 = 0;
	private float areatriangulo = 0;
	private float areadabase = 0;
	private float areatotal = 0;
	private int tipo = 0;
	private float litros = 0;
	private float latas = 0;
	private float custo = 0;
	private float preco = 0;
	private float volume = 0;
	
//----------------------------------------------------------------------------------------------------------------------------------------------//
	//SETs//
	public void setAb(float ab) {
		if (ab > 0)
			this.ab = ab;
	}
	
	public void setH(float h) {
		if ((float)h > 0)
			this.h = h;
	}
	
	public void setTipo(int tipo) {
		if (tipo > 0) {
			if (tipo == 1) {
				this.tipo = 1;
				custo = (float)127.90;
			}
			else if (tipo == 2) {
				this.tipo = 2;
				custo = (float)282.98;
			}
			else {
				this.tipo = 3;
				custo = (float)344.34;
			}
		}
	}
	
	public void setA1() {
		a1 = (float)Math.sqrt((h * h) + (ab * ab));
	}
	
	public void setAreaTriangulo() {
		areatriangulo = (float)((ab * 2) * a1) / 2;
	}
	
	public void setAreaDaBase() {
		areadabase = (float)(ab*2) * (ab*2);
	}
	
	public void setAreaTotal() {
		areatotal = (float)(areatriangulo * 4) + areadabase;
	}
	
	public void setLitros() {
		litros = (float)(areatotal / 4.76);
	}
	
	public void setLatas() {
		latas = (int)(litros / 18) + 1;
	}
	
	public void setPreco() {
		preco = (float)(latas * custo);
	}
	
	public void setVolume() {
		volume = (float)(areadabase / 3) * h;
	}
//----------------------------------------------------------------------------------------------------------------------------------------------//
	//GETs//
	public float getAb() {
		return ab;
	}
	
	public float getH() {
		return h;
	}
	
	public float getA1() {
		return a1;
	}
	
	public float getAreaTriangulo() {
		return areatriangulo;
	}
	
	public float getAreaDaBase() {
		return areadabase;
	}
	
	public float getAreaTotal() {
		return areatotal;
	}
	
	public int getTipo() { 
		return tipo;
	}	
	
	public float getLitros() {
		return litros;
	}
	
	public int getLatas() {
		return (int)latas;
	}
	
	public float getPreco() {
		return preco;
	}
	
	public float getVolume() {
		return volume;
	}
}












