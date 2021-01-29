//CLASSE Main

public class Main {
	public static void main(String[] args) {
		//1 - Pessoa
		Pessoa pessoa = new Pessoa("Carlos", "Ituporanga");
		System.out.println(pessoa);
		System.out.print("\n");
		PessoaFisica pessoaFisica = new PessoaFisica("Suelen", "Aurora", "001.001.001-01", "Solteira");
		System.out.println(pessoaFisica);
		System.out.print("\n");
		PessoaJuridica pessoaJuridica = new PessoaJuridica("Luis", "Ituporanga", "01.001.001/0001-01", "MEI");
		System.out.println(pessoaJuridica);
		System.out.print("\n");
		//2 - Item
		Item item = new Item(1010, "Áspero");
		System.out.println(item);
		System.out.print("\n");
		Livro livro = new Livro(1011, "Pesado", "Monteiro");
		System.out.println(livro);
		System.out.print("\n");
		Midia midia = new Midia(1020, "Rock/Metal gospel", "MK", (float)4.53);
		System.out.println(midia);
		System.out.print("\n");
		CD cd = new CD(1021, "Rock/Metal gospel", "MK", (float)109.42, 12, "OficinaG3", "DepoisDaGuerra");
		System.out.println(cd);
		System.out.print("\n");
		VHS vhs = new VHS(1022, "Rock/Metal gospel", "MK", (float)4.18, "Incondicional");
		System.out.println(vhs);
		System.out.print("\n");
		//3 - Simples
		Conta conta = new Conta("BancoDoBrasil", 001, 123456, 1000);
		System.out.println(conta);
		conta.deposito(100);
		conta.saque(200);
		System.out.println(conta);
		System.out.print("\n");
		ContaSimples contaSimples = new ContaSimples("BancoDoBrasil", 001, 164875, 800, 300);
		System.out.println(contaSimples);
		contaSimples.depositoPoupanca(100);
		contaSimples.saquePoupanca(200);
		System.out.println(contaSimples);
		System.out.print("\n");
		ContaEspecial contaEspecial = new ContaEspecial("BancoDoBrasil", 001, 134978, 3000, 5, 5000);
		System.out.println(contaEspecial);
	}
}

//CLASSE Pessoa

public class Pessoa {
	
	private String nome;
	private String endereco;
	
	public Pessoa (String nome, String endereco) {
		setNome(nome);
		setEndereco(endereco);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if (nome.length() > 0)
			this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		if (endereco.length() > 0)
			this.endereco = endereco;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [nome=");
		builder.append(nome);
		builder.append(", endereco=");
		builder.append(endereco);
		builder.append("]");
		return builder.toString();
	}
	
}

//CLASSE PessoaFisica

public class PessoaFisica extends Pessoa {

	private String cpf;
	private String estadoCivil;
	
	public PessoaFisica(String nome, String endereco, String cpf, String estadoCivil) {
		super(nome, endereco);
		setCpf(cpf);
		setEstadoCivil(estadoCivil);
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		if (cpf.length() > 0)
			this.cpf = cpf;
	}
	
	public String getEstadoCivil() {
		return estadoCivil;
	}
	
