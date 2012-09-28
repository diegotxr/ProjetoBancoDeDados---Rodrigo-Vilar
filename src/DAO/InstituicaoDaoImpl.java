/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Util.HibernateUtil;
import entity.Instituicao;
import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Criteria;
import org.hibernate.Session;

/**
 *
 * @author diegotxr
 */
public class InstituicaoDaoImpl implements InstituicaoDAO {

    EntityManager em = HibernateUtil.getInstance().getFactory().createEntityManager();

    public void salvar(Instituicao instituicao) {
        em.getTransaction().begin();
        em.persist(instituicao);
        em.getTransaction().commit();

    }

    public void deletar(int id) {
        em.getTransaction().begin();
        Instituicao instituicao = em.find(Instituicao.class, id);
        System.out.println("\nEntidade deletada: " + instituicao.getNome());
        em.remove(instituicao);
        em.getTransaction().commit();

    }

    public List<Instituicao> listarTodos() {
        Session session = (Session) em.getDelegate();
        Criteria criteria;
        criteria = session.createCriteria(Instituicao.class);
        return criteria.list();

    }

    public Instituicao procurar(int id) {
        em.getTransaction().begin();
        Instituicao instituicao = em.find(Instituicao.class, id);
        System.out.println("Nome: " + instituicao.getNome());
        em.getTransaction().commit();

        return instituicao;
    }
    // find só retorn se for chave primaria
}
