package br.com.felipebatista.reservaautomoveis.repository;

import br.com.felipebatista.reservaautomoveis.model.Marca;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

@RequestScoped
public class MarcaRepository {

    @Inject
    private EntityManager em;

    public List<Marca> findAll() {
        return em.createQuery("select m from marca m order by m.id asc", Marca.class).getResultList();
    }

    public Marca findById(Long id) {
        return em.find(Marca.class, id);
    }

    public Marca findByName(String name) {        
        String consulta = "select m from marca m where m.marca = :marca order by m.id asc";
        TypedQuery<Marca> query = em.createQuery(consulta, Marca.class);
        
        try {
            Marca marca = query.setParameter("marca", name).getSingleResult();
            return marca;
        }catch(NoResultException nr) {
            return null;
        }
    }
    

}
