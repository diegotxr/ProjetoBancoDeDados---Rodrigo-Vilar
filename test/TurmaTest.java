
import DAO.*;
import entity.*;
import static org.junit.Assert.*;
import org.junit.Test;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diegotxr
 */
public class TurmaTest {

        @Test

        public void testCrudEntidade(){

       TurmaDaoImpl turmaDaoImpl= new TurmaDaoImpl();
       assertTrue(turmaDaoImpl.listarTodos().size()==0);
       Turma turma = new Turma("P6", "Segunda 10-12|13-15", "Rodrigo Vilar", 32);  
       turmaDaoImpl.salvar(turma);
       assertTrue(turmaDaoImpl.listarTodos().size()==1);
       assertTrue(turmaDaoImpl.listarTodos().contains(turma));
       Turma turma1 = turmaDaoImpl.procurar(turma.getId());
       turma.setPeriodo("P5");
       turmaDaoImpl.salvar(turma1);
       assertEquals(turma1,turmaDaoImpl.procurar(turma.getId()));
       turmaDaoImpl.deletar(turma.getId());
       assertTrue(turmaDaoImpl.listarTodos().size()==0);
    }
}
