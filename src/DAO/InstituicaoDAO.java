/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.Instituicao;
import java.util.List;

/**
 *
 * @author diegotxr
 */
public interface InstituicaoDAO {

    public void salvar(Instituicao instituicao);

    public void deletar(int id);

    public List<Instituicao> listarTodos();

    public Instituicao procurar(int id);


}
