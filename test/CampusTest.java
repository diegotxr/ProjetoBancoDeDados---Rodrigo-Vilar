
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
public class CampusTest {

    @Test
    public void testCrudEntidade() {

        CampusDaoImpl campusDaoImpl = new CampusDaoImpl();
        assertTrue(campusDaoImpl.listarTodos().size() == 0);
        Campus campus = new Campus();
        campus.setNome("IV");
        campusDaoImpl.salvar(campus);
        assertTrue(campusDaoImpl.listarTodos().size() == 1);
        assertTrue(campusDaoImpl.listarTodos().contains(campus));
        Campus campus1 = campusDaoImpl.procurar(campus.getId());
        campus1.setNome("V");
        campusDaoImpl.salvar(campus1);
        assertEquals(campus1, campusDaoImpl.procurar(campus.getId()));
        campusDaoImpl.deletar(campus1.getId());
        assertTrue(campusDaoImpl.listarTodos().size() == 0);
    }
}
