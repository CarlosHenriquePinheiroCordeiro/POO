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
import java.text.SimpleDateFormat;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;

public final class Computador extends Eletronico 
implements IEnviarDados{
	
	private List<Gpu> lgpus = new ArrayList<Gpu>();
	private String marca;
	
	Random random = new Random();
	Gpu gpu = new Gpu();
	
	public Computador(String marca, boolean energia) {
		setMarca(marca);
		ligar(energia);
	}
	
	public void ligar(boolean energia) {
		if (Energia.getEnergia())
			setLigado(Energia.getEnergia());
	}
	
	//A PARTIR DE OUTROS SUPOSTOS PERIFÉRICOS SÃO INSERIDOS DADOS BINÁRIOS, POR ISSO O ALEATÓRIO DE 0 A 1
	public String inserirDado() {
		return (random.nextInt(2)+""); 
	}
	
	public void salvarCSV() throws IOException {
		FileWriter arquivo = new FileWriter("listaGpus.csv");
		PrintWriter gravarArquivo = new PrintWriter(arquivo);
		for (Gpu gpu : getLgpus()) 
			gravarArquivo.printf("%s\n", gpu.getMarca());
		arquivo.close();
		try {
			FileReader arquivo1 = new FileReader("listaGpus.csv");
			BufferedReader lerArquivo = new BufferedReader(arquivo1);
			String linha = lerArquivo.readLine();
			lgpus = new ArrayList<Gpu>();
			while (linha != null) {
				String[] leitura = linha.split(" - ");
				Gpu gpu = new Gpu();
				gpu.setMarca(leitura[0]);
				lgpus.add(gpu);
				linha = lerArquivo.readLine();
			}
			arquivo1.close();
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: %s.\n");
				e.getMessage();
		}
		for (Gpu gpus : lgpus)
			System.out.println(gpus);
	}
	
	public void salvarXML() {
		Element config = new Element("ListaGpus");
		Document documento = new Document(config);
		Element titulo = new Element("titulo");
		titulo.setText("ListaGpus");
		Element data = new Element("data");
		data.setText(DataHoraForStringPadraoH(new Date()));
		config.addContent(titulo);
		config.addContent(data);
		
		for (int x = 0; x < lgpus.size(); x++) {
			Element gpu = new Element("gpu");
			gpu.setAttribute("marca", String.valueOf(lgpus.get(x).getMarca()));
			config.addContent(gpu);
		}
		
		XMLOutputter xout = new XMLOutputter();
		try {
			BufferedWriter arquivo = new BufferedWriter
					(new OutputStreamWriter(
							new FileOutputStream("xml/listagpus.xml"), "UTF-8"));
			xout.output(documento, arquivo);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		lgpus = new ArrayList<Gpu>();
		Document doc = null;
		SAXBuilder builder = new SAXBuilder();
		try {
			doc = builder.build("xml/listagpus.xml");
		} catch (Exception e) {
			e.printStackTrace();
		}
		config = doc.getRootElement();
		List<?> ls = config.getChildren("gpu");
		
		for (Iterator<?> iter = ls.iterator(); iter.hasNext();) {
			Element element = (Element) iter.next();
			gpu = new Gpu();
			gpu.setMarca(element.getAttributeValue("marca"));
			lgpus.add(gpu);
		}
		
		for (Gpu gpu : getLgpus()) {
			System.out.println(gpu);
			System.out.println("---------------------------------");
		}
	}
	
	public void salvarJSON() throws IOException{
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		FileWriter writer = new FileWriter("json/gpus.json");
		writer.write(gson.toJson(getLgpus()));
		writer.close();
		
		System.out.println(gson.toJson(getLgpus()));
		builder = new GsonBuilder();
		gson = builder.create();
		BufferedReader bufferedReader = new BufferedReader
				(new FileReader("json/gpus.json"));
		Type listType = new TypeToken<ArrayList<Gpu>>() {}.getType();
		lgpus = new ArrayList<Gpu>();
		lgpus = new Gson().fromJson(bufferedReader, listType);
		for (Iterator<Gpu> iterator = lgpus.iterator(); iterator.hasNext();) {
			Gpu especialidade = (Gpu) iterator.next();
			System.out.println(especialidade.toString());
		}
	}
	
	public boolean addGpu(Gpu gpu) {
		return lgpus.add(gpu);
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public List<Gpu> getLgpus() {
		return lgpus;
	}

	public static String DataHoraForStringPadraoH(Date pDate) {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy H:mm:ss");
		String s = "";
		try {
			s = df.format(pDate);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return s;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Computador [marca=");
		builder.append(marca);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		for (Gpu gpu :lgpus) {
			builder.append(gpu.toString());
		}
		return builder.toString();
	}

}
