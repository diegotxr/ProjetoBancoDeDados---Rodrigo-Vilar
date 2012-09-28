/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


/**
 *
 * @author GilmarJr
 */
import entity.Campus;
import java.util.List;
public interface CampusDAO {
    
    public void salvar(Campus campus);

    public void deletar(int id);

    public List<Campus> listarTodos();

    public Campus procurar(int id);

}
