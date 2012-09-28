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
@Table (name = "Departamento")
public class Departamento implements Serializable {

    private static final long serialVersionUID = 1L;

    public Departamento() {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(nullable = false, name = "Nome")
    private String nome;
    @Column(nullable = false, name = "Sigla", unique = true)
    private String sigla;
    @Column(nullable = false, name = "Id_Centro")
    private int id_centro;
            

    public Departamento(Integer id) {
        this.id = id;
    }

    public Departamento(String nome, String sigla, int id_centro) {
        this.nome = nome;
        this.sigla = sigla;
        this.id_centro = id_centro;
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
     * @return the sigla
     */
    public String getSigla() {
        return sigla;
    }

    /**
     * @param sigla the sigla to set
     */
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    /**
     * @return the id_centro
     */
    public int getId_centro() {
        return id_centro;
    }

    /**
     * @param id_centro the id_centro to set
     */
    public void setId_centro(int id_centro) {
        this.id_centro = id_centro;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Departamento other = (Departamento) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }


    
}
