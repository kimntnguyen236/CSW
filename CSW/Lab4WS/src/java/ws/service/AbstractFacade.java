/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.service;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ws.model.TbEmployee;

/**
 *
 * @author lenovo
 */
public abstract class AbstractFacade<T> {
    

    private Class<T> entityClass;

    public AbstractFacade(Class<T> entityClass) {
        this.entityClass = entityClass;
    }
@PersistenceContext(unitName = "test")
private EntityManager em;
   // protected abstract EntityManager getEntityManager();

    public void create(T entity) {
       // getEntityManager().persist(entity);
       em.persist(entity);
    }
public void login(TbEmployee employee){
    em.createNamedQuery("TbEmployee.checklogin",TbEmployee.class).setParameter("employeecode", employee.getEmployeecode()).setParameter("password", employee.getPassword()).getSingleResult();
    
}
    public void edit(T entity) {
       // getEntityManager().merge(entity);
       em.merge(entity);
    }

    public void remove(T entity) {
        //getEntityManager().remove(getEntityManager().merge(entity));
        em.remove(entity);
    }

    public T find(Object id) {
     //   return getEntityManager().find(entityClass, id);
     return em.find(entityClass, id);
    }

    public List<T> findAll() {
        javax.persistence.criteria.CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return em.createQuery(cq).getResultList();
    }

    public List<T> findRange(int[] range) {
        javax.persistence.criteria.CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        javax.persistence.Query q = em.createQuery(cq);
        q.setMaxResults(range[1] - range[0] + 1);
        q.setFirstResult(range[0]);
        return q.getResultList();
    }

    public int count() {
        javax.persistence.criteria.CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        javax.persistence.criteria.Root<T> rt = cq.from(entityClass);
        cq.select(em.getCriteriaBuilder().count(rt));
        javax.persistence.Query q = em.createQuery(cq);
        return ((Long) q.getSingleResult()).intValue();
    }

    public void persist(Object object) {
        /* Add this to the deployment descriptor of this module (e.g. web.xml, ejb-jar.xml):
         * <persistence-context-ref>
         * <persistence-context-ref-name>persistence/LogicalName</persistence-context-ref-name>
         * <persistence-unit-name>test</persistence-unit-name>
         * </persistence-context-ref>
         * <resource-ref>
         * <res-ref-name>UserTransaction</res-ref-name>
         * <res-type>javax.transaction.UserTransaction</res-type>
         * <res-auth>Container</res-auth>
         * </resource-ref> */
        try {
//            Context ctx = new InitialContext();
//            UserTransaction utx = (UserTransaction) ctx.lookup("java:comp/env/UserTransaction");
//            utx.begin();
//            EntityManager em = (EntityManager) ctx.lookup("java:comp/env/persistence/LogicalName");
//            em.persist(object);
//            utx.commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            throw new RuntimeException(e);
        }
    }
    
}
