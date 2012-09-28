
import DAO.*;
import entity.*;
import java.util.List;
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
public class CursoTest {
            @Test

        public void testCrudEntidade(){

       CursoDaoImpl cursoDaoImpl= new CursoDaoImpl();
       assertTrue(cursoDaoImpl.listarTodos().size()==0);
       Curso curso= new Curso();
       curso.setNome("Ciências da Computação");
       cursoDaoImpl.salvar(curso);
       assertTrue(cursoDaoImpl.listarTodos().size()==1);
       assertTrue(cursoDaoImpl.listarTodos().contains(curso));
       Curso curso1 = cursoDaoImpl.procurar(curso.getId());
       curso.setNome("Sistemas de Informação");
       cursoDaoImpl.salvar(curso1);
       assertEquals(curso1,cursoDaoImpl.procurar(curso.getId()));
       cursoDaoImpl.deletar(curso.getId());
       assertTrue(cursoDaoImpl.listarTodos().size()==0);
    }
}
