import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;
import java.util.Iterator;
import java.util.Date;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;

public final class Teclado extends Eletronico 
implements IEnviarDados{
	
	private List<Tecla> teclas = new ArrayList<Tecla>();
	private String marca;
	
	Random random = new Random();
	Tecla tecla = new Tecla();

	public Teclado(String marca, boolean energia) {
		setMarca(marca);
		ligar(energia);
	}
	
	public void ligar(boolean energia) {
		if (Energia.getEnergia())
			setLigado(Energia.getEnergia());
	}
	
	public String inserirDado() {
		return teclas.get(random.nextInt(teclas.size())).getSimbolo();
	}
	
	public void salvarCSV() throws IOException {
		FileWriter arquivo = new FileWriter("listaTeclas.csv");
		PrintWriter gravarArquivo = new PrintWriter(arquivo);
		for (Tecla tecla : getTeclas()) 
			gravarArquivo.printf("%s\n", tecla.getSimbolo());
		arquivo.close();
		try {
			FileReader arquivo1 = new FileReader("listaTeclas.csv");
			BufferedReader lerArquivo = new BufferedReader(arquivo1);
			String linha = lerArquivo.readLine();
			teclas = new ArrayList<Tecla>();
			while (linha != null) {
				String[] leitura = linha.split(" - ");
				Tecla tecla = new Tecla();
				tecla.setSimbolo(leitura[0]);
				teclas.add(tecla);
				linha = lerArquivo.readLine();
			}
			arquivo1.close();
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: %s.\n");
				e.getMessage();
		}
		System.out.println(teclas);
	}
	
	public void salvarXML() {
		Element config = new Element("ListaTeclas");
		Document documento = new Document(config);
		Element titulo = new Element("titulo");
		titulo.setText("ListaTeclas");
		Element data = new Element("data");
		data.setText(Computador.DataHoraForStringPadraoH(new Date()));
		config.addContent(titulo);
		config.addContent(data);
		
		for (int x = 0; x < teclas.size(); x++) {
			Element tecla = new Element("tecla");
			tecla.setAttribute("simbolo", String.valueOf(teclas.get(x).getSimbolo()));
			config.addContent(tecla);
		}
		
		XMLOutputter xout = new XMLOutputter();
		try {
			BufferedWriter arquivo = new BufferedWriter
					(new OutputStreamWriter(
							new FileOutputStream("xml/listateclas.xml"), "UTF-8"));
			xout.output(documento, arquivo);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		teclas = new ArrayList<Tecla>();
		Document doc = null;
		SAXBuilder builder = new SAXBuilder();
		try {
			doc = builder.build("xml/listateclas.xml");
		} catch (Exception e) {
			e.printStackTrace();
		}
		config = doc.getRootElement();
		List<?> ls = config.getChildren("tecla");
		
		for (Iterator<?> iter = ls.iterator(); iter.hasNext();) {
			Element element = (Element) iter.next();
			tecla = new Tecla();
			tecla.setSimbolo(element.getAttributeValue("simbolo"));
			teclas.add(tecla);
		}
		
		for (Tecla tecla : getTeclas()) {
			System.out.println(tecla);
			System.out.println("---------------------------------");
		}
	}

	public void salvarJSON() throws IOException{
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		FileWriter writer = new FileWriter("json/teclas.json");
		writer.write(gson.toJson(getTeclas()));
		writer.close();
		
		System.out.println(gson.toJson(getTeclas()));
		builder = new GsonBuilder();
		gson = builder.create();
		BufferedReader bufferedReader = new BufferedReader
				(new FileReader("json/teclas.json"));
		Type listType = new TypeToken<ArrayList<Tecla>>() {}.getType();
		teclas = new ArrayList<Tecla>();
		teclas = new Gson().fromJson(bufferedReader, listType);
		for (Iterator<Tecla> iterator = teclas.iterator(); iterator.hasNext();) {
			Tecla especialidade = (Tecla) iterator.next();
			System.out.println(especialidade.toString());
		}
	}
	
	public boolean addTecla(String simbolo) {
		Tecla tecla = new Tecla(simbolo);
		return teclas.add(tecla); 
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		if (marca.length() > 0)
			this.marca = marca;
	}

	public List<Tecla> getTeclas() {
		return teclas;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Teclado [marca=");
		builder.append(marca);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		for (Tecla tecla : teclas) {
			builder.append(tecla.toString());
		}
		return builder.toString();
	}
	
}
