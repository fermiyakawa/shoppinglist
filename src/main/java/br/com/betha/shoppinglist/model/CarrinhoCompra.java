package br.com.betha.shoppinglist.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@SequenceGenerator(name = "carrinhocompra_id_seq", sequenceName = "carrinhocompra_id_seq", initialValue = 1, allocationSize = 1)
public class CarrinhoCompra extends BaseEntity{
		
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "carrinhocompra_id_seq") 
	private Long id; 
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCriacao;
	
	private transient Double total = 0D;
	
	@JsonIgnore
	@OneToMany(mappedBy="carrinhoCompra", cascade = { CascadeType.REMOVE })	
	private List<ItemCarrinhoCompra> itensCarrinhoCompra;
	
	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
	
	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public List<ItemCarrinhoCompra> getItensCarrinhoCompra() {
		return itensCarrinhoCompra;
	}

	public void setItensCarrinhoCompra(List<ItemCarrinhoCompra> itensCarrinhoCompra) {
		this.itensCarrinhoCompra = itensCarrinhoCompra;
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
