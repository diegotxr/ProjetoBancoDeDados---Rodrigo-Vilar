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
@Table (name = "Centro")
public class Centro implements Serializable {

    private static final long serialVersionUID = 1L;

    public Centro() {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(nullable = false, name = "Nome")
    private String nome;
   @Column(nullable = false, name = "Id_Campus")
    private int id_campus;

    public Centro(Integer id) {
        this.id = id;
    }

    public Centro(String nome, int id_Campus) {
        this.nome = nome;
        this.id_campus = id_Campus;
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
        final Centro other = (Centro) obj;
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
     * @return the id_campus
     */
    public int getId_campus() {
        return id_campus;
    }

    /**
     * @param id_campus the id_campus to set
     */
    public void setId_campus(int id_campus) {
        this.id_campus = id_campus;
    }

 }
