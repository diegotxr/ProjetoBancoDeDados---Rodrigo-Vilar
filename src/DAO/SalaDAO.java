/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.Sala;
import java.util.List;

/**
 *
 * @author GilmarJr
 */
public interface SalaDAO {
    
    
    public void salvar(Sala sala);

    public void deletar(int codigo);

    public List<Sala> listarTodos();

    public Sala procurar(int codigo);

}
