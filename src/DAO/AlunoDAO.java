/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import entity.Aluno;
import java.util.List;

/**
 *
 * @author diegotxr
 */
public interface AlunoDAO {

    public void salvar(Aluno aluno);

    public void deletar(int matricula);

    public List<Aluno> listarTodos();

    public Aluno procurar(int matricula);

  
}
