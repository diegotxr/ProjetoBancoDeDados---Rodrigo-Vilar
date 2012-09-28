
import DAO.*;
import entity.*;
import org.junit.Test;
import static org.junit.Assert.*;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diegotxr
 */
public class ProfessorTest {
        @Test

        public void testCrudEntidade(){

       ProfessorDaoImpl ProfessorDaoImpl= new ProfessorDaoImpl();
       assertTrue(ProfessorDaoImpl.listarTodos().size()==0);
       Professor professor= new Professor();
       professor.setNome("Brunno");
       ProfessorDaoImpl.salvar(professor);
       assertTrue(ProfessorDaoImpl.listarTodos().size()==1);
       assertTrue(ProfessorDaoImpl.listarTodos().contains(professor));
       Professor professor1 = ProfessorDaoImpl.procurar(professor.getMatricula());
       professor.setNome("Rodrigo Vilar");
       ProfessorDaoImpl.salvar(professor1);
       assertEquals(professor1,ProfessorDaoImpl.procurar(professor.getMatricula()));
       ProfessorDaoImpl.deletar(professor.getMatricula());
       assertTrue(ProfessorDaoImpl.listarTodos().size()==0);
    }
}
