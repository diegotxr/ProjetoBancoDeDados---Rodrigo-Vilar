
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
 * @author GilmarJr
 */
public class InstituicaoTest {
    
   
        @Test

        public void testCrudEntidade(){

       InstituicaoDaoImpl instituicaoDaoImpl= new InstituicaoDaoImpl();
       assertTrue(instituicaoDaoImpl.listarTodos().size()==0);
       Instituicao instituicao= new Instituicao();
       instituicao.setNome("UFPB");
       instituicaoDaoImpl.salvar(instituicao);
       assertTrue(instituicaoDaoImpl.listarTodos().size()==1);
       assertTrue(instituicaoDaoImpl.listarTodos().contains(instituicao));
       Instituicao instituicao1 = instituicaoDaoImpl.procurar(instituicao.getId());
       instituicao.setNome("UFRN");
       instituicaoDaoImpl.salvar(instituicao1);
       assertEquals(instituicao1,instituicaoDaoImpl.procurar(instituicao.getId()));
       instituicaoDaoImpl.deletar(instituicao1.getId());
       assertTrue(instituicaoDaoImpl.listarTodos().size()==0);
    }

}
