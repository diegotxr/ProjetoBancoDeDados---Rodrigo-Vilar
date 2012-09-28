
import DAO.CampusDaoImpl;
import DAO.CentroDaoImpl;
import DAO.CursoDaoImpl;
import DAO.DepartamentoDaoImpl;
import DAO.InstituicaoDaoImpl;
import DAO.ProfessorDaoImpl;
import entity.Campus;
import entity.Centro;
import entity.Curso;
import entity.Departamento;
import entity.Instituicao;
import entity.Professor;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author diegotxr 
 * organizar os contrutores, consertar os metodos procura, listarTodos e deletar, 
 * adicionar mais atributos a procurar, fazer os testes
 * consertar o main, tentar fazer um metodo update para editar as entidades já adicionadas
 * 
 */
public class Main {

    public static void main(String[] args) {


        Instituicao instituicao = new Instituicao("UFPB");
        InstituicaoDaoImpl instituicaoDaoImpl = new InstituicaoDaoImpl();
        Campus campus = new Campus("I",4);
        CampusDaoImpl campusDaoImpl = new CampusDaoImpl();
        Centro centro = new Centro("CCAE", 21);
        CentroDaoImpl centroDaoImpl = new CentroDaoImpl();
        
        


        //instituicaoDaoImpl.salvar(instituicao);
        //campusDaoImpl.salvar(campus);
        //centroDaoImpl.salvar(centro);
        //departamentoDaoImpl.salvar(departamento);
        //cursoDaoImpl.salvar(curso);
        //professorDaoImpl.salvar(professor);
        
        


        //instituicaoDaoImpl.procurar(2);
        //instituicaoDaoImpl.deletar(19);
        //List<Instituicao> instituicoes = instituicaoDaoImpl.listarTodos();
        //for (Instituicao i : instituicoes){
        //System.out.println(i.getNome() + " ");
        //}



    }
}