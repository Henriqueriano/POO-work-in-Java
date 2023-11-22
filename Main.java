
// Import space:
import java.util.Scanner;
import java.util.ArrayList;

// Classe pai de Clientes:
abstract class Pessoa 
{
// Atributos:
	protected String endereco;
	protected String dataNascimento;
	protected String nome;

// Construtor da classe:
	public Pessoa(String nome, String endereco, String dataNascimento)       
	{ 
		this.nome = nome;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;

	}

// Gets:
	public String getNome()  		 { return this.nome; }
	public String getEndereco()  	   { return this.endereco; }
    public String getDataNascimento()  { return this.dataNascimento; }

//Sets:
	public void setNome(String nome) { this.nome = nome; }
	public void setEndereco(String endereco) { this.endereco = endereco; }
    public void setDataNascimento(String dataNascimento) { this.dataNascimento = dataNascimento; }
}

// Classe filha de Pessoa:
class Clientes extends Pessoa 
{
// Atributos:
	private String documento; // Cadastro de Pessoa Física ou Jurídica (CPF OU CNPJ)
    private String contato;

// Construtor:
	public Clientes(String nome, String documento, String endereco, String dataNascimento) 
	{
		super(nome, endereco, dataNascimento);
		this.documento = documento;
	}

// Gets:
	public String getDocumento() { return this.documento; }
    public String getContato() { return this.contato; }
	
// Sets:
	public void SetDocumento(String documento) { this.documento = documento; }
	public void setContato (String contato) { this.contato = contato; }
}

// Classe de estruturação de Produtos:
class Produto 
{
// Atributos:
	private String nome;
	private String modelo;
	private double valor;
	private int credeb;
	
// Construtor da classe:
	public Produto(String nome, String modelo, double valor, int credeb) 
	{
		this.nome = nome;
		this.modelo = modelo;
		this.valor = valor;
		this.credeb = credeb;
	}
	
// Gets:
	public double getValor()  { return this.valor; }
	public String getNome()   { return this.nome; }
	public String getModelo() { return this.modelo; }
	public int getPagamento() { return this.credeb; }
	
// Sets:
	public void setNome(String nome) { this.nome = nome;}
	public void setModelo(String modelo) { this.modelo = modelo; }
	public void setValor(double valor) { this.valor = valor; }
	public void setPagamento (int credeb) { this.credeb = credeb;}
}

// Classe agregada de Produtos:
class Compra {
// Objtos da classe: 
	Clientes cl = new Clientes("Carlin o brabo", "999.999.999-99", "Rua OdeioMainZed, Número 444", "21/07/2003");
	private ArrayList<Produto> produto = new ArrayList<>();

// Atributos:
	private int numNF;
	private double total;

// Construtor da classe:
	public Compra() { this.numNF = (int) (Math.random() * 100); }

// Gets:
	public int getNF() { return this.numNF;}

// Sets:
	public void setNF(int numNF) {this.numNF = numNF;}

// Método:
	public void addProdutos(String nome, String modelo, double valor, int credeb) 
	{
		produto.add(new Produto(nome, modelo, valor, credeb));
	}

// Método:
	public void listarProdutos() 
	{
		int j = 0;
		System.out.println("\nListando todos os produtos:");
		for (Produto produto : produto) 
		{
			String pagamento = " ";
			j++;
			int formaDePagament = produto.getPagamento();
			if (formaDePagament == 1) { pagamento = "Débito";} else if(formaDePagament == 2) { pagamento = "Crédito";} else if(formaDePagament == 3) { pagamento = "Dinheiro";} else { pagamento = "Não informada";}
			System.out.printf(
					"+=---=+=---=+=---=+=---=+=---=+=---=+\nNome: %s\nModelo: %s\nValor: R$%.2f\nForma de Pagamento: %s\n+=---=+=---=+=---=+=---=+=---=+=---=+\n",
					produto.getNome(), produto.getModelo(), produto.getValor(), pagamento);
		}
		System.out.printf("\nTotal de produtos na compra: %d", j);
		System.out.printf("\nPróxima escolha (digite 2 para visualizar o menu): ");
	}

// Método:
	public void finalizarVenda() 
	{
		int k = 0;
		for (Produto produto : produto) 
		{
			k++;
			total += produto.getValor();
		}
		System.out.printf("\nNome & Documento do Clientes: %s, %s \n+=---=+=---=+=---=+=---=+=---=+=---=+", cl.getNome(), cl.getDocumento());
		System.out.printf("\nEndereço do Clientes: %s", cl.getEndereco());
		System.out.printf("\nData de nascimento do Clientes: %s", cl.getDataNascimento());
		System.out.printf("\nTotal de produtos na compra: %d", k);
		System.out.printf("\nTotal da compra: R$%.2f", total);
		System.out.printf("\nNota fiscal gerada: %d", (int) Math.round(numNF));
	}

// Método operacional 1:
	public void mediaDeProdutos() {
		int i = 0;
		double ttvalor = 0;
		for (Produto produto : produto) {
			i++;
			ttvalor += produto.getValor();
		}
		double media = (ttvalor / i);
		System.out.printf("Media dos valores dos produtos cadastrados: R$%.2f;",media);
	}

// Método operacional 2:
	public void quantCredito() 
	{
		int i = 0;
		for (Produto produto : produto) 
		{
			int formaDePagament = produto.getPagamento();
			if (formaDePagament == 2) { i++;} 
		}
		System.out.printf("\nQuantidade de pagamentos em Crédito: %d;", i);
	}

// Método operacional 3:
	public void quantDebito() 
	{
		int i = 0;
		for (Produto produto : produto) 
		{
			int formaDePagament = produto.getPagamento();
			if (formaDePagament == 1) { i++;} 
		}
		System.out.printf("\nQuantidade de pagamento em Debito: %d;", i);
	}

// Método operacional 4:
	public void quantDinheiro() 
	{
		int i = 0;
		for (Produto produto : produto) 
		{
			int formaDePagament = produto.getPagamento();
			if (formaDePagament == 2) { i++;} 
		}
		System.out.printf("\nQuantidade de pagamentos em Dinheiro: %d;\nPróxima escolha (digite 2 para visualizar o menu): ", i);
	}
}

