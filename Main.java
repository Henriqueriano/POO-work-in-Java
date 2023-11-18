import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		//TODO: dar vida ao sistema aqui 
		// Objects
		Scanner sc = new Scanner(System.in);
		Pessoa daniel = new Pessoa("444", "Daniel","M","21/07/2003","29176284","Rua 8, bairro Maria Niobe", "27997740242");
		Pessoa brenim = new Pessoa("555", "Brenim","M","Não declarado!","9999999","Rua 7, bairro Rangatanga", "7777777777");

		// TEstando
		daniel.addPessoa(daniel);
		daniel.listarPessoas();
	}
	
}