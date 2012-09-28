/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Util.HibernateUtil;
import entity.Sala;
import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Criteria;
import org.hibernate.Session;
/**
 *
 * @author GilmarJr
 */
public class SalaDaoImpl implements SalaDAO{

    EntityManager em;

    public SalaDaoImpl(){
        em = HibernateUtil.getInstance().getFactory().createEntityManager();
    }

    public void salvar(Sala sala) {
        em.getTransaction().begin();
        em.persist(sala);
        em.getTransaction().commit();

    }

    public void deletar(int codigo) {
        em.getTransaction().begin();
        Sala sala = em.find(Sala.class, codigo);
        System.out.println("\nEntidade deletada: " + sala.getCodigo());
        em.remove(sala);
        em.getTransaction().commit();
        //em.close();
    }

    public List<Sala> listarTodos() {
        Session session = (Session) em.getDelegate();
        Criteria criteria;
        criteria = session.createCriteria(Sala.class);
        return criteria.list();
    }

    public Sala procurar(int codigo) {
        em.getTransaction().begin();
        Sala sala = em.find(Sala.class, codigo);
        System.out.println("Codigo: " + sala.getCodigo()
                            +"\nCapacidade: "+ sala.getCapacidade()
                            +"\nCódigo da turma: "+ sala.getId_turma());
        em.getTransaction().commit();
        //em.close();
        return sala;
    }
    // find s‚àö‚â• retorn se for chave primaria
}

