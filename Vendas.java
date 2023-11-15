public class Vendas
{
    private int codVenda;
    private int numero;
    private float valor;
    private int desconto;
    private String formaPagamento;
	// private Produto produto;
	// TODO: criar um método para finalizar venda aqui dentro?
    
    public Vendas(String codVenda, int numero, float valor, int desconto, String formaPagamento)
    {
        this.codVenda 			= 0;
        this.numero 			= 0;
        this.valor 			= 0;
        this.desconto 			= 0;
        this.formaPagamento  		= "Não Declarado";
    }   
    
    //GET'S
	public int 	getCodVenda() 			{ return codVenda;		}
	public int 	getNumero() 			{ return numero;		}
	public float 	getValor() 			{ return valor;			}
	public float 	getDesconto() 			{ return (desconto * 100);	}
	public String 	getFormaDePagamento() 		{ return formaPagamento;	}
    
	//SET'S
	public void 	setCodVenda(int codVenda) 		    { this.codVenda = codVenda; 	     }
	public void 	setNumero(int numero) 			    { this.numero = numero; 	 	     }
	public void 	setValor(float valor) 			    { this.valor = valor; 	             }
	public void 	setDesconto(int desconto) 		    { this.desconto = (desconto / 100);      }
	public void 	setFormaDePagamento(String formaPagamento)  { this.formaPagamento = formaPagamento;  }
}
