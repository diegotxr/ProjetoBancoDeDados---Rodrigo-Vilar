/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.Curso;
import java.util.List;


/**
 *
 * @author GilmarJr
 */
public interface CursoDAO {
    
    public void salvar(Curso curso);

    public void deletar(int id);

    public List<Curso> listarTodos();

    public Curso procurar(int id);

}
