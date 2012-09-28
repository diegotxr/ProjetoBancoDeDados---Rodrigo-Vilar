/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author diegotxr
 */
@Entity
@Table (name = "AlunoTurma")
public class AlunoTurma implements Serializable {

    private static final long serialVersionUID = 1L;

    public AlunoTurma() {
    }
    @Id
    @Column(nullable = false, name = "Matrícula", unique = true)
    private int matricula;
    @Column (nullable = false, name = "Id_Turma")
    private int id_turma;

    

    public AlunoTurma(int matricula, int id_turma) {
        this.matricula = matricula;
        this.id_turma = id_turma;
    }

    /**
     * @return the matricula
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the id_turma
     */
    public int getId_turma() {
        return id_turma;
    }

    /**
     * @param id_turma the id_turma to set
     */
    public void setId_turma(int id_turma) {
        this.id_turma = id_turma;
    }
}
