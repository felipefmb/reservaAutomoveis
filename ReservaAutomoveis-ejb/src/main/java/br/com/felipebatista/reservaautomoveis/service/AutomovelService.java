package br.com.felipebatista.reservaautomoveis.service;

import br.com.felipebatista.reservaautomoveis.model.Automovel;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@Stateless
public class AutomovelService {
    
    @Inject    
    private EntityManager em;
    
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public Automovel add(Automovel automovel) {        
        em.persist(automovel);
        return automovel;
    }
    
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public Automovel update(Automovel automovel) {        
        em.merge(automovel);
        return automovel;
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void remove(Long id) {
       Automovel automovel = em.getReference(Automovel.class, id);
       em.remove(automovel);
    }
    
}
