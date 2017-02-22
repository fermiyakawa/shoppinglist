package br.com.betha.shoppinglist.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "itemcarrinhocompra_id_seq", sequenceName = "itemcarrinhocompra_id_seq", initialValue = 1, allocationSize = 1)
public class ItemCarrinhoCompra extends BaseEntity{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "itemcarrinhocompra_id_seq") 
	private Long id; 
	
	private Double quantidade;
	
	private transient Double total = 0D;
		
	@ManyToOne
	private Produto produto;
	
	@ManyToOne
	private CarrinhoCompra carrinhoCompra;
		
	
	public ItemCarrinhoCompra() {		
	}

	public ItemCarrinhoCompra(Double quantidade, Produto produto, CarrinhoCompra carrinhoCompra) {		
		this.quantidade = quantidade;
		this.produto = produto;
		this.carrinhoCompra = carrinhoCompra;
	}

	public ItemCarrinhoCompra(Long id, Double quantidade, Produto produto, CarrinhoCompra carrinhoCompra) {		
		this.id = id;
		this.quantidade = quantidade;
		this.produto = produto;
		this.carrinhoCompra = carrinhoCompra;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public CarrinhoCompra getCarrinhoCompra() {
		return carrinhoCompra;
	}

	public void setCarrinhoCompra(CarrinhoCompra carrinhoCompra) {
		this.carrinhoCompra = carrinhoCompra;
	}

	@Override
	public Long getId() {
		return this.id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;		
	}
	
}
