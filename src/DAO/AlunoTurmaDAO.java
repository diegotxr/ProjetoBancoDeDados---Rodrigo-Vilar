/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.AlunoTurma;
import java.util.List;

/**
 *
 * @author GilmarJr
 */
public interface AlunoTurmaDAO {
    
    
    public void salvar(AlunoTurma aluno);

    public void deletar(int matricula);

    public List<AlunoTurma> listarTodos();

    public AlunoTurma procurar(int matricula);


}
