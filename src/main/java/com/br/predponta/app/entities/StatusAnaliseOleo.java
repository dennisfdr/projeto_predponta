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

/**
 *
 * @author rranthum
 */
@Entity
@Table(name = "status_analise_oleo")
public class StatusAnaliseOleo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "sao_codigo")
    private Integer saoCodigo;
    @Basic(optional = false)
    @Column(name = "sao_descricao")
    private String saoDescricao;
    @Basic(optional = false)
    @Column(name = "sao_cor")
    private String saoCor;
    @Basic(optional = false)
    @Column(name = "sao_ordem")
    private int saoOrdem;
    
    @JoinColumn(name = "medicao_analise_oleo_mao_codigo", referencedColumnName = "mao_codigo")
    @ManyToOne(optional = false)
    //@JsonIgnore
    private MedicaoAnaliseOleo medicaoAnaliseOleo;
    
    

    public StatusAnaliseOleo() {
    }

    public StatusAnaliseOleo(Integer saoCodigo) {
        this.saoCodigo = saoCodigo;
    }
    

    public StatusAnaliseOleo(String saoDescricao, String saoCor, int saoOrdem, MedicaoAnaliseOleo medicaoAnaliseOleo) {
		super();
		this.saoDescricao = saoDescricao;
		this.saoCor = saoCor;
		this.saoOrdem = saoOrdem;
		this.medicaoAnaliseOleo = medicaoAnaliseOleo;
	}

	public Integer getSaoCodigo() {
        return saoCodigo;
    }

    public void setSaoCodigo(Integer saoCodigo) {
        this.saoCodigo = saoCodigo;
    }

    public String getSaoDescricao() {
        return saoDescricao;
    }

    public void setSaoDescricao(String saoDescricao) {
        this.saoDescricao = saoDescricao;
    }

    public String getSaoCor() {
        return saoCor;
    }

    public void setSaoCor(String saoCor) {
        this.saoCor = saoCor;
    }

    public int getSaoOrdem() {
        return saoOrdem;
    }

    public void setSaoOrdem(int saoOrdem) {
        this.saoOrdem = saoOrdem;
    }
       

    public MedicaoAnaliseOleo getMedicaoAnaliseOleo() {
		return medicaoAnaliseOleo;
	}

	public void setMedicaoAnaliseOleo(MedicaoAnaliseOleo medicaoAnaliseOleo) {
		this.medicaoAnaliseOleo = medicaoAnaliseOleo;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (saoCodigo != null ? saoCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StatusAnaliseOleo)) {
            return false;
        }
        StatusAnaliseOleo other = (StatusAnaliseOleo) object;
        if ((this.saoCodigo == null && other.saoCodigo != null) || (this.saoCodigo != null && !this.saoCodigo.equals(other.saoCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.StatusAnaliseOleo[ saoCodigo=" + saoCodigo + " ]";
    }
    
}
