package br.com.betha.shoppinglist.business;

import java.util.Date;

import javax.inject.Named;

import br.com.betha.shoppinglist.model.CarrinhoCompra;

@Named
public class CarrinhoCompraService extends BaseService{
	
	public CarrinhoCompra salvarCarrinhoCompra(){
		return salvarCarrinhoCompra(new CarrinhoCompra());
	}
	
	public CarrinhoCompra salvarCarrinhoCompra(CarrinhoCompra carrinho){	
		carrinho.setDataCriacao(new Date());
		entityManager.persist(carrinho);
		return carrinho;
	}
	
	public void excluirCarrinhoCompra(Long idCarrinhoCompra){
		CarrinhoCompra carrinhoCompra = entityManager.find(CarrinhoCompra.class, idCarrinhoCompra);
		carrinhoCompra.getItensCarrinhoCompra();
		excluirCarrinhoCompra(carrinhoCompra);
	}
	
	public void excluirCarrinhoCompra(CarrinhoCompra carrinhoCompra){
		entityManager.remove(carrinhoCompra);
	}
}
