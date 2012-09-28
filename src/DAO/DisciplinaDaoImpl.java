/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Util.HibernateUtil;
import entity.Disciplina;
import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Criteria;
import org.hibernate.Session;
/**
 *
 * @author GilmarJr
 */
public class DisciplinaDaoImpl implements DisciplinaDAO {

    EntityManager em;

    public DisciplinaDaoImpl() {
        em = HibernateUtil.getInstance().getFactory().createEntityManager();
    }

    public void salvar(Disciplina disciplina) {
        em.getTransaction().begin();
        em.persist(disciplina);
        em.getTransaction().commit();

    }

    public void deletar(int id) {
        em.getTransaction().begin();
        Disciplina disciplina = em.find(Disciplina.class, id);
        System.out.println("\nEntidade deletada: " + disciplina.getNome());
        em.remove(disciplina);
        em.getTransaction().commit();
        //em.close();
    }

    public List<Disciplina> listarTodos() {
        Session session = (Session) em.getDelegate();
        Criteria criteria;
        criteria = session.createCriteria(Disciplina.class);
        return criteria.list();
    }

    public Disciplina procurar(int id) {
        em.getTransaction().begin();
        Disciplina disciplina = em.find(Disciplina.class, id);
        System.out.println("Nome: " + disciplina.getNome()
                            +"\nId: "+ disciplina.getId()
                            +"\nCódigo do curso: "+ disciplina.getId_Curso());
        em.getTransaction().commit();
       // em.close();
        return disciplina;
    }
    // find s‚àö‚â• retorn se for chave primaria

    
}
