package br.com.betha.shoppinglist.rest;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.betha.shoppinglist.business.CarrinhoCompraService;
import br.com.betha.shoppinglist.model.CarrinhoCompra;

@Path("/carrinhoCompra")
public class CarrinhoCompraResource {
	
	@Inject
	private CarrinhoCompraService carrinhoCompraService;

	@POST	
	@Transactional
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)	
	public CarrinhoCompra salvarCarrinhoCompra(){		
		return carrinhoCompraService.salvarCarrinhoCompra();
	}
	
	@DELETE
	@Transactional
	@Path("/{id}")
	public void excluirCarrinhoCompra(@PathParam("id") Long idCarrinhoCompra){
		carrinhoCompraService.excluirCarrinhoCompra(idCarrinhoCompra);
	}

}
