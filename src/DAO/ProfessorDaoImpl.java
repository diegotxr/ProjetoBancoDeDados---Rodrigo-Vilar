/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Util.HibernateUtil;
import entity.Professor;
import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Criteria;
import org.hibernate.Session;
/**
 *
 * @author GilmarJr
 */
public class ProfessorDaoImpl implements ProfessorDAO{
    
    

    EntityManager em;

    public ProfessorDaoImpl(){
        em = HibernateUtil.getInstance().getFactory().createEntityManager();
    }

    public void salvar(Professor professor) {
        em.getTransaction().begin();
        em.persist(professor);
        em.getTransaction().commit();

    }

    public void deletar(int matricula) {
        em.getTransaction().begin();
        Professor professor = em.find(Professor.class, matricula);
        System.out.println("\nEntidade deletada: " + professor.getNome());
        em.remove(professor);
        em.getTransaction().commit();
        //em.close();
    }

    public List<Professor> listarTodos() {
        Session session = (Session) em.getDelegate();
        Criteria criteria;
        criteria = session.createCriteria(Professor.class);
        return criteria.list();
    }

    public Professor procurar(int matricula) {
        em.getTransaction().begin();
        Professor professor = em.find(Professor.class, matricula);
        System.out.println("Nome: " + professor.getNome()
                            +"\nMatricula: "+ professor.getMatricula()
                            +"\nTitulo: "+ professor.getTitulo()
                            +"\nCódigo do departamento: "+ professor.getId_Departamento());
        em.getTransaction().commit();
        //em.close();
        return professor;
    }
    // find s‚àö‚â• retorn se for chave primaria

}
