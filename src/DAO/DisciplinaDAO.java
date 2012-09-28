/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.Disciplina;
import java.util.List;

/**
 *
 * @author GilmarJr
 */
public interface DisciplinaDAO {
    
    public void salvar(Disciplina disciplina);

    public void deletar(int id);

    public List<Disciplina> listarTodos();

    public Disciplina procurar(int id);

}
