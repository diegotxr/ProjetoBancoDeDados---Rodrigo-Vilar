/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

   import Util.HibernateUtil;
import entity.Curso;
import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Criteria;
import org.hibernate.Session;
/**
 *
 * @author GilmarJr
 */
public class CursoDaoImpl implements CursoDAO {
        EntityManager em;

    public CursoDaoImpl(){
        em = HibernateUtil.getInstance().getFactory().createEntityManager();
    }

    public void salvar(Curso curso) {
        em.getTransaction().begin();
        em.persist(curso);
        em.getTransaction().commit();

    }

    public void deletar(int id) {
        em.getTransaction().begin();
        Curso curso = em.find(Curso.class, id);
        System.out.println("\nEntidade deletada: " + curso.getNome());
        em.remove(curso);
        em.getTransaction().commit();
        //em.close();
    }

    public List<Curso> listarTodos() {
        Session session = (Session) em.getDelegate();
        Criteria criteria;
        criteria = session.createCriteria(Curso.class);
        return criteria.list();
    }

    public Curso procurar(int id) {
        em.getTransaction().begin();
        Curso curso = em.find(Curso.class, id);
        System.out.println("Nome: "+ curso.getNome()
                            +"\nId" + curso.getId()
                            +"\nId do Departamento: " + curso.getId_departamento());
        em.getTransaction().commit();
        //em.close();
        return curso;
    }
    // find s‚àö‚â• retorn se for chave primaria

     
}
