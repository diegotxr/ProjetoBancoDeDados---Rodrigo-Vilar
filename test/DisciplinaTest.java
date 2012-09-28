
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
public class DisciplinaTest {

    @Test
    public void testCrudEntidade() {

        DisciplinaDaoImpl disciplinaDaoImpl = new DisciplinaDaoImpl();
        assertTrue(disciplinaDaoImpl.listarTodos().size() == 0);
        Disciplina disciplina = new Disciplina("Banco de Dados", 3);
        disciplinaDaoImpl.salvar(disciplina);
        assertTrue(disciplinaDaoImpl.listarTodos().size() == 1);
        assertTrue(disciplinaDaoImpl.listarTodos().contains(disciplina));
        Disciplina disciplina1 = disciplinaDaoImpl.procurar(disciplina.getId());
        disciplina1.setNome("Bancode dados II");
        disciplinaDaoImpl.salvar(disciplina1);
        assertEquals(disciplina1, disciplinaDaoImpl.procurar(disciplina.getId()));
        disciplinaDaoImpl.deletar(disciplina1.getId());
        assertTrue(disciplinaDaoImpl.listarTodos().size() == 0);
    }
}
