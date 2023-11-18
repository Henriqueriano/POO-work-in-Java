import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		//TODO: dar vida ao sistema aqui 
		// Objects
		Scanner sc = new Scanner(System.in);
		Pessoa people= new Pessoa();
		
		// Dfinindo o objeto
		System.out.println("Nome da pessoa: ");
		String nome = sc.nextLine();
		people.setNome(nome);
		
		System.out.println("Cep da pessoa: ");
		String cep = sc.nextLine();
		people.setCep(cep);
		
		System.out.println("Documento da pessoa: ");
		String documento = sc.nextLine();
		people.setDocumento(documento);
		
		System.out.println("Sexo da pessoa:: ");
		String sexo = sc.nextLine();
		people.setSexo(sexo);
		
		System.out.println("Data de nascimento da Pessoa: ");
		String dataNascimento = sc.nextLine();
		people.setDataNascimento(dataNascimento);
		
		System.out.println("Endereço da pessoa: ");
		String endereco = sc.nextLine();
		people.setEndereco(endereco);
		
		System.out.println("Telefone da pessoa: ");
		String telefone = sc.nextLine();
		people.setTelefone(telefone);
		
		// TEstando
		people.addPessoa(people);
		people.listarPessoas();
	}
	
}