import java.util.ArrayList;
public class Funcionario extends Pessoa
{
    private int id;
    private String departamento;
    private String dataAdmissao;
    private String cargo;
	private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    
    public Funcionario(int id, String departamento, String dataAdmissao, String cargo, String documento, String nome, String sexo, String dataNascimento, String cep, String endereco, String telefone)
    {
        super(sexo, cep, documento, nome, dataNascimento, endereco, telefone);
        this.id 			 = 0;
        this.departamento = "Não declarado!";
        this.dataAdmissao = "Não declarado!";
        this.cargo        = "Não declarado!";
    }   
    
    //GET'S
	public int 				getId() { return id;		   }
	public String 		 getCargo() { return cargo;		   }
	public String getDepartamento() { return departamento; }
	public String getDataAdmissao() { return dataAdmissao; }
	
	//SET'S
    public void 		  setId(int id) 			 { this.id = id;				 	 }
	public void 	   setCargo(String cargo) 		 { this.cargo = cargo; 				 }
	public void setDepartamento(String departamento) { this.departamento = departamento; }
	public void setDataAdmissao(String dataAdmissao) { this.dataAdmissao = dataAdmissao; }

	// METHODS
	public void addFuncionario(Funcionario funcionario) { funcionarios.add(funcionario); }
	public void listarFuncionarios() 
	{ 
	int i = 0;
	System.out.println("Funcionarios Cadastrados no Sistema:");
	for(Funcionario funcionario : funcionarios) {
		i++;
		System.out.printf("+-=--++--=---+=+---+--+--=--=+---+\nNome: %s\nCep: %s\nDocumento; %s\nSexo: %s\nData de nascimento: %s\nEndereço: %s\nTelefone: %s\nId: %s\nDepartamento: %s\nData de admissão: : %s\nCargo: %s\n+-=--++--=---+=+---+--+--=--=+---+\n",pessoa.nome,pessoa.cep,pessoa.documento,pessoa.sexo,pessoa.dataNascimento,pessoa.endereco,pessoa.telefone, funcionario.id, funcionario.departamento, funcionario.dataAdmissao, funcionario.cargo);
		
	} 
	System.out.printf("Total de funcionarios cadastrados no sistema: %d", i);
	}
}