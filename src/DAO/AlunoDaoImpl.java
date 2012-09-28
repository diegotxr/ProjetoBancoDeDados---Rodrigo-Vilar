/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Util.HibernateUtil;
import entity.Aluno;
import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Criteria;
import org.hibernate.Session;

/**
 *
 * @author diegotxr
 */
public class AlunoDaoImpl implements AlunoDAO {

    EntityManager em;

    public AlunoDaoImpl(){
        em = HibernateUtil.getInstance().getFactory().createEntityManager();
    }

    public void salvar(Aluno aluno) {
        em.getTransaction().begin();
        em.persist(aluno);
        em.getTransaction().commit();

    }

    public void deletar(int matricula) {
        em.getTransaction().begin();
        Aluno aluno = em.find(Aluno.class, matricula);
        System.out.println("\nEntidade deletada: " + aluno.getNome());
        em.remove(aluno);
        em.getTransaction().commit();
        //em.close();
    }

    public List<Aluno> listarTodos() {
        Session session = (Session) em.getDelegate();
        Criteria criteria;
        criteria = session.createCriteria(Aluno.class);
        return criteria.list();
    }

    public Aluno procurar(int matricula) {
        em.getTransaction().begin();
        Aluno aluno = em.find(Aluno.class, matricula);
        System.out.println("Nome: " + aluno.getNome() 
        + "\nId Curso: " + aluno.getId_curso() + "\nMatricula: " + aluno.getMatricula());
        em.getTransaction().commit();
        //em.close();
        return aluno;
    }
    // find s√≥ retorn se for chave primaria



}
