
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
public class SalaTest {

        @Test

        public void testCrudEntidade(){

       SalaDaoImpl salaDaoImpl= new SalaDaoImpl();
       assertTrue(salaDaoImpl.listarTodos().size()==0);
       Sala sala= new Sala();
       sala.setCodigo(10);
       salaDaoImpl.salvar(sala);
       assertTrue(salaDaoImpl.listarTodos().size()==1);
       assertTrue(salaDaoImpl.listarTodos().contains(sala));
       Sala sala1 = salaDaoImpl.procurar(sala.getCodigo());
       sala1.setCapacidade(50);
       salaDaoImpl.salvar(sala1);
       assertEquals(sala1,salaDaoImpl.procurar(sala.getCodigo()));
       salaDaoImpl.deletar(sala.getCodigo());
       assertTrue(salaDaoImpl.listarTodos().size()==0);
    }
}
