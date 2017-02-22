package br.com.betha.shoppinglist.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "produto_id_seq", sequenceName = "produto_id_seq", initialValue = 1, allocationSize = 1)
@NamedQueries({
	@NamedQuery(name=Produto.FIND_ALL_ORDERBY_NOME, query="SELECT p FROM Produto p ORDER BY p.nome ASC")          
})
public class Produto extends BaseEntity{
	
	private static final long serialVersionUID = 1L;
	
	public static final String FIND_ALL_ORDERBY_NOME = "Produto.FIND_ALL_ORDERBY_NOME";

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto_id_seq") 
	private Long id; 
	
	private String nome;
	
	private Double preco;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
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