// Vida do programa
public class Main 
{
	public static void main(String[] args) 
	{
// Atributos:
		boolean fun = true;

// Instância de objetos:
		Compra c = new Compra();
		Scanner sc = new Scanner(System.in);

// Apresentação do ERP:
		System.out.print("\033[H\033[2J");
		System.out.println("ERP de Loja by Brenin and Daniel H.");
		System.out.println("+=-------------------------------=+");
		System.out.println("Para realizar uma compra digite 0;\nPara listar os produtos da sua compra atual digite 1;\nReexibir este menu digite 2;\nPara visualizar as estatísticas digite 3;\nPara Finalizar digite 4;");
		System.out.print("Sua escolha: ");

// Lógica do código:
		while(fun) 
		{
			
			try {
				int choice = sc.nextInt();
				// Seleção de caso
				switch (choice) 
				{
					case 0: // Cadastro de um novo produto
						System.out.print("\033[H\033[2J");
						double valor = Math.random() * 10;
						System.out.println("\nInforme o nome do produto: ");
						String name = sc.next();
						System.out.println("Informe o modelo do produto: ");
						String model = sc.next();
						System.out.println("Informe a forma de pagamento (1 para Debito, 2 para Credito, 3 para Dinheiro): ");
						int credeb = sc.nextInt();
						c.addProdutos(name, model, valor, credeb);
						System.out.print("Produto Cadastrado! \nPróxima escolha (digite 2 para visualizar o menu): ");
						break;

					case 1: // Listagem de produtos
						System.out.print("\033[H\033[2J");
						c.listarProdutos();
						break;

					case 2: // Menu/Ajuda ao usuário:
						System.out.print("\033[H\033[2J");
						System.out.println("\nMENU:");
						System.out.println("Para realizar uma compra digite 0;\nPara listar os produtos da sua compra atual digite 1;\nReexibir este menu digite 2;\nPara visualizar as estatísticas digite 3;\nPara Finalizar digite 4;");
						System.out.print("Sua escolha: ");
					break;

					case 3: // Ver estatísticas dos produtos inseridos:
						System.out.print("\033[H\033[2J");
						c.mediaDeProdutos();
						c.quantCredito();
						c.quantDebito();
						c.quantDinheiro();
						break;

					case 4: // Finalizar seleção:
						System.out.print("\033[H\033[2J");
						c.finalizarVenda();
						sc.close();
						fun = false;
					break;

				}
			}
		catch (Exception e) // Tratamento de erro:
		{
			System.out.print("\033[H\033[2J");
			System.out.println("Erro, contate aos devs e recomece a sua compra!");
			System.out.println("Desobedeceu as regras de Seleção amigo? (que feio em usuário)");
			break;
		}
}
}		
}
