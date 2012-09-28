
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
public class AlunoTurmaTest {
     @Test

        public void testCrudEntidade(){

       AlunoTurmaDaoImpl alunoTurmaDaoImpl= new AlunoTurmaDaoImpl();
       assertTrue(alunoTurmaDaoImpl.listarTodos().size()==0);
       AlunoTurma alunoTurma = new AlunoTurma();
       alunoTurma.setId_turma(4);
       alunoTurmaDaoImpl.salvar(alunoTurma);
       assertTrue(alunoTurmaDaoImpl.listarTodos().size()==1);
       assertTrue(alunoTurmaDaoImpl.listarTodos().contains(alunoTurma));
       AlunoTurma alunoTurma1 = alunoTurmaDaoImpl.procurar(alunoTurma.getMatricula());
       alunoTurma1.setId_turma(3);
       alunoTurmaDaoImpl.salvar(alunoTurma1);
       assertEquals(alunoTurma1,alunoTurmaDaoImpl.procurar(alunoTurma.getMatricula()));
       alunoTurmaDaoImpl.deletar(alunoTurma1.getMatricula());
       assertTrue(alunoTurmaDaoImpl.listarTodos().size()==0);
    }    
}
