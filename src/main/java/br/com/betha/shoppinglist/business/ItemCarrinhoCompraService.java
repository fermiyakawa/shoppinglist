package br.com.betha.shoppinglist.business;

import javax.inject.Named;

import br.com.betha.shoppinglist.model.CarrinhoCompra;
import br.com.betha.shoppinglist.model.ItemCarrinhoCompra;
import br.com.betha.shoppinglist.model.Produto;

@Named
public class ItemCarrinhoCompraService extends BaseService{
	
		
	public ItemCarrinhoCompra adicionarItemCarrinho(ItemCarrinhoCompra item){
		
		atualizarItemCarrinho(item);
		entityManager.persist(item);
		return item;
	}
	
	public void alterarItemCarrinho(ItemCarrinhoCompra item){	
		atualizarItemCarrinho(item);
		entityManager.merge(item);		
	}
	
	public void excluirItemCarrinho(Long idItemCarrinhoCompra){
		ItemCarrinhoCompra item =  entityManager.find(ItemCarrinhoCompra.class, idItemCarrinhoCompra);
		excluirItemCarrinho(item);
	}
	
	public void excluirItemCarrinho(ItemCarrinhoCompra item){		
		entityManager.remove(item);		
	}
	
	public void atualizarItemCarrinho(ItemCarrinhoCompra item){
		CarrinhoCompra carrinhoCompra = entityManager.find(CarrinhoCompra.class, item.getCarrinhoCompra().getId());
		Produto produto =  entityManager.find(Produto.class, item.getProduto().getId());
		item.setCarrinhoCompra(carrinhoCompra);
		item.setProduto(produto);
	}
	

}
