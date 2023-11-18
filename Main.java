import java.util.Scanner;
public class Main 
{
	public static void Main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Pessoa tasker = new Pessoa();
		//TODO: dar vida ao sistema aqui 
		System.out.println("Nome da pessoa: ");
		String nome = sc.nextLine();
		tasker.setNome(nome);
		
		System.out.println("Cep da pessoa: ");
		String cep = sc.nextLine();
		tasker.setCep(cep);
		
		System.out.println("Documento da pessoa: ");
		String documento = sc.nextLine();
		tasker.setDocumento(documento);
		
		System.out.println("Sexo da pessoa:: ");
		String sexo = sc.nextLine();
		tasker.setSexo(sexo);
		
		System.out.println("Data de nascimento da Pessoa: ");
		String dataNascimento = sc.nextLine();
		tasker.setDataNascimento(dataNascimento);
		
		System.out.println("Endereço da pessoa: ");
		String endereco = sc.nextLine();
		tasker.setEndereco(endereco);
		
		System.out.println("Telefone da pessoa: ");
		String telefone = sc.nextLine();
		tasker.setTelefone(telefone);
	}
	
}