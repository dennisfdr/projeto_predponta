package com.br.predponta.app.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 *
 * @author rranthum
 */
@Entity
@Table(name = "inspecao_termografica_peca")
public class InspecaoTermograficaPeca implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "itp_codigo")
    private Integer itpCodigo;
    
    @JoinColumn(name = "inspecao_termografica_ite_codigo", referencedColumnName = "ite_codigo")
    @ManyToOne(optional = false)
    //@JsonIgnore
    private InspecaoTermografica inspecaoTermografica;

    public InspecaoTermograficaPeca() {
    }
    
    

    public InspecaoTermograficaPeca(Integer itpCodigo, InspecaoTermografica inspecaoTermografica) {
		super();
		this.itpCodigo = itpCodigo;
		this.inspecaoTermografica = inspecaoTermografica;
	}



	public InspecaoTermograficaPeca(Integer itpCodigo) {
        this.itpCodigo = itpCodigo;
    }

    public Integer getItpCodigo() {
        return itpCodigo;
    }

    public void setItpCodigo(Integer itpCodigo) {
        this.itpCodigo = itpCodigo;
    }

    

    

    public InspecaoTermografica getInspecaoTermografica() {
		return inspecaoTermografica;
	}

	public void setInspecaoTermografica(InspecaoTermografica inspecaoTermografica) {
		this.inspecaoTermografica = inspecaoTermografica;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (itpCodigo != null ? itpCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        
        InspecaoTermograficaPeca other = (InspecaoTermograficaPeca) object;
        if ((this.itpCodigo == null && other.itpCodigo != null) || (this.itpCodigo != null && !this.itpCodigo.equals(other.itpCodigo))) {
            return false;
        }
        return true;
    }

    
    
}
