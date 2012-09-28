/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.*;
import java.util.List;


public interface DepartamentoDAO {

    public void salvar(Departamento departamento);

    public void deletar(int id);

    public List<Departamento> listarTodos();

    public Departamento procurar(int id);

}

