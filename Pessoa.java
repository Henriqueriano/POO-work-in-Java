public class Pessoa
{
	private char sexo;
    private String cep;
	private String documento;
    private String nome;
    private String dataNascimento;
    private String endereco;
    private String telefone;
    
    public Pessoa(String documento, String nome, char sexo, String dataNascimento, String cep, String endereco, String telefone)
    {
		this.private char sexo 			   = "?";
		this.private String cep 		   = "Não declarado!";
        this.private String documento 	   = "Não declarado!";
        this.private String nome 		   = "Não declarado!";
        this.private String dataNascimento = "Não declarado!";
        this.private String endereco 	   = "Não declarado!";
        this.private String telefone 	   = "Não declarado!";
    }   
    
    //GET'S
	public char   getSexo() 		  { return sexo; 			}
	public String getCep() 		 	  { return cep; 			}
	public String getDocumento() 	  { return documento;		}
	public String getNome() 		  { return nome;			}
	public String getDataNascimento() { return dataNascimento;	}
	public String getEndereco() 	  { return endereco;		}
	public String getTelefone() 	  { return telefone;		}
	
	
	//SET'S
	public void setSexo (char sexo) 					 { this.sexo = sexo; 					 }
	public void setCep(String cep) 						 { this.cep = cep; 						 }
	public void setDocumento(String documento) 			 { this.documento = documento; 			 }
	public void setNome(String nome) 					 { this.nome = nome; 					 }
	public void setDataNascimento(String dataNascimento) { this.dataNascimento = dataNascimento; }
	public void setEndereco(String endereco) 			 { this.endereco = endereco; 			 }
	public void setTelefone(String telefone) 			 { this.telefone = telefone; 			 }
    
}