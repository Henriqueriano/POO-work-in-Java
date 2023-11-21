// Import space
import java.util.Scanner;
import java.util.ArrayList;

abstract class Pessoa 
{
	protected String nome;
    protected String endereco;
    protected String dataNascimento;

	public Pessoa(String nome, String endereco, String dataNascimento)      
    { 
        this.nome = nome; 
        this.endereco = endereco;
        this.dataNascimento = dataNascimento; 
    }

	public String getNome()  		   { return this.nome; }
    public String getEndereco()  	   { return this.endereco; }
    public String getDataNascimento()  { return this.dataNascimento; }

	public void setNome(String nome) { this.nome = nome; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
    public void setDataNascimento(String dataNascimento) { this.dataNascimento = dataNascimento; }
}

// Herança
class Cliente extends Pessoa 
{
	private String documento; // Cadastro de Pessoa Física ou Jurídica (CPF OU CNPJ)
    private String contato;

	public Funcionario(String nome, String documento, String contato) 
	{
		super(nome);
        this.documento = documento;
        this.contato = contato;
	}

	public documento() { return this.documento; }
    public contato() { return this.contato; }

	public void setdocumento(String documento) { this.documento = documento; }
    public void setcontato(String contato) { this.contato = contato; }
}

class Produto 
{
	private String nome;
	private String modelo;
	private double valor;
	public Produto(String nome, String modelo, double valor) 
	{
		this.nome = nome;
		this.modelo = modelo;
		this.valor = valor;
	}
	public double getValor()  { return this.valor; }
	public String getNome()   { return this.nome; }
	public String getModelo() { return this.modelo; }
	public void setNome(String nome) { this.nome = nome;}
	public void setModelo(String modelo) { this.modelo = modelo; }
	public void setValor(double valor) { this.valor = valor; }
}

// Agregamento
class Compra {
	private ArrayList<Produto> produto = new ArrayList<>();
	private int numNF;
	private double total;
	public Compra() { this.numNF = (int) (Math.random() * 100); }
	public int getNF() { return this.numNF;}
	public void setNF(int numNF) {this.numNF = numNF;}
	public void addProdutos(String nome, String modelo, double valor) 
	{
		produto.add(new Produto(nome, modelo, valor));
	}
	public void listarProdutos() 
	{
		int j = 0;
		System.out.println("\nListando todos os produtos:");
		for (Produto produto : produto) 
		{
			j++;
			System.out.printf(
					"+=---=+=---=+=---=+=---=+=---=+=---=+\nNome: %s\nModelo: %s\nValor: R$%.2f\n+=---=+=---=+=---=+=---=+=---=+=---=+",
					produto.getNome(), produto.getModelo(), produto.getValor());
		}
		System.out.printf("\nTotal de produtos na compra: %d", j);
		System.out.printf("\nPróxima escolha: ");
	}
	public void finalizarVenda() 
	{
		int k = 0;
		for (Produto produto : produto) 
		{
			k++;
			total += produto.getValor();
		}
		System.out.printf("\nTotal de produtos na compra: %d", k);
		System.out.printf("\nTotal da compra: R$%.2f", total);
		System.out.printf("\nNota fiscal gerada: %d", (int) Math.round(numNF));
	}
}

// Vida do programa
public class Main 
{
	public static void main(String[] args) 
	{
		Compra c = new Compra();
		Scanner sc = new Scanner(System.in);
		Funcionario carlin = new Funcionario("Carlin o brabo", 77);
		System.out.println("ERP de Loja by Brenin and Daniel H.");
		System.out.println("+=-------------------------------=+\n");
		System.out.printf("%s( Numero funcional %d ) diz:\n", carlin.getNome(), carlin.getNumFuncional());
		System.out.println(
				"Para realizar uma compra digite 0;\nPara listar os produtos de sua compra atual digite1;\nPara Finalizar digite 2;");
		System.out.print("Sua escolha: ");
		try 
		{
			// Seleção de caso
			boolean fun = true;
			while (fun) 
			{
				int choice = sc.nextInt();
				switch (choice) 
				{
					case 0:
						double valor = Math.random() * 10;
						System.out.println("\nInforme o nome do produto: ");
						String name = sc.next();
						System.out.println("Informe o modelo do produto: ");
						String model = sc.next();
						c.addProdutos(name, model, valor);
						System.out.print("Produto Cadastrado! \nPróxima escolha: ");
						break;

					case 1:
						c.listarProdutos();
						break;

					case 2:
						c.finalizarVenda();
						fun = false;
						break;
				}
			}
		} catch (Exception e) 
		{
			System.out.println("Erro de entrada!");
		} finally 
		{
			sc.close();
		}
	}
}