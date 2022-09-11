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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author rranthum
 */

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "especificacao_falha")
public class EspecificacaoFalha implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "efa_codigo")
    private Integer efaCodigo;
    @Column(name = "efa_temperatura_falha")
    private String efaTemperaturaFalha;
    @Column(name = "efa_temperatura_aceitavel")
    private String efaTemperaturaAceitavel;
    @Column(name = "efa_excesso_temperatura")
    private String efaExcessoTemperatura;
    @Column(name = "efa_prazo_limite")
    private String efaPrazoLimite;
    @Column(name = "efa_ponto_termograma")
    private String efaPontoTermograma;
    
   
    @JoinColumn(name = "`condicoes_ambiente_cam_codigo`", referencedColumnName = "cam_codigo")
    @ManyToOne(optional = false)
    private CondicoesAmbiente condicoesAmbiente;

    public EspecificacaoFalha() {
    }

    public EspecificacaoFalha(Integer efaCodigo) {
        this.efaCodigo = efaCodigo;
    }

    

    public EspecificacaoFalha(String efaTemperaturaFalha, String efaTemperaturaAceitavel, String efaExcessoTemperatura,
			String efaPrazoLimite, String efaPontoTermograma, CondicoesAmbiente condicoesAmbiente) {
		super();
		this.efaTemperaturaFalha = efaTemperaturaFalha;
		this.efaTemperaturaAceitavel = efaTemperaturaAceitavel;
		this.efaExcessoTemperatura = efaExcessoTemperatura;
		this.efaPrazoLimite = efaPrazoLimite;
		this.efaPontoTermograma = efaPontoTermograma;
		this.condicoesAmbiente = condicoesAmbiente;
	}

	public Integer getEfaCodigo() {
        return efaCodigo;
    }

    public void setEfaCodigo(Integer efaCodigo) {
        this.efaCodigo = efaCodigo;
    }


    public String getEfaTemperaturaFalha() {
        return efaTemperaturaFalha;
    }

    public void setEfaTemperaturaFalha(String efaTemperaturaFalha) {
        this.efaTemperaturaFalha = efaTemperaturaFalha;
    }

    public String getEfaTemperaturaAceitavel() {
        return efaTemperaturaAceitavel;
    }

    public void setEfaTemperaturaAceitavel(String efaTemperaturaAceitavel) {
        this.efaTemperaturaAceitavel = efaTemperaturaAceitavel;
    }

    public String getEfaExcessoTemperatura() {
        return efaExcessoTemperatura;
    }

    public void setEfaExcessoTemperatura(String efaExcessoTemperatura) {
        this.efaExcessoTemperatura = efaExcessoTemperatura;
    }

    public String getEfaPrazoLimite() {
        return efaPrazoLimite;
    }

    public void setEfaPrazoLimite(String efaPrazoLimite) {
        this.efaPrazoLimite = efaPrazoLimite;
    }

    public String getEfaPontoTermograma() {
        return efaPontoTermograma;
    }

    public void setEfaPontoTermograma(String efaPontoTermograma) {
        this.efaPontoTermograma = efaPontoTermograma;
    }

    

    public CondicoesAmbiente getCondicoesAmbiente() {
		return condicoesAmbiente;
	}

	public void setCondicoesAmbiente(CondicoesAmbiente condicoesAmbiente) {
		this.condicoesAmbiente = condicoesAmbiente;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (efaCodigo != null ? efaCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EspecificacaoFalha)) {
            return false;
        }
        EspecificacaoFalha other = (EspecificacaoFalha) object;
        if ((this.efaCodigo == null && other.efaCodigo != null) || (this.efaCodigo != null && !this.efaCodigo.equals(other.efaCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.EspecificacaoFalha[ efaCodigo=" + efaCodigo + " ]";
    }
    
}

