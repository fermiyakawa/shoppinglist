package br.com.betha.shoppinglist.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.betha.shoppinglist.business.ProdutoService;
import br.com.betha.shoppinglist.model.Produto;

@Path("/produto")
public class ProdutoResource {
	
	@Inject
	private ProdutoService produtoService;
	
	@GET	
	@Produces(MediaType.APPLICATION_JSON)
	public List<Produto> retorneTodosProdutos(){
		return produtoService.retorneTodosProdutos();
	}

}
