/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Util.HibernateUtil;
import entity.Campus;
import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Criteria;
import org.hibernate.Session;
/**
 *
 * @author GilmarJr
 */
public class CampusDaoImpl implements CampusDAO {
    
      EntityManager em;

    public CampusDaoImpl(){
        em = HibernateUtil.getInstance().getFactory().createEntityManager();
    }

    public void salvar(Campus campus) {
        em.getTransaction().begin();
        em.persist(campus);
        em.getTransaction().commit();

    }

    public void deletar(int id) {
        em.getTransaction().begin();
        Campus campus = em.find(Campus.class, id);
        System.out.println("\nEntidade deletada: " + campus.getNome());
        em.remove(campus);
        em.getTransaction().commit();
        //em.close();
    }

    public List<Campus> listarTodos() {
        Session session = (Session) em.getDelegate();
        Criteria criteria;
        criteria = session.createCriteria(Campus.class);
        return criteria.list();
    }

    public Campus procurar(int id) {
        em.getTransaction().begin();
        Campus campus = em.find(Campus.class, id);
        System.out.println("Nome: " + campus.getNome() 
        +"\nId: " + campus.getId() + "\nCódigo da instituição: " 
        + campus.getId_instituicao());
        em.getTransaction().commit();
        //em.close();
        return campus;
    }
    // find s‚àö‚â• retorn se for chave primaria


}
