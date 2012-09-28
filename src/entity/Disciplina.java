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
@Table(name = "Disciplina")
public class Disciplina implements Serializable {

    private static final long serialVersionUID = 1L;

    public Disciplina() {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(nullable = false, name = "Nome")
    private String nome;
    @Column(nullable = false, name = "Id_Curso")
    private int id_Curso;

    public Disciplina(Integer id) {
        this.id = id;
    }

    public Disciplina(String nome, int id_Curso) {
        this.nome = nome;
        this.id_Curso = id_Curso;
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
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Disciplina other = (Disciplina) obj;
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
     * @return the id_Curso
     */
    public int getId_Curso() {
        return id_Curso;
    }

    /**
     * @param id_Curso the id_Curso to set
     */
    public void setId_Curso(int id_Curso) {
        this.id_Curso = id_Curso;
    }
}
