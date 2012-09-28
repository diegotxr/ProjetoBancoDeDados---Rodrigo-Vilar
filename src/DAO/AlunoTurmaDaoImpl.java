/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

    import Util.HibernateUtil;
import entity.AlunoTurma;
import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Criteria;
import org.hibernate.Session;
/**
 *
 * @author GilmarJr
 */
public class AlunoTurmaDaoImpl implements AlunoTurmaDAO {
    


    EntityManager em;

    public AlunoTurmaDaoImpl(){
        em = HibernateUtil.getInstance().getFactory().createEntityManager();
    }

    public void salvar(AlunoTurma aluno) {
        em.getTransaction().begin();
        em.persist(aluno);
        em.getTransaction().commit();

    }

    public void deletar(int matricula) {
        em.getTransaction().begin();
        AlunoTurma aluno = em.find(AlunoTurma.class, matricula);
        System.out.println("\nEntidade deletada: " + aluno.getMatricula());
        em.remove(aluno);
        em.getTransaction().commit();
        //em.close();
    }

    public List<AlunoTurma> listarTodos() {
        Session session = (Session) em.getDelegate();
        Criteria criteria;
        criteria = session.createCriteria(AlunoTurma.class);
        return criteria.list();
    }

    public AlunoTurma procurar(int matricula) {
        em.getTransaction().begin();
        AlunoTurma alunoturma = em.find(AlunoTurma.class, matricula);
        System.out.println("Matricula: " + alunoturma.getMatricula()
        + "\nId da turma: "+ alunoturma.getId_turma());
        em.getTransaction().commit();
        //em.close();
        return alunoturma;
    }
    // find s‚àö‚â• retorn se for chave primaria

}
