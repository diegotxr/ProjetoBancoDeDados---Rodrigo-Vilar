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
@Table(name = "Aluno")
public class Aluno implements Serializable {

    private static final long serialVersionUID = 1L;

    public Aluno() {
    }
    @Id
    @Column(nullable = false, name = "Matricula", unique = true)
    private int matricula;
    @Column(nullable = false, name = "Nome")
    private String nome;
    @Column(nullable = false, name = "Id_Curso")
    private int id_curso;


    public Aluno(String nome, int matricula, int id_curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.id_curso = id_curso;
    }


    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
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
     * @return the id_curso
     */
    public int getId_curso() {
        return id_curso;
    }

    /**
     * @param id_curso the id_curso to set
     */
    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }


}
