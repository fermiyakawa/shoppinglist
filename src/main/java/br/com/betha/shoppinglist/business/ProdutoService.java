package br.com.betha.shoppinglist.business;

import java.util.List;

import javax.inject.Named;

import br.com.betha.shoppinglist.model.Produto;

@Named
public class ProdutoService extends BaseService{
	
		
	@SuppressWarnings("unchecked")
	public List<Produto> retorneTodosProdutos(){
		return entityManager.createNamedQuery(Produto.FIND_ALL_ORDERBY_NOME).getResultList();
	}

}
