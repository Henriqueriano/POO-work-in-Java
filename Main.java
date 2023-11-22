// Import space:
import java.util.Scanner;
import java.util.ArrayList;

// Classe pai de Cliente:
abstract class Pessoa 
{
// Atributos:
	protected String endereco;
	protected String dataNascimento;
	protected String nome;

// Construtor da classe Pessoa:
	public Pessoa(String nome, String endereco, String dataNascimento)       
	{ 
		this.nome = nome;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
	}

// Get's da classe:
	public String getNome()  		 
	{ 
		return this.nome; 
	}
	public String getEndereco()  	   
	{ 
		return this.endereco; 
	}
    public String getDataNascimento()  
	{ 
		return this.dataNascimento; 
	}

// Set's da classe:
	public void setNome(String nome) 
	{ 
		this.nome = nome; 
	}
	public void setEndereco(String endereco) 
	{ 
		this.endereco = endereco; 
	}
    public void setDataNascimento(String dataNascimento) 
	{ 
		this.dataNascimento = dataNascimento; 
	}
}

// Classe filha de Pessoa:
class Cliente extends Pessoa 
{
// Atributos:
	private String documento; // Cadastro de Pessoa Física ou Jurídica (CPF OU CNPJ)
    private String contato;

// Construtor da Classe Cliente:
	public Cliente(String nome, String documento, String endereco, String dataNascimento) 
	{
		super(nome, endereco, dataNascimento);
		this.documento = documento;
	}

// Get's da classe:
	public String getDocumento() 
	{ 
		return this.documento; 
	}
    public String getContato() 
	{ 
		return this.contato; 
	}

// Set's da classe:
	public void SetDocumento(String documento) 
	{ 
		this.documento = documento;
	}
	public void setContato (String contato)
	{ 
		this.contato = contato; 
	}
}

class Produto 
{
// Atributos:
	Scanner sc = new Scanner(System.in);
	private ArrayList<Produto> produtos = new ArrayList<>();
	private String nome;
	private String modelo;
	private double valor;
	private int idProduto;

// Construtor da classe Produto:
	public Produto(int idProduto, String nome, String modelo, double valor) 
	{
		this.idProduto = idProduto;
		this.nome = nome;
		this.modelo = modelo;
		this.valor = valor;
	}

// Get's da classe:
	public int getID() 
	{ 
		return this.idProduto;
	}
	public double getValor()  
	{ 
		return this.valor; 
	}
	public String getNome()   
	{ 
		return this.nome; 
	}
	public String getModelo() 
	{ 
		return this.modelo; 
	}

// Set's da classe:
	public void setID(int ID) 
	{
		this.idProduto = ID;
	}
	public void setNome(String nome) 
	{ 
		this.nome = nome;
	}
	public void setModelo(String modelo) 
	{ 
		this.modelo = modelo; 
	}
	public void setValor(double valor) 
	{ 
		this.valor = valor; 
	}

// Metodo:
	public void cadastrarProdutos() 
	{
		System.out.println("Id do produto:");
		int id = sc.nextInt();
		System.out.println("Nome do produto:");
		String nome = sc.next();
		System.out.println("Modelo do produto:");
		String modelo = sc.next();
		System.out.println("Id do produto:");
		double valor = sc.nextDouble();
		produtos.add(new Produto(id, nome, modelo, valor));
	}

// Metodo:
	public void addProduto(Produto p) 
	{
		produtos.add(p);

	}

// Metodo:
	public void listarProdutos() 
	{
		int j = 0;
		System.out.println("\nListando todos os produtos:");
		for (Produto produto : produtos) 
		{
			j++;
			System.out.printf(
					"\n+=---=+=---=+=---=+=---=+=---=+=---=+\nId: %d\nNome: %s\nModelo: %s\nValor: R$%.2f\n+=---=+=---=+=---=+=---=+=---=+=---=+",
					produto.getID(),produto.getNome(), produto.getModelo(), produto.getValor());
		}
		System.out.printf("\nTotal de produtos na compra: %d", j);
		System.out.printf("\nPróxima escolha (digite 2 para visualizar o menu): ");
	}

}

