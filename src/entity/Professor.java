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
@Table(name = "Professor")
public class Professor implements Serializable {

    private static final long serialVersionUID = 1L;

    public Professor() {
    }
    @Id
    @Column(nullable = false, name = "Matricula")
    private int matricula;
    @Column(nullable = false, name = "Nome")
    private String nome;
    @Column(nullable = true, name = "Título")
    private String titulo;
    @Column(nullable = false, name = "Id_Departamento")
    private int id_Departamento;


    

    public Professor(int matricula, String nome, String titulo, int id_Departamento) {
        this.matricula = matricula;   
        this.nome = nome;
        this.titulo = titulo;
        this.id_Departamento = id_Departamento;
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
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the id_Departamento
     */
    public int getId_Departamento() {
        return id_Departamento;
    }

    /**
     * @param id_Departamento the id_Departamento to set
     */
    public void setId_Departamento(int id_Departamento) {
        this.id_Departamento = id_Departamento;
    }

  /*  @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.matricula;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Professor other = (Professor) obj;
        if (this.matricula != other.matricula) {
            return false;
        }
        return true;
    }*/
    
    
}
