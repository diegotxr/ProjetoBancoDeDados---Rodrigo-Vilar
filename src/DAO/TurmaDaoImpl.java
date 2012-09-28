/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Util.HibernateUtil;
import entity.Turma;
import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Criteria;
import org.hibernate.Session;
/**
 *
 * @author GilmarJr
 */
public class TurmaDaoImpl implements TurmaDAO{
    
     EntityManager em;

    public TurmaDaoImpl(){
        em = HibernateUtil.getInstance().getFactory().createEntityManager();
    }

    public void salvar(Turma turma) {
        em.getTransaction().begin();
        em.persist(turma);
        em.getTransaction().commit();

    }

    public void deletar(int id) {
        em.getTransaction().begin();
        Turma turma = em.find(Turma.class, id);
        System.out.println("\nEntidade deletada: " + turma.getId());
        em.remove(turma);
        em.getTransaction().commit();
        //em.close();
    }

    public List<Turma> listarTodos() {
        Session session = (Session) em.getDelegate();
        Criteria criteria;
        criteria = session.createCriteria(Turma.class);
        return criteria.list();
    }

    public Turma procurar(int id) {
        em.getTransaction().begin();
        Turma turma = em.find(Turma.class, id);
        System.out.println("Id da turma: "+ turma.getId()
                            +"\nPeriodo:  " + turma.getPeriodo()
                            +"\nProfessor: "+ turma.getProfessor()
                            +"\nHorário: "+ turma.getHorario()
                            +"\nCódigo da disciplina: "+ turma.getId_Disciplina());
        em.getTransaction().commit();
        //em.close();
        return turma;
    }
    // find s‚àö‚â• retorn se for chave primaria

}
