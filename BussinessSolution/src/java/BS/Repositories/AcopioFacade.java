/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BS.Repositories;

import BS.Data.Acopio;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Cesar Rojas
 */
@Stateless
public class AcopioFacade extends AbstractFacade<Acopio> {

    @PersistenceContext(unitName = "BussinessSolutionPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AcopioFacade() {
        super(Acopio.class);
    }
    
}
