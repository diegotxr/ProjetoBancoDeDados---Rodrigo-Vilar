/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.Turma;
import java.util.List;

/**
 *
 * @author GilmarJr
 */
public interface TurmaDAO {
    
    public void salvar(Turma turma);

    public void deletar(int id);

    public List<Turma> listarTodos();

    public Turma procurar(int id);

}
