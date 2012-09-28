/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

 import Util.HibernateUtil;
import entity.Departamento;
import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Criteria;
import org.hibernate.Session;
/**
 *
 * @author GilmarJr
 */
public class DepartamentoDaoImpl implements DepartamentoDAO {
 
        EntityManager em;

    public DepartamentoDaoImpl(){
        em = HibernateUtil.getInstance().getFactory().createEntityManager();
    }

    public void salvar(Departamento departamento) {
        em.getTransaction().begin();
        em.persist(departamento);
        em.getTransaction().commit();

    }

    public void deletar(int id) {
        em.getTransaction().begin();
        Departamento departamento = em.find(Departamento.class, id);
        System.out.println("\nEntidade deletada: " + departamento.getNome());
        em.remove(departamento);
        em.getTransaction().commit();
        //em.close();
    }

    public List<Departamento> listarTodos() {
        Session session = (Session) em.getDelegate();
        Criteria criteria;
        criteria = session.createCriteria(Departamento.class);
        return criteria.list();
    }

    public Departamento procurar(int id) {
        em.getTransaction().begin();
        Departamento departamento= em.find(Departamento.class, id);
        System.out.println("Nome: " + departamento.getNome()
                            +"\nSigla do Departamento: "+ departamento.getSigla()
                            +"\nCódigo do Centro: "+ departamento.getId_centro());
        em.getTransaction().commit();
        //em.close();
        return departamento;
    }
    // find s‚àö‚â• retorn se for chave primaria

}
