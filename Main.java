class Funcionario extends Pessoa
{
    private int id;
    private String departamento;
    private String dataAdmissao;
    private String cargo;
    
    public Funcionario()
    {
		//super(Pessoa.sexo, Pessoa.cep, Pessoa.documento, Pessoa.nome, Pessoa.dataNascimento, Pessoa.endereco, Pessoa.telefone);
        //super(sexo, cep, documento, nome, dataNascimento, endereco, telefone);
		super("Não declarado!","Não declarado!","Não declarado!","Não declarado!","Não declarado!","Não declarado!","Não declarado!");
		//super(Pessoa.getSexo(),Pessoa.getCep(),Pessoa.getDocumento() ,Pessoa.getNome() ,Pessoa.getDataNascimento() ,Pessoa.getEndereco() ,Pessoa.getTelefone());
        //super(p.getSexo(),p.getCep(),p.getDocumento() ,p.getNome() ,p.getDataNascimento() ,p.getEndereco() ,p.getTelefone());
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
}

public class Main {
	public static void main(String[] args) 
	{
		Pessoa p = new Pessoa("0","0","0","0","0","0","0");
		Funcionario f = new Funcionario();
		f.setNome("Rogerio");
		System.out.print(f.getNome());
		
	}
	
}