//CLASSE MAIN

public class Main {
	public static void main(String[] args) {
		float z = 8;
		float r = 6;
		int tipo_de_tinta = 1;
		Cone cone_dados = new Cone(z, r, tipo_de_tinta);
		System.out.println(cone_dados);
	}	
}

//CLASSE CONE

public class Cone {
	private float z = 0;
	private float r = 0;
	private int tipo_de_tinta = 0;
	
	public Cone(float z, float r, int tipo_de_tinta) {
		setZ(z);
		setR(r);
		setTipo_de_tinta(tipo_de_tinta);
		geratriz();
		area_do_fundo();
		area_lateral();
		area_total();
		litros();
		latas();
		preco_total();
	}
	
	public float getZ() {
		return z;
	}
	
	public void setZ(float z) {
		if (z > 0)	
			this.z = z;
	}
	
	public float getR() {
		return r;
	}
	
	public void setR(float r) {
		if (r > 0)
			this.r = r;
	}
	
	public int getTipo_de_tinta() {
		return tipo_de_tinta;
	}
	
	public void setTipo_de_tinta(int tipo_de_tinta) {
		if (tipo_de_tinta > 0 && tipo_de_tinta < 4)
			this.tipo_de_tinta = tipo_de_tinta;
	}
	
	public float geratriz() {
		return (float)(Math.sqrt((z * z) + (r * r)));
	}
	
	public float area_do_fundo() {
		return (float)(3.14 * (r * r));
	}
	
	public float area_lateral() {
		return (float)(3.14 * r * geratriz());
	}
	
	public float area_total() {
		return (float)(3.14 * r * (r + geratriz()));
	}

	public float litros() {
		return (float)(3.45 * area_total());
	}
	
	public int latas() {
		return (int)((litros() / 18) + 1);
	}
	
	public float preco_total() {
		if (tipo_de_tinta == 1)
			return (float)(latas() * 238.90);
		else if (tipo_de_tinta == 2) 
			return (float)(latas() * 467.98); 
		else
			return (float)(latas() * 758.34);
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cone [z=");
		builder.append(z);
		builder.append(", r=");
		builder.append(r);
		builder.append(", tipo_de_tinta=");
		builder.append(tipo_de_tinta);
		builder.append(", geratriz()=");
		builder.append(geratriz());
		builder.append(", area_do_fundo()=");
		builder.append(area_do_fundo());
		builder.append(", area_lateral()=");
		builder.append(area_lateral());
		builder.append(", area_total()=");
		builder.append(area_total());
		builder.append(", litros()=");
		builder.append(litros());
		builder.append(", latas()=");
		builder.append(latas());
		builder.append(", preco_total()=");
		builder.append(preco_total());
		builder.append("]");
		return builder.toString();
	}
}














