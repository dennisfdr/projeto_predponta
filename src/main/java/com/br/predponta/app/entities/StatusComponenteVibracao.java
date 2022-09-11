package com.br.predponta.app.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "status_componente_vibracao")
public class StatusComponenteVibracao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "scv_codigo")
    private Integer scvCodigo;
    @Basic(optional = false)
    @Column(name = "scv_descricao")
    private String scvDescricao;
    @Basic(optional = false)
    @Column(name = "scv_cor")
    private String scvCor;
    @Basic(optional = false)
    @Column(name = "scv_ordem")
    private int scvOrdem;
    
    @JoinColumn(name = "medicao_analise_vibracao_mav_codigo", referencedColumnName = "mav_codigo")
    @ManyToOne(optional = false)
    //@JsonIgnore
    private MedicaoAnaliseVibracao medicaoAnaliseVibracao;  
   

    public StatusComponenteVibracao() {
    }
 

   

	public Integer getScvCodigo() {
        return scvCodigo;
    }

    public void setScvCodigo(Integer scvCodigo) {
        this.scvCodigo = scvCodigo;
    }

    public String getScvDescricao() {
        return scvDescricao;
    }

    public void setScvDescricao(String scvDescricao) {
        this.scvDescricao = scvDescricao;
    }

    public String getScvCor() {
        return scvCor;
    }

    public void setScvCor(String scvCor) {
        this.scvCor = scvCor;
    }

    public int getScvOrdem() {
        return scvOrdem;
    }

    public void setScvOrdem(int scvOrdem) {
        this.scvOrdem = scvOrdem;
    }

    

    public MedicaoAnaliseVibracao getMedicaoAnaliseVibracao() {
		return medicaoAnaliseVibracao;
	}

	public void setMedicaoAnaliseVibracao(MedicaoAnaliseVibracao medicaoAnaliseVibracao) {
		this.medicaoAnaliseVibracao = medicaoAnaliseVibracao;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (scvCodigo != null ? scvCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StatusComponenteVibracao)) {
            return false;
        }
        StatusComponenteVibracao other = (StatusComponenteVibracao) object;
        if ((this.scvCodigo == null && other.scvCodigo != null) || (this.scvCodigo != null && !this.scvCodigo.equals(other.scvCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.StatusComponenteVibracao[ scvCodigo=" + scvCodigo + " ]";
    }
    
}

