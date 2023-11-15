public class Pessoa
{
	protected String sexo;
    protected String cep;
	protected String documento;
    protected String nome;
    protected String dataNascimento;
    protected String endereco;
    protected String telefone;
    
    public Pessoa(String documento, String nome, String sexo, String dataNascimento, String cep, String endereco, String telefone)
    {
		this.sexo 		= "Não declarado!";
		this.cep 		   = "Não declarado!";
        this.documento 	   = "Não declarado!";
        this.nome 		   = "Não declarado!";
        this.dataNascimento = "Não declarado!";
        this.endereco 	   = "Não declarado!";
        this.telefone 	   = "Não declarado!";
    }   
    
    //GET'S
	public String   getSexo() 		  { return sexo; 			}
	public String getCep() 		 	  { return cep; 			}
	public String getDocumento() 	  { return documento;		}
	public String getNome() 		  { return nome;			}
	public String getDataNascimento() { return dataNascimento;	}
	public String getEndereco() 	  { return endereco;		}
	public String getTelefone() 	  { return telefone;		}
	
	
	//SET'S
	public void setSexo (String sexo) 					 { this.sexo = sexo; 					 }
	public void setCep(String cep) 						 { this.cep = cep; 						 }
	public void setDocumento(String documento) 			 { this.documento = documento; 			 }
	public void setNome(String nome) 					 { this.nome = nome; 					 }
	public void setDataNascimento(String dataNascimento) { this.dataNascimento = dataNascimento; }
	public void setEndereco(String endereco) 			 { this.endereco = endereco; 			 }
	public void setTelefone(String telefone) 			 { this.telefone = telefone; 			 }
    
}