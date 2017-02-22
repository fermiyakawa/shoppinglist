package br.com.betha.shoppinglist.rest;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.betha.shoppinglist.business.ItemCarrinhoCompraService;
import br.com.betha.shoppinglist.model.ItemCarrinhoCompra;

@Path("/itemCarrinhoCompra")
public class ItemCarrinhoCompraResource {

	@Inject
	private ItemCarrinhoCompraService itemCarrinhoCompraService;

	@POST
	@Transactional
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ItemCarrinhoCompra adicionarItemCarrinhoCompra(ItemCarrinhoCompra itemCarrinhoCompra) {
		return itemCarrinhoCompraService.adicionarItemCarrinho(itemCarrinhoCompra);
	}

	@PUT
	@Transactional
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Response alterarItemCarrinhoCompra(@PathParam("id") Long idItemCarrinhoCompra,
			ItemCarrinhoCompra itemCarrinhoCompra) {
		itemCarrinhoCompraService.alterarItemCarrinho(itemCarrinhoCompra);
		return Response.noContent().build();
	}

	@DELETE
	@Transactional
	@Path("/{id}")
	public Response excluirItemCarrinhoCompra(@PathParam("id") Long idItemCarrinhoCompra) {
		itemCarrinhoCompraService.excluirItemCarrinho(idItemCarrinhoCompra);
		return Response.noContent().build();
	}
}
