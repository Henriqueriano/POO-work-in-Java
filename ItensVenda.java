public class Vendas
{
    private int idPedido;
    private int quantidade;
    private float valor;
	// private ItensVenda itens;
    
    public Produto(int idPedido, int quantidade, float valor)
    {
        this.private int idPedido	= "Não informado na compra";
        this.private int quantidade = "Não informado na compra";
        this.private float valor 	= "Não informado na compra";
    }   
    
    //GET'S
	public String 	getIdPedido() 		{ return idPedido;		}
	public int 	getQuantidade() 		{ return quantidade;	}
    public int 	getValor() 		        { return valor;		}

    
	//SET'S
	public void 	setIdPedido(int idPedido) 		    { this.idPedido	= idPedido;}
	public void 	setQuantidade(int quantidade) 	    { this.quantidade = quantidade;}
	public void 	setValor(float valor) 			    { this.valor = valor;}
}