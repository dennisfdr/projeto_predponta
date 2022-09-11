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
@Table(name = "mca_status")
public class McaStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "mcas_codigo")
    private Integer mcasCodigo;
    @Basic(optional = false)
    @Column(name = "mcas_descricao")
    private String mcasDescricao;
    @Basic(optional = false)
    @Column(name = "mcas_cor")
    private String mcasCor;

    public McaStatus() {
    }

    public McaStatus(Integer mcasCodigo) {
        this.mcasCodigo = mcasCodigo;
    }

    public McaStatus(Integer mcasCodigo, String mcasDescricao, String mcasCor) {
        this.mcasCodigo = mcasCodigo;
        this.mcasDescricao = mcasDescricao;
        this.mcasCor = mcasCor;
    }

    public Integer getMcasCodigo() {
        return mcasCodigo;
    }

    public void setMcasCodigo(Integer mcasCodigo) {
        this.mcasCodigo = mcasCodigo;
    }

    public String getMcasDescricao() {
        return mcasDescricao;
    }

    public void setMcasDescricao(String mcasDescricao) {
        this.mcasDescricao = mcasDescricao;
    }

    public String getMcasCor() {
        return mcasCor;
    }

    public void setMcasCor(String mcasCor) {
        this.mcasCor = mcasCor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcasCodigo != null ? mcasCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof McaStatus)) {
            return false;
        }
        McaStatus other = (McaStatus) object;
        if ((this.mcasCodigo == null && other.mcasCodigo != null) || (this.mcasCodigo != null && !this.mcasCodigo.equals(other.mcasCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.McaStatus[ mcasCodigo=" + mcasCodigo + " ]";
    }
    
}

