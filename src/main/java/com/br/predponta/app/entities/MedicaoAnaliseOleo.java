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
@Table(name = "medicao_analise_oleo")
public class MedicaoAnaliseOleo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "mao_codigo")
    private Integer maoCodigo;
    @Basic(optional = false)
    @Column(name = "mao_data")
    @Temporal(TemporalType.DATE)
    private Date maoData;
    
    @JoinColumn(name = "analise_oleo_ano_codigo", referencedColumnName = "ano_codigo")
    @ManyToOne(optional = false)
    //@JsonIgnore
    private AnaliseOleo analiseOleo; 
    
    public MedicaoAnaliseOleo() {
    }

    public MedicaoAnaliseOleo(Integer maoCodigo) {
        this.maoCodigo = maoCodigo;
    }
    
    

    

    public MedicaoAnaliseOleo(Date maoData, AnaliseOleo analiseOleo) {
		super();
		this.maoData = maoData;
		this.analiseOleo = analiseOleo;
	}

	public Integer getMaoCodigo() {
        return maoCodigo;
    }

    public void setMaoCodigo(Integer maoCodigo) {
        this.maoCodigo = maoCodigo;
    }

    public Date getMaoData() {
        return maoData;
    }

    public void setMaoData(Date maoData) {
        this.maoData = maoData;
    }
    
    
    public AnaliseOleo getAnaliseOleo() {
		return analiseOleo;
	}

	public void setAnaliseOleo(AnaliseOleo analiseOleo) {
		this.analiseOleo = analiseOleo;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (maoCodigo != null ? maoCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MedicaoAnaliseOleo)) {
            return false;
        }
        MedicaoAnaliseOleo other = (MedicaoAnaliseOleo) object;
        if ((this.maoCodigo == null && other.maoCodigo != null) || (this.maoCodigo != null && !this.maoCodigo.equals(other.maoCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.MedicaoAnaliseOleo[ maoCodigo=" + maoCodigo + " ]";
    }
    
}

