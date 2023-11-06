public class Produto
{
    private int idProduto;
    private String nome;
    private String categoria;
    private String marca;
    private String modelo;
    private float preco;
    private int estoque;
    
    public Produto(int idProduto, String nome, String categoria, String marca, String modelo, float preco, int estoque)
    {
        this.private int idProduto  	= 0;
        this.private String nome 		= "Não declarado!";
        this.private String categoria 	= "Não declarado!";
        this.private String marca 		= "Não declarado!";
        this.private String modelo 		= "Não declarado!";
        this.private float preco 		= 999;
        this.private int estoque 		= 0;
    }   
    
    //GET'S
	public int 		getIdProduto() 	{ return idProduto;	 }
	public String 	getNome() 		{ return nome;	 	 }
	public String 	getCategoria() 	{ return categoria;	 }
	public String 	getMarca() 		{ return marca;	 	 }
	public String 	getModelo() 	{ return modelo;	 }
	public float 	getPreco() 		{ return preco;	 	 }
	public int 		getEstoque() 	{ return estoque;	 }
	
	//SET'S
	public void    setIdProduto(int idProduto) { this.idProduto = idProduto; }
	public void 		  setNome(String nome) { this.nome = nome;			 }
	public void setCategoria(String categoria) { this.categoria = categoria; }
	public void 		setMarca(String marca) { this.marca = marca;		 }
	public void 	  setModelo(String modelo) { this.modelo = modelo;		 }
	public void 		 setPreco(float preco) { this.preco = preco;		 }
	public void 	   setEstoque(int estoque) { this.estoque = estoque;	 }
	
    
}