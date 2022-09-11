package com.br.predponta.app.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 *
 * @author rranthum
 */
@Entity
@Table(name = "mca_circuito")
public class McaCircuito implements Serializable {

    

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "mcc_codigo")
    private Long mccCodigo;
    @Basic(optional = false)
    @Column(name = "mcc_descricao")
    private String mccDescricao;
    @Basic(optional = false)
    @Column(name = "mcc_tag")
    private String mccTag;
    @Basic(optional = false)
    @Column(name = "mcc_status")
    private int mccStatus;
    @Lob
    @Column(name = "mcc_foto")
    private byte[] mccFoto;
   

    public McaCircuito() {
    }

    public McaCircuito(Long mccCodigo) {
        this.mccCodigo = mccCodigo;
    }
    
    public McaCircuito(String mccDescricao, String mccTag, int mccStatus, byte[] mccFoto) {
		super();
		this.mccDescricao = mccDescricao;
		this.mccTag = mccTag;
		this.mccStatus = mccStatus;
		this.mccFoto = mccFoto;
	}

	public Long getMccCodigo() {
        return mccCodigo;
    }

    public void setMccCodigo(Long mccCodigo) {
        this.mccCodigo = mccCodigo;
    }

    public String getMccDescricao() {
        return mccDescricao;
    }

    public void setMccDescricao(String mccDescricao) {
        this.mccDescricao = mccDescricao;
    }

    public String getMccTag() {
        return mccTag;
    }

    public void setMccTag(String mccTag) {
        this.mccTag = mccTag;
    }

    

    public int getMccStatus() {
        return mccStatus;
    }

    public void setMccStatus(int mccStatus) {
        this.mccStatus = mccStatus;
    }
    
    public byte[] getMccFoto() {
		return mccFoto;
	}

	public void setMccFoto(byte[] mccFoto) {
		this.mccFoto = mccFoto;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (mccCodigo != null ? mccCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof McaCircuito)) {
            return false;
        }
        McaCircuito other = (McaCircuito) object;
        if ((this.mccCodigo == null && other.mccCodigo != null) || (this.mccCodigo != null && !this.mccCodigo.equals(other.mccCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.McaCircuito[ mccCodigo=" + mccCodigo + " ]";
    }

    
}

