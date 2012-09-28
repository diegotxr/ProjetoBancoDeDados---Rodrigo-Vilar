/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;
import entity.Centro;
import java.util.List;
/**
 *
 * @author Aluno
 */
public interface CentroDAO {

     public void salvar(Centro centro);

    public void deletar(int id);

    public List<Centro> listarTodos();

    public Centro procurar(int id);

}
