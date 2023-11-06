public class Vendas
{
    private String codVenda;
    private int numero;
    private float valor;
    private int desconto;
    private String formaPagamento;
	// private Produto produto;
	// TODO: criar um método para finalizar venda aqui dentro?
    
    public Produto(String codVenda, int numero, float valor, int desconto, String formaPagamento)
    {
        this.private String codVenda 		= 0;
        this.private int numero 			= 0;
        this.private float valor 			= 0;
        this.private String desconto 		= 0;
        this.private String formaPagamento  = 0;
    }   
    
    //GET'S
	public String 	getCodVenda() 			{ return codVenda;	}
	public int 		getNumero() 			{ return numero;	}
	public float 	getValor() 				{ return valor;	}
	public float 	getDesconto() 			{ return (desconto * 100);	}
	public String 	getFormaDePagamento() 	{ return formaPagamento;	}
    
	//SET'S
	public void 	setCodVenda(String codVenda) 				{ this.codVenda = codVenda; 	 	 	 }
	public void 	setNumero(int numero) 						{ this.numero = numero; 	 			 }
	public void 	setValor(float valor) 						{ this.login = login; 	 				 }
	public void 	setDesconto(int desconto) 					{ this.desconto = (desconto / 100); 	 }
	public void 	setFormaDePagamento(String formaPagamento)  { this.formaPagamento = formaPagamento;  }
}