// Agregamento:
class Compra extends ItensDePedido
{

// Atributos:
	Cliente cl = new Cliente("Carlin o brabo", "999.999.999-99", "Rua OdeioMainZed, Número 444", "21/07/2003");
	private int numNF;

// Construtor da classe:
	public Compra() 
	{ 
		this.numNF = (int) (Math.random() * 100); 
	}

// Get's da classe:
	public int getNF() 
	{ 
		return this.numNF;
	}

// Set's da classe:
	public void setNF(int numNF) 
	{
		this.numNF = numNF;
	}

// Metodo:
	public void finalizarVenda() 
	{
		double total = 0;
		int k = 0;
		for (Produto produto : itens) 
		{
			k++;
			total += produto.getValor();
		}
		System.out.printf("\nNome & Documento do cliente: %s, %s \n+=---=+=---=+=---=+=---=+=---=+=---=+", cl.getNome(), cl.getDocumento());
		System.out.printf("\nEndereço do cliente: %s", cl.getEndereco());
		System.out.printf("\nData de nascimento do cliente: %s", cl.getDataNascimento());
		System.out.printf("\nTotal de produtos na compra: %d", k);
		System.out.printf("\nTotal da compra: R$%.2f", total);
		System.out.printf("\nNota fiscal gerada: %d", (int) Math.round(numNF));
	}
}

abstract class ItensDePedido
{
// Atributos:
	Scanner sc = new Scanner(System.in);
	protected ArrayList<Produto> itens = new ArrayList<>();

// Metodo:
	public void addIten(Produto p) 
	{
		itens.add(p);
	}

// Metodo:
	public void listarItens() 
	{
		int j = 0;
		System.out.println("\nListando todos os produtos:");
		for (Produto produto : itens) 
		{
			j++;
			System.out.printf(
					"\n+=---=+=---=+=---=+=---=+=---=+=---=+\nId: %d\nNome: %s\nModelo: %s\nValor: R$%.2f\n+=---=+=---=+=---=+=---=+=---=+=---=+",
					produto.getID(),produto.getNome(), produto.getModelo(), produto.getValor());
		}
		System.out.printf("\nTotal de produtos na compra: %d", j);
		System.out.printf("\nPróxima escolha (digite 2 para visualizar o menu): ");
	}

}

// Vida do programa:
public class Main 
{
	public static void main(String[] args) 
	{

// Atributos:
		boolean fun = true;

// Instancia dos objetos:
		Compra c = new Compra();
		Scanner sc = new Scanner(System.in);

// Apresentação do sistema:
		System.out.println("ERP de Loja by Brenin and Daniel H.");
		System.out.println("+=-------------------------------=+");
		System.out.println("Para visualizar os produtos digite 0;\nPara escolher um produto para a compra atual digite 1;\nReexibir este menu digite 2;\nPara Finalizar digite 3;");
		System.out.print("Sua escolha: ");

		while(fun) 
		{
			
			try 
			{
				int choice = sc.nextInt();
				// Seleção de caso
				switch (choice) 
				{
					case 0:
						System.out.print("\033[H\033[2J");
						c.listarItens();
					break;

					case 1:
						break;

					case 2:
						System.out.print("\033[H\033[2J");
						System.out.println("\nMENU:");
						System.out.println("Para realizar uma compra digite 0;\nPara listar os produtos da sua compra atual digite 1;\nReexibir este menu digite 2;\nPara Finalizar digite 3;");
						System.out.print("Sua escolha: ");
					break;

					case 3:
						System.out.print("\033[H\033[2J");
						c.finalizarVenda();
						sc.close();
						fun = false;
						break;

				}
			}
		catch (Exception e) 
		{
			System.out.print("\033[H\033[2J");
			System.out.println("Erro, contate aos devs! E recomece a sua compra!");
			System.out.println("Desobedeceu as regras de Seleção amigo? (que feio em usuário)");
			break;
		}
}
}		
}