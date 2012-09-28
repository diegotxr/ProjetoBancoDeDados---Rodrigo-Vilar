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
@Table(name = "Sala")
public class Sala implements Serializable {

    private static final long serialVersionUID = 1L;

    public Sala() {
    }
    @Id
    @Column(nullable = false, name = "Código", unique = true)
    private int codigo;
    @Column(nullable = false, name = "Capacidade")
    private int capacidade;
    @Column(nullable = false, name = "Id_Turma")
    private int id_turma;

    public Sala(int codigo, int capacidade, int id_turma) {
        this.codigo = codigo;
        this.capacidade = capacidade;
        this.id_turma = id_turma;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the capacidade
     */
    public int getCapacidade() {
        return capacidade;
    }

    /**
     * @param capacidade the capacidade to set
     */
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
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
