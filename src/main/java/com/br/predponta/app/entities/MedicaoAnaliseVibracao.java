package com.br.predponta.app.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author rranthum
 */
@Entity
@Table(name = "medicao_analise_vibracao")
public class MedicaoAnaliseVibracao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "mav_codigo")
    private Integer mavCodigo;
    @Basic(optional = false)
    @Column(name = "mav_data")
    @Temporal(TemporalType.DATE)
    private Date mavData;
    
    
    @JoinColumn(name = "medicao_med_codigo", referencedColumnName = "med_codigo")
    @ManyToOne(optional = false)
    //@JsonIgnore
    private Medicao medicao;  
    
    public MedicaoAnaliseVibracao() {
    }

    public MedicaoAnaliseVibracao(Integer mavCodigo) {
        this.mavCodigo = mavCodigo;
    }
    
  
	public MedicaoAnaliseVibracao(Date mavData, Medicao medicao) {
		super();
		this.mavData = mavData;
		this.medicao = medicao;
	}

	public Integer getMavCodigo() {
        return mavCodigo;
    }

    public void setMavCodigo(Integer mavCodigo) {
        this.mavCodigo = mavCodigo;
    }

    public Date getMavData() {
        return mavData;
    }

    public void setMavData(Date mavData) {
        this.mavData = mavData;
    }
 

    
    public Medicao getMedicao() {
		return medicao;
	}

	public void setMedicao(Medicao medicao) {
		this.medicao = medicao;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (mavCodigo != null ? mavCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MedicaoAnaliseVibracao)) {
            return false;
        }
        MedicaoAnaliseVibracao other = (MedicaoAnaliseVibracao) object;
        if ((this.mavCodigo == null && other.mavCodigo != null) || (this.mavCodigo != null && !this.mavCodigo.equals(other.mavCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.MedicaoAnaliseVibracao[ mavCodigo=" + mavCodigo + " ]";
    }
    
}

