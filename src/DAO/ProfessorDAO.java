/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.Professor;
import java.util.List;

/**
 *
 * @author GilmarJr
 */
public interface ProfessorDAO {
    
    
    public void salvar(Professor professor);

    public void deletar(int matricula);

    public List<Professor> listarTodos();

    public Professor procurar(int matricula);

}
