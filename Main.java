
// Import space
import java.util.Scanner;
import java.util.ArrayList;

abstract class Pessoa 
{
	protected String nome;
	public Pessoa(String nome)       { this.nome = nome; }
	public String getNome()  		 { return this.nome; }
	public void setNome(String nome) { this.nome = nome; }
}

// Herança
class Cliente extends Pessoa 
{
	private String cPF;
	public Cliente(String nome, String cPF) 
	{
		super(nome);
		this.cPF = cPF;
	}
	public String getcPF() { return this.cPF; }
	public void setcPF(String cPF) { this.cPF = cPF; }
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
	Cliente cl = new Cliente("Carlin o brabo", "999.999.999-99");
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
		System.out.printf("\nNome & CPF do cliente: %s, %s \n+=---=+=---=+=---=+=---=+=---=+=---=+", cl.getNome(), cl.getcPF());
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
		System.out.println("ERP de Loja by Brenin and Daniel H.");
		System.out.println("+=-------------------------------=+");
		System.out.println("Para realizar uma compra digite 0;\nPara listar os produtos da sua compra atual digite 1;\nReexibir este menu digite 2;\nPara Finalizar digite 3;");
		System.out.print("Sua escolha (digite 2 para ajuda): ");
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
						System.out.print("Produto Cadastrado! \nPróxima escolha (digite 2 para ajuda): ");
						break;

					case 1:
						c.listarProdutos();
						break;

					case 2:
						System.out.println("\nMENU:");
						System.out.println("Para realizar uma compra digite 0;\nPara listar os produtos da sua compra atual digite 1;\nReexibir este menu digite 2;\nPara Finalizar digite 3;");
						System.out.print("Sua escolha: ");
					break;

					case 3:
						c.finalizarVenda();
						sc.close();
						fun = false;
						break;

					
				}
			}
		} catch (Exception e) 
		{
			System.out.println("Erro de entrada!");
		}
}
}
