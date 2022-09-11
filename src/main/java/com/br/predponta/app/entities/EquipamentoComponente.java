package com.br.predponta.app.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author rranthum
 */
@Entity
@Table(name = "equipamento_componente")

public class EquipamentoComponente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "EQC_CODIGO")
    private Integer eqcCodigo;
    @Basic(optional = false)
    @Column(name = "EQC_NOME")
    private String eqcNome;
    @Basic(optional = false)
    @Column(name = "EQC_STATUS")
    private int eqcStatus;
    @Basic(optional = false)
    @Column(name = "eqc_exibe_relatorio")
    private int eqcExibeRelatorio;
    
    public EquipamentoComponente() {
    }

    public EquipamentoComponente(Integer eqcCodigo) {
        this.eqcCodigo = eqcCodigo;
    }

    public EquipamentoComponente(Integer eqcCodigo, String eqcNome, int eqcStatus, int eqcExibeRelatorio) {
        this.eqcCodigo = eqcCodigo;
        this.eqcNome = eqcNome;
        this.eqcStatus = eqcStatus;
        this.eqcExibeRelatorio = eqcExibeRelatorio;
    }

    public Integer getEqcCodigo() {
        return eqcCodigo;
    }

    public void setEqcCodigo(Integer eqcCodigo) {
        this.eqcCodigo = eqcCodigo;
    }

    public String getEqcNome() {
        return eqcNome;
    }

    public void setEqcNome(String eqcNome) {
        this.eqcNome = eqcNome;
    }

    public int getEqcStatus() {
        return eqcStatus;
    }

    public void setEqcStatus(int eqcStatus) {
        this.eqcStatus = eqcStatus;
    }

    public int getEqcExibeRelatorio() {
        return eqcExibeRelatorio;
    }

    public void setEqcExibeRelatorio(int eqcExibeRelatorio) {
        this.eqcExibeRelatorio = eqcExibeRelatorio;
    }

    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eqcCodigo != null ? eqcCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EquipamentoComponente)) {
            return false;
        }
        EquipamentoComponente other = (EquipamentoComponente) object;
        if ((this.eqcCodigo == null && other.eqcCodigo != null) || (this.eqcCodigo != null && !this.eqcCodigo.equals(other.eqcCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.EquipamentoComponente[ eqcCodigo=" + eqcCodigo + " ]";
    }
    
}

