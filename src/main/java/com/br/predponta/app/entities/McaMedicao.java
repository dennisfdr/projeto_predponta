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
@Table(name = "mca_medicao")
public class McaMedicao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "mem_codigo")
    private Integer memCodigo;
    @Basic(optional = false)
    @Column(name = "mem_data")
    @Temporal(TemporalType.DATE)
    private Date memData;
    
    @JoinColumn(name = "medicao_med_codigo", referencedColumnName = "med_codigo")
    @ManyToOne(optional = false)
    //@JsonIgnore
    private Medicao medicao;  
    
    public McaMedicao() {
    }

    public McaMedicao(Integer memCodigo) {
        this.memCodigo = memCodigo;
    }
       

    public McaMedicao(Date memData, Medicao medicao) {
		super();
		this.memData = memData;
		this.medicao = medicao;
	}

	public Integer getMemCodigo() {
        return memCodigo;
    }

    public void setMemCodigo(Integer memCodigo) {
        this.memCodigo = memCodigo;
    }

    public Date getMemData() {
        return memData;
    }

    public void setMemData(Date memData) {
        this.memData = memData;
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
        hash += (memCodigo != null ? memCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof McaMedicao)) {
            return false;
        }
        McaMedicao other = (McaMedicao) object;
        if ((this.memCodigo == null && other.memCodigo != null) || (this.memCodigo != null && !this.memCodigo.equals(other.memCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.McaMedicao[ memCodigo=" + memCodigo + " ]";
    }
    
}

