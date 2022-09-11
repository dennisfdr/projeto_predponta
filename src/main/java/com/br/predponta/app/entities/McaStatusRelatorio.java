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
@Table(name = "mca_status_relatorio")
public class McaStatusRelatorio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "mcasr_codigo")
    private Integer mcasrCodigo;
    @Basic(optional = false)
    @Column(name = "mcasr_descricao")
    private String mcasrDescricao;
    @Basic(optional = false)
    @Column(name = "mcasr_cor")
    private String mcasrCor;

    public McaStatusRelatorio() {
    }

    public McaStatusRelatorio(Integer mcasrCodigo) {
        this.mcasrCodigo = mcasrCodigo;
    }

    public McaStatusRelatorio(Integer mcasrCodigo, String mcasrDescricao, String mcasrCor) {
        this.mcasrCodigo = mcasrCodigo;
        this.mcasrDescricao = mcasrDescricao;
        this.mcasrCor = mcasrCor;
    }

    public Integer getMcasrCodigo() {
        return mcasrCodigo;
    }

    public void setMcasrCodigo(Integer mcasrCodigo) {
        this.mcasrCodigo = mcasrCodigo;
    }

    public String getMcasrDescricao() {
        return mcasrDescricao;
    }

    public void setMcasrDescricao(String mcasrDescricao) {
        this.mcasrDescricao = mcasrDescricao;
    }

    public String getMcasrCor() {
        return mcasrCor;
    }

    public void setMcasrCor(String mcasrCor) {
        this.mcasrCor = mcasrCor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcasrCodigo != null ? mcasrCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof McaStatusRelatorio)) {
            return false;
        }
        McaStatusRelatorio other = (McaStatusRelatorio) object;
        if ((this.mcasrCodigo == null && other.mcasrCodigo != null) || (this.mcasrCodigo != null && !this.mcasrCodigo.equals(other.mcasrCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.McaStatusRelatorio[ mcasrCodigo=" + mcasrCodigo + " ]";
    }
    
}

