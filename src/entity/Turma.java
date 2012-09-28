/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author diegotxr
 */
@Entity
@Table(name = "Turma")
public class Turma implements Serializable {

    private static final long serialVersionUID = 1L;

    public Turma() {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(nullable = false, name = "Periodo")
    private String periodo;
    @Column(nullable = false, name = "Horário")
    private String horario;
    @Column(nullable = true, name = "Professor")
    private String professor;
    @Column(nullable = false, name = "Id_Disciplina")
    private int id_Disciplina;

    public Turma(Integer id) {
        this.id = id;
    }

    public Turma(String periodo, String horario, String professor, int id_Disciplina) {
        this.periodo = periodo;
        this.horario = horario;
        this.professor = professor;
        this.id_Disciplina = id_Disciplina;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the nome
     */


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Turma other = (Turma) obj;
        if (this.getId() != other.getId() && (this.getId() == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    /**
     * @return the periodo
     */
    public String getPeriodo() {
        return periodo;
    }

    /**
     * @param periodo the periodo to set
     */
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    /**
     * @return the horario
     */
    public String getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(String horario) {
        this.horario = horario;
    }

    /**
     * @return the professor
     */
    public String getProfessor() {
        return professor;
    }

    /**
     * @param professor the professor to set
     */
    public void setProfessor(String professor) {
        this.professor = professor;
    }

    /**
     * @return the id_Disciplina
     */
    public int getId_Disciplina() {
        return id_Disciplina;
    }

    /**
     * @param id_Disciplina the id_Disciplina to set
     */
    public void setId_Disciplina(int id_Disciplina) {
        this.id_Disciplina = id_Disciplina;
    }
}
