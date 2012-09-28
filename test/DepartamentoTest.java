
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
public class DepartamentoTest {

    @Test
    public void testCrudEntidade() {

        DepartamentoDaoImpl departamentoDaoImpl = new DepartamentoDaoImpl();
        assertTrue(departamentoDaoImpl.listarTodos().size() == 0);
        Departamento departamento = new Departamento("Departamento de Ciências Exatas", "DDE", 4);
        departamentoDaoImpl.salvar(departamento);
        assertTrue(departamentoDaoImpl.listarTodos().size() == 1);
        assertTrue(departamentoDaoImpl.listarTodos().contains(departamento));
        Departamento departamento1 = departamentoDaoImpl.procurar(departamento.getId());
        departamento1.setNome("DCE");
        departamentoDaoImpl.salvar(departamento1);
        assertEquals(departamento1, departamentoDaoImpl.procurar(departamento.getId()));
        departamentoDaoImpl.deletar(departamento1.getId());
        assertTrue(departamentoDaoImpl.listarTodos().size() == 0);
    }
}
