/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;
import Util.HibernateUtil;
import entity.Centro;
import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Criteria;
import org.hibernate.Session;
/**
 *
 * @author Aluno
 */
public class CentroDaoImpl implements CentroDAO{

    EntityManager em;

    public CentroDaoImpl(){
        em = HibernateUtil.getInstance().getFactory().createEntityManager();
    }

    public void salvar(Centro centro) {
        em.getTransaction().begin();
        em.persist(centro);
        em.getTransaction().commit();

    }

    public void deletar(int id) {
        em.getTransaction().begin();
        Centro centro = em.find(Centro.class, id);
        System.out.println("\nEntidade deletada: " + centro.getNome());
        em.remove(centro);
        em.getTransaction().commit();
        //em.close();
    }

    public List<Centro> listarTodos() {
        Session session = (Session) em.getDelegate();
        Criteria criteria;
        criteria = session.createCriteria(Centro.class);
        return criteria.list();
    }

    public Centro procurar(int id) {
        em.getTransaction().begin();
        Centro centro = em.find(Centro.class, id);
        System.out.println("Nome: "+ centro.getNome()
                            +"\nId: " + centro.getId()
                            +"\nId do Campus: " + centro.getId_campus());
        em.getTransaction().commit();
        //em.close();
        return centro;
    }
    // find s‚àö‚â• retorn se for chave primaria

}
