import java.util.ArrayList;
public class Pessoa
{                         
	// Atributos
	protected String sexo;
    protected String cep;
	protected String documento;
    protected String nome;
    protected String dataNascimento;
    protected String endereco;
    protected String telefone;
	protected   ArrayList<Pessoa> pessoas = new ArrayList<>();
    
    public Pessoa(String documento, String nome, String sexo, String dataNascimento, String cep, String endereco, String telefone)
    {
		this.sexo 		= sexo;
		this.cep 		   = cep;
        this.documento 	   = documento;
        this.nome 		   = nome;
        this.dataNascimento = dataNascimento;
        this.endereco 	   = endereco;
        this.telefone 	   = telefone;
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
    
	// METHODS
	public void addPessoa(Pessoa pessoa) { pessoas.add(pessoa); }
	public void listarPessoas() 
	{ 
	int i = 0;
	System.out.println("Pessoas Cadastradas no Sistema:");
	for(Pessoa pessoa: pessoas) {
		i++;
		System.out.printf("+-=--++--=---+=+---+--+--=--=+---+\nNome: %s\nCep: %s\nDocumento; %s\nSexo: %s\nData de nascimento: %s\nEndereço: %s\nTelefone: %s\n+-=--++--=---+=+---+--+--=--=+---+\n",pessoa.nome,pessoa.cep,pessoa.documento,pessoa.sexo,pessoa.dataNascimento,pessoa.endereco,pessoa.telefone);
		
	} 
	System.out.printf("Total de pessoas cadastradas no sistema: %d", i);
	}
}