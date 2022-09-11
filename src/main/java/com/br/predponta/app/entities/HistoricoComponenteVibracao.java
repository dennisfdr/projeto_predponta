package com.br.predponta.app.entities;

import java.io.Serializable;
import java.util.Objects;

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
@Table(name = "historico_componente_vibracao")
public class HistoricoComponenteVibracao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "hcv_codigo")
    private Integer hcvCodigo;
    @Basic(optional = false)
    @Column(name = "hcv_observacao")
    private String hcvObservacao;
    @Basic(optional = false)
    @Column(name = "hcv_ordem_servico")
    private String hcvOrdemServico;
    
    
    @JoinColumn(name = "status_componente_vibracao_scv_codigo", referencedColumnName = "scv_codigo")
    @ManyToOne(optional = false)
    //@JsonIgnore
    private StatusComponenteVibracao statusComponenteVibracao;  
    

    public HistoricoComponenteVibracao() {
    }
    
    
    
    
    

	public HistoricoComponenteVibracao(Integer hcvCodigo, String hcvObservacao, String hcvOrdemServico,
			StatusComponenteVibracao statusComponenteVibracao) {
		
		this.hcvCodigo = hcvCodigo;
		this.hcvObservacao = hcvObservacao;
		this.hcvOrdemServico = hcvOrdemServico;
		this.statusComponenteVibracao = statusComponenteVibracao;
	}






	public Integer getHcvCodigo() {
		return hcvCodigo;
	}


	public void setHcvCodigo(Integer hcvCodigo) {
		this.hcvCodigo = hcvCodigo;
	}


	public String getHcvObservacao() {
        return hcvObservacao;
    }

    public void setHcvObservacao(String hcvObservacao) {
        this.hcvObservacao = hcvObservacao;
    }

    public String getHcvOrdemServico() {
        return hcvOrdemServico;
    }

    public void setHcvOrdemServico(String hcvOrdemServico) {
        this.hcvOrdemServico = hcvOrdemServico;
    }



	public StatusComponenteVibracao getStatusComponenteVibracao() {
		return statusComponenteVibracao;
	}



	public void setStatusComponenteVibracao(StatusComponenteVibracao statusComponenteVibracao) {
		this.statusComponenteVibracao = statusComponenteVibracao;
	}



	@Override
	public int hashCode() {
		return Objects.hash(hcvCodigo);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HistoricoComponenteVibracao other = (HistoricoComponenteVibracao) obj;
		return Objects.equals(hcvCodigo, other.hcvCodigo);
	}
	
	
    
    

    
    
   
    
}

