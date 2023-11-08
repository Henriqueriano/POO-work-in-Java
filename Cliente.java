public class Cliente
{
    private String login;
    private String senha;
    private String contato;
    
    public Cliente(String login, String senha, String contato)
    {
        this.login   = "Não declarado!";
        this.senha   = "Não declarado!";
        this.contato = "Não declarado!";
    }   
    
    //GET'S
    public String 	getLogin() 	{ return login;	 }
	public String 	getSenha() 	{ return senha;	 }
	public String getContato() 	{ return contato;}
	
	//SET'S
	public void 	setLogin(String login) { this.login = login; 	 }
	public void 	setSenha(String senha) { this.senha = senha; 	 }
	public void setContato(String contato) { this.contato = contato; }
}