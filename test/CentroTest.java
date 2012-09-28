
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
public class CentroTest {
 
        @Test

        public void testCrudEntidade(){

       CentroDaoImpl centroDaoImpl= new CentroDaoImpl();
       assertTrue(centroDaoImpl.listarTodos().size()==0);
       Centro centro= new Centro();
       centro.setNome("CCAE");
       centroDaoImpl.salvar(centro);
       assertTrue(centroDaoImpl.listarTodos().size()==1);
       assertTrue(centroDaoImpl.listarTodos().contains(centro));
       Centro centro1 = centroDaoImpl.procurar(centro.getId());
       centro.setNome("CCSA");
       centroDaoImpl.salvar(centro1);
       assertEquals(centro1,centroDaoImpl.procurar(centro.getId()));
       centroDaoImpl.deletar(centro.getId());
       assertTrue(centroDaoImpl.listarTodos().size()==0);
    }
}
