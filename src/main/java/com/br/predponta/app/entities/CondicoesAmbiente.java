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
@Table(name = "condicoes_ambiente")
public class CondicoesAmbiente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cam_codigo")
    private Integer camCodigo;
    @Basic(optional = false)
    @Column(name = "cam_temperatura")
    private int camTemperatura;
    @Basic(optional = false)
    @Column(name = "cam_carga")
    private int camCarga;
    @Basic(optional = false)
    @Column(name = "cam_ponto_termograma")
    private int camPontoTermograma;
    @Basic(optional = false)
    @Column(name = "cam_emissividade")
    private int camEmissividade;
    
    @JoinColumn(name = "inspecao_termografica_peca_itp_codigo", referencedColumnName = "itp_codigo")
    @ManyToOne(optional = false)
    //@JsonIgnore
    private InspecaoTermograficaPeca inspecaoTermograficaPeca;

    public CondicoesAmbiente() {
    }

    public CondicoesAmbiente(Integer camCodigo) {
        this.camCodigo = camCodigo;
    }

    public CondicoesAmbiente(Integer camCodigo, int camTemperatura, int camCarga, int camPontoTermograma, int camEmissividade,  InspecaoTermograficaPeca inspecaoTermograficaPeca)
 {
        this.camCodigo = camCodigo;
        this.camTemperatura = camTemperatura;
        this.camCarga = camCarga;
        this.camPontoTermograma = camPontoTermograma;
        this.camEmissividade = camEmissividade;
        this.inspecaoTermograficaPeca = inspecaoTermograficaPeca;
    }

    public Integer getCamCodigo() {
        return camCodigo;
    }

    public void setCamCodigo(Integer camCodigo) {
        this.camCodigo = camCodigo;
    }


    public int getCamTemperatura() {
        return camTemperatura;
    }

    public void setCamTemperatura(int camTemperatura) {
        this.camTemperatura = camTemperatura;
    }

    public int getCamCarga() {
        return camCarga;
    }

    public void setCamCarga(int camCarga) {
        this.camCarga = camCarga;
    }

    public int getCamPontoTermograma() {
        return camPontoTermograma;
    }

    public void setCamPontoTermograma(int camPontoTermograma) {
        this.camPontoTermograma = camPontoTermograma;
    }

    public int getCamEmissividade() {
        return camEmissividade;
    }

    public void setCamEmissividade(int camEmissividade) {
        this.camEmissividade = camEmissividade;
    }
    
    

    public InspecaoTermograficaPeca getInspecaoTermograficaPeca() {
		return inspecaoTermograficaPeca;
	}

	public void setInspecaoTermograficaPeca(InspecaoTermograficaPeca inspecaoTermograficaPeca) {
		this.inspecaoTermograficaPeca = inspecaoTermograficaPeca;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (camCodigo != null ? camCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CondicoesAmbiente)) {
            return false;
        }
        CondicoesAmbiente other = (CondicoesAmbiente) object;
        if ((this.camCodigo == null && other.camCodigo != null) || (this.camCodigo != null && !this.camCodigo.equals(other.camCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.CondicoesAmbiente[ camCodigo=" + camCodigo + " ]";
    }
    
}

