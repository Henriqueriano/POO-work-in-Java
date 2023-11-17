public class Funcionario extends Pessoa
{
    private int id;
    private String departamento;
    private String dataAdmissao;
    private String cargo;
    
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
}