
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
public class AlunoTest {
     @Test

        public void testCrudEntidade(){

       AlunoDaoImpl alunoDaoImpl= new AlunoDaoImpl();
       assertTrue(alunoDaoImpl.listarTodos().size()==0);
       Aluno aluno= new Aluno();
       aluno.setNome("Diego");
       alunoDaoImpl.salvar(aluno);
       assertTrue(alunoDaoImpl.listarTodos().size()==1);
       assertTrue(alunoDaoImpl.listarTodos().contains(aluno));
       Aluno aluno1 = alunoDaoImpl.procurar(aluno.getMatricula());
       aluno1.setNome("Gilmar");
       alunoDaoImpl.salvar(aluno1);
       assertEquals(aluno1,alunoDaoImpl.procurar(aluno.getMatricula()));
       alunoDaoImpl.deletar(aluno1.getMatricula());
       assertTrue(alunoDaoImpl.listarTodos().size()==0);
    }    
}