	public void setEstadoCivil(String estadoCivil) {
		if (estadoCivil.length() > 0)
			this.estadoCivil = estadoCivil;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PessoaFisica [cpf=");
		builder.append(cpf);
		builder.append(", estadoCivil=");
		builder.append(estadoCivil);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}

//CLASSE PessoaJuridica

public class PessoaJuridica extends Pessoa {

	private String cnpj;
	private String tipoEmpresa;
	
	public PessoaJuridica(String nome, String endereco, String cnpj, String tipoEmpresa) {
		super(nome, endereco);
		setCnpj(cnpj);
		setTipoEmpresa(tipoEmpresa);
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		if (cnpj.length() > 0)
			this.cnpj = cnpj;
	}
	
	public String getTipoEmpresa() {
		return tipoEmpresa;
	}
	
	public void setTipoEmpresa(String tipoEmpresa) {
		if (tipoEmpresa.length() > 0)
			this.tipoEmpresa = tipoEmpresa;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PessoaJuridica [cnpj=");
		builder.append(cnpj);
		builder.append(", tipoEmpresa=");
		builder.append(tipoEmpresa);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}

//CLASSE Item

public class Item {
	
	private int codigo;
	private String descricao;
	
	public Item(int codigo, String descricao) {
		setCodigo(codigo);
		setDescricao(descricao);
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		if (codigo > 0)
			this.codigo = codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		if (descricao.length() > 0)
			this.descricao = descricao;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Item [codigo=");
		builder.append(codigo);
		builder.append(", descricao=");
		builder.append(descricao);
		builder.append("]");
		return builder.toString();
	}
	
}

//CLASSE Livro

public class Livro extends Item {
	
	private String autor;
	
	public Livro(int codigo, String descricao, String autor) {
		super(codigo, descricao);
		setAutor(autor);
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		if (autor.length() > 0)
			this.autor = autor;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Livro [autor=");
		builder.append(autor);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}

//CLASSE Midia
public class Midia extends Item {
	
	private String gravadora;
	private float duracao;
	
	public Midia(int codigo, String descricao, String gravadora, float duracao) {
		super(codigo, descricao);
		setGravadora(gravadora);
		setDuracao(duracao);
	}

	public String getGravadora() {
		return gravadora;
	}

	public void setGravadora(String gravadora) {
		if (gravadora.length() > 0)
			this.gravadora = gravadora;
	}

	public float getDuracao() {
		return duracao;
	}

	public void setDuracao(float duracao) {
		if (duracao > 0)
			this.duracao = duracao;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Midia [gravadora=");
		builder.append(gravadora);
		builder.append(", duracao=");
		builder.append(duracao);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}

//CLASSE CD
public class CD extends Midia {
	
	private int faixas;
	private String artista;
	private String album;
	
	public CD(int codigo, String descricao, String gravadora, float duracao, int faixas, String artista, String album) {
		super(codigo, descricao, gravadora, duracao);
		setFaixas(faixas);
		setArtista(artista);
		setAlbum(album);
	}

	public int getFaixas() {
		return faixas;
	}

	public void setFaixas(int faixas) {
		if (faixas > 0)
			this.faixas = faixas;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		if (artista.length() > 0)
			this.artista = artista;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		if (album.length() > 0)
			this.album = album;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CD [faixas=");
		builder.append(faixas);
		builder.append(", artista=");
		builder.append(artista);
		builder.append(", album=");
		builder.append(album);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}

//CLASSE VHS
public class VHS extends Midia {

	private String titulo;
	
	public VHS(int codigo, String descricao, String gravadora, float duracao, String titulo) {
		super(codigo, descricao, gravadora, duracao);
		setTitulo(titulo);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		if (titulo.length() > 0)
			this.titulo = titulo;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VHS [titulo=");
		builder.append(titulo);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}

//CLASSE Conta
public class Conta {

	private String banco;
	private int agencia;
	private int numeroConta;
	private double saldo;
	
	public Conta(String banco, int agencia, int numeroConta, double saldo) {
		setBanco(banco);
		setAgencia(agencia);
		setNumeroConta(numeroConta);
		setSaldo(saldo);
	}
	
	public boolean deposito(double valor) {
		if (valor > 0) {
			saldo = saldo + valor;
			return true;
		}else
			return false;
	}
	
	public boolean saque(double valor) {
		if (valor > 0) {
			saldo = saldo - valor;
			return true;
		}else
			return false;
	}
	
	public String getBanco() {
		return banco;
	}
	
	public void setBanco(String banco) {
		this.banco = banco;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		if (saldo > 0)
			this.saldo = saldo;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Conta [banco=");
		builder.append(banco);
		builder.append(", agencia=");
		builder.append(agencia);
		builder.append(", numeroConta=");
		builder.append(numeroConta);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append("]");
		return builder.toString();
	}
	
}

//CLASSE ContaSimples
public class ContaSimples extends Conta {

	private double saldoPoupanca;
	
	public ContaSimples(String banco, int agencia, int numeroconta, double saldo, double saldoPoupanca) {
		super(banco, agencia, numeroconta, saldo);
		setSaldoPoupanca(saldoPoupanca);
	}
	
	public boolean depositoPoupanca(double valor) {
		if (valor > 0) {
			saldoPoupanca = saldoPoupanca + valor;
			return true;
		}else
			return false;
	}
	
	public boolean saquePoupanca(double valor) {
		if (valor > 0) {
			saldoPoupanca = saldoPoupanca - valor;
			return true;
		}else
			return false;
	}

	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}

	public void setSaldoPoupanca(double saldoPoupanca) {
		if (saldoPoupanca > 0)
			this.saldoPoupanca = saldoPoupanca;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaSimples [saldoPoupanca=");
		builder.append(saldoPoupanca);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}

//CLASSE ContaEspecial
public class ContaEspecial extends Conta {

	private int diasSemJuros;
	private double limite;
	
	public ContaEspecial(String banco, int agencia, int numeroconta, double saldo, int diassemjuros, double limite) {
		super(banco, agencia, numeroconta, saldo);
		setDiasSemJuros(diassemjuros);
		setLimite(limite);
	}

	public int getDiasSemJuros() {
		return diasSemJuros;
	}

	public void setDiasSemJuros(int diasSemJuros) {
		if (diasSemJuros > 0)
			this.diasSemJuros = diasSemJuros;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		if (limite > 0)
			this.limite = limite;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaEspecial [diasSemJuros=");
		builder.append(diasSemJuros);
		builder.append(", limite=");
		builder.append(limite);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}

















