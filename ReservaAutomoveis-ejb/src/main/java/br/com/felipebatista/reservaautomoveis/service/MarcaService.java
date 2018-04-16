package br.com.felipebatista.reservaautomoveis.service;

import br.com.felipebatista.reservaautomoveis.model.Marca;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@Stateless
public class MarcaService {
    
    @Inject
    private EntityManager em;

     @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void add(Marca marca) {
        em.persist(marca);
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void update(Marca marca) {
        em.merge(marca);
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void remove(Long id) {
        Marca marca = em.getReference(Marca.class, id);
        em.remove(marca);
    }
    
    
}
