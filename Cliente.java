public class Cliente
{
    private String login;
    private String senha;
    private String contato;
    
    public Produto(String login, String senha, String contato)
    {
        this.private String login   = "Não declarado!";
        this.private String senha   = "Não declarado!";
        this.private String contato = "Não declarado!";
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