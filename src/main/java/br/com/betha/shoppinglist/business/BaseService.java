package br.com.betha.shoppinglist.business;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

public abstract class BaseService {
	
	@PersistenceContext(unitName="shoppinglist", type=PersistenceContextType.TRANSACTION)
	protected EntityManager entityManager;

}
