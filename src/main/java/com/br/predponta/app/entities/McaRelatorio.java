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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 *
 * @author rranthum
 */
@Entity
@Table(name = "mca_relatorio")
public class McaRelatorio implements Serializable {

    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "mcr_codigo")
    private Long mcrCodigo;
    @Basic(optional = false)
    @Column(name = "mcr_numero")
    private int mcrNumero;
    @Basic(optional = false)
    @Lob
    @Column(name = "mcr_falha")
    private String mcrFalha;
    @Basic(optional = false)
    @Lob
    @Column(name = "mcr_parecer_tecnico")
    private String mcrParecerTecnico;
    @Basic(optional = false)
    @Lob
    @Column(name = "mcr_acao_proposta")
    private String mcrAcaoProposta;
    @Basic(optional = false)
    @Column(name = "mcr_resistencia_fases_r1")
    private float mcrResistenciaFasesR1;
    @Basic(optional = false)
    @Column(name = "mcr_resistencia_fases_r2")
    private float mcrResistenciaFasesR2;
    @Basic(optional = false)
    @Column(name = "mcr_resistencia_fases_r3")
    private float mcrResistenciaFasesR3;
    @Basic(optional = false)
    @Column(name = "mcr_resistencia_fases_r")
    private float mcrResistenciaFasesR;
    @Basic(optional = false)
    @Column(name = "mcr_resistencia_fases_status")
    private int mcrResistenciaFasesStatus;
    @Basic(optional = false)
    @Column(name = "mcr_impedancia_z1")
    private float mcrImpedanciaZ1;
    @Basic(optional = false)
    @Column(name = "mcr_impedancia_z1_status")
    private int mcrImpedanciaZ1Status;
    @Basic(optional = false)
    @Column(name = "mcr_impedancia_z2")
    private float mcrImpedanciaZ2;
    @Basic(optional = false)
    @Column(name = "mcr_impedancia_z2_status")
    private int mcrImpedanciaZ2Status;
    @Basic(optional = false)
    @Column(name = "mcr_impedancia_z3")
    private float mcrImpedanciaZ3;
    @Basic(optional = false)
    @Column(name = "mcr_impedancia_z3_status")
    private int mcrImpedanciaZ3Status;
    @Basic(optional = false)
    @Column(name = "mcr_angulo_fi1")
    private int mcrAnguloFi1;
    @Basic(optional = false)
    @Column(name = "mcr_angulo_fi2")
    private int mcrAnguloFi2;
    @Basic(optional = false)
    @Column(name = "mcr_angulo_fi3")
    private int mcrAnguloFi3;
    @Basic(optional = false)
    @Column(name = "mcr_angulo_fi")
    private float mcrAnguloFi;
    @Basic(optional = false)
    @Column(name = "mcr_angulo_fi_status")
    private int mcrAnguloFiStatus;
    @Basic(optional = false)
    @Column(name = "mcr_angulo_if1")
    private int mcrAnguloIf1;
    @Basic(optional = false)
    @Column(name = "mcr_angulo_if2")
    private int mcrAnguloIf2;
    @Basic(optional = false)
    @Column(name = "mcr_angulo_if3")
    private int mcrAnguloIf3;
    @Basic(optional = false)
    @Column(name = "mcr_angulo_if")
    private float mcrAnguloIf;
    @Basic(optional = false)
    @Column(name = "mcr_angulo_if_status")
    private int mcrAnguloIfStatus;
    @Basic(optional = false)
    @Column(name = "mcr_resistencia")
    private float mcrResistencia;
    @Basic(optional = false)
    @Column(name = "mcr_resistencia_status")
    private int mcrResistenciaStatus;
    @Basic(optional = false)
    @Column(name = "mcr_date_insert")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mcrDateInsert;
    @Basic(optional = false)
    @Column(name = "mcr_user_insert")
    private String mcrUserInsert;
    @Basic(optional = false)
    @Column(name = "mcr_impedancia_l1")
    private float mcrImpedanciaL1;
    @Basic(optional = false)
    @Column(name = "mcr_impedancia_l1_status")
    private int mcrImpedanciaL1Status;
    @Basic(optional = false)
    @Column(name = "mcr_impedancia_l2")
    private float mcrImpedanciaL2;
    @Basic(optional = false)
    @Column(name = "mcr_impedancia_l2_status")
    private int mcrImpedanciaL2Status;
    @Basic(optional = false)
    @Column(name = "mcr_impedancia_l3")
    private float mcrImpedanciaL3;
    @Basic(optional = false)
    @Column(name = "mcr_impedancia_l3_status")
    private int mcrImpedanciaL3Status;
    @Basic(optional = false)
    @Column(name = "mcr_numero_os")
    private String mcrNumeroOs;
    @Lob
    @Column(name = "mcr_foto_comp_impedancia")
    private byte[] mcrFotoCompImpedancia;
    @Lob
    @Column(name = "mcr_foto_tendencia_angulo")
    private byte[] mcrFotoTendenciaAngulo;
    @Lob
    @Column(name = "mcr_foto_tendencia_isolamento")
    private byte[] mcrFotoTendenciaIsolamento;
    
    @JoinColumn(name = "mca_medicao_mem_codigo", referencedColumnName = "mem_codigo")
    @ManyToOne(optional = false)
    //@JsonIgnore
    private McaMedicao mcaMedicao;  
    

    
    
    public McaRelatorio() {
    }

    public McaRelatorio(Long mcrCodigo) {
        this.mcrCodigo = mcrCodigo;
    }
    
    

    
    public McaRelatorio(int mcrNumero, String mcrFalha, String mcrParecerTecnico, String mcrAcaoProposta,
			float mcrResistenciaFasesR1, float mcrResistenciaFasesR2, float mcrResistenciaFasesR3,
			float mcrResistenciaFasesR, int mcrResistenciaFasesStatus, float mcrImpedanciaZ1, int mcrImpedanciaZ1Status,
			float mcrImpedanciaZ2, int mcrImpedanciaZ2Status, float mcrImpedanciaZ3, int mcrImpedanciaZ3Status,
			int mcrAnguloFi1, int mcrAnguloFi2, int mcrAnguloFi3, float mcrAnguloFi, int mcrAnguloFiStatus,
			int mcrAnguloIf1, int mcrAnguloIf2, int mcrAnguloIf3, float mcrAnguloIf, int mcrAnguloIfStatus,
			float mcrResistencia, int mcrResistenciaStatus, Date mcrDateInsert, String mcrUserInsert,
			float mcrImpedanciaL1, int mcrImpedanciaL1Status, float mcrImpedanciaL2, int mcrImpedanciaL2Status,
			float mcrImpedanciaL3, int mcrImpedanciaL3Status, String mcrNumeroOs,
			byte[] mcrFotoCompImpedancia, byte[] mcrFotoTendenciaAngulo, byte[] mcrFotoTendenciaIsolamento,
			McaMedicao mcaMedicao) {
		super();
		this.mcrNumero = mcrNumero;
		this.mcrFalha = mcrFalha;
		this.mcrParecerTecnico = mcrParecerTecnico;
		this.mcrAcaoProposta = mcrAcaoProposta;
		this.mcrResistenciaFasesR1 = mcrResistenciaFasesR1;
		this.mcrResistenciaFasesR2 = mcrResistenciaFasesR2;
		this.mcrResistenciaFasesR3 = mcrResistenciaFasesR3;
		this.mcrResistenciaFasesR = mcrResistenciaFasesR;
		this.mcrResistenciaFasesStatus = mcrResistenciaFasesStatus;
		this.mcrImpedanciaZ1 = mcrImpedanciaZ1;
		this.mcrImpedanciaZ1Status = mcrImpedanciaZ1Status;
		this.mcrImpedanciaZ2 = mcrImpedanciaZ2;
		this.mcrImpedanciaZ2Status = mcrImpedanciaZ2Status;
		this.mcrImpedanciaZ3 = mcrImpedanciaZ3;
		this.mcrImpedanciaZ3Status = mcrImpedanciaZ3Status;
		this.mcrAnguloFi1 = mcrAnguloFi1;
		this.mcrAnguloFi2 = mcrAnguloFi2;
		this.mcrAnguloFi3 = mcrAnguloFi3;
		this.mcrAnguloFi = mcrAnguloFi;
		this.mcrAnguloFiStatus = mcrAnguloFiStatus;
		this.mcrAnguloIf1 = mcrAnguloIf1;
		this.mcrAnguloIf2 = mcrAnguloIf2;
		this.mcrAnguloIf3 = mcrAnguloIf3;
		this.mcrAnguloIf = mcrAnguloIf;
		this.mcrAnguloIfStatus = mcrAnguloIfStatus;
		this.mcrResistencia = mcrResistencia;
		this.mcrResistenciaStatus = mcrResistenciaStatus;
		this.mcrDateInsert = mcrDateInsert;
		this.mcrUserInsert = mcrUserInsert;
		this.mcrImpedanciaL1 = mcrImpedanciaL1;
		this.mcrImpedanciaL1Status = mcrImpedanciaL1Status;
		this.mcrImpedanciaL2 = mcrImpedanciaL2;
		this.mcrImpedanciaL2Status = mcrImpedanciaL2Status;
		this.mcrImpedanciaL3 = mcrImpedanciaL3;
		this.mcrImpedanciaL3Status = mcrImpedanciaL3Status;
		this.mcrNumeroOs = mcrNumeroOs;
		this.mcrFotoCompImpedancia = mcrFotoCompImpedancia;
		this.mcrFotoTendenciaAngulo = mcrFotoTendenciaAngulo;
		this.mcrFotoTendenciaIsolamento = mcrFotoTendenciaIsolamento;
		this.mcaMedicao = mcaMedicao;
	}

	public Long getMcrCodigo() {
        return mcrCodigo;
    }

    public void setMcrCodigo(Long mcrCodigo) {
        this.mcrCodigo = mcrCodigo;
    }

    public int getMcrNumero() {
        return mcrNumero;
    }

    public void setMcrNumero(int mcrNumero) {
        this.mcrNumero = mcrNumero;
    }

    public String getMcrFalha() {
        return mcrFalha;
    }

    public void setMcrFalha(String mcrFalha) {
        this.mcrFalha = mcrFalha;
    }

    public String getMcrParecerTecnico() {
        return mcrParecerTecnico;
    }

    public void setMcrParecerTecnico(String mcrParecerTecnico) {
        this.mcrParecerTecnico = mcrParecerTecnico;
    }

    public String getMcrAcaoProposta() {
        return mcrAcaoProposta;
    }

    public void setMcrAcaoProposta(String mcrAcaoProposta) {
        this.mcrAcaoProposta = mcrAcaoProposta;
    }

    public float getMcrResistenciaFasesR1() {
        return mcrResistenciaFasesR1;
    }

    public void setMcrResistenciaFasesR1(float mcrResistenciaFasesR1) {
        this.mcrResistenciaFasesR1 = mcrResistenciaFasesR1;
    }

    public float getMcrResistenciaFasesR2() {
        return mcrResistenciaFasesR2;
    }

    public void setMcrResistenciaFasesR2(float mcrResistenciaFasesR2) {
        this.mcrResistenciaFasesR2 = mcrResistenciaFasesR2;
    }

    public float getMcrResistenciaFasesR3() {
        return mcrResistenciaFasesR3;
    }

    public void setMcrResistenciaFasesR3(float mcrResistenciaFasesR3) {
        this.mcrResistenciaFasesR3 = mcrResistenciaFasesR3;
    }

    public float getMcrResistenciaFasesR() {
        return mcrResistenciaFasesR;
    }

    public void setMcrResistenciaFasesR(float mcrResistenciaFasesR) {
        this.mcrResistenciaFasesR = mcrResistenciaFasesR;
    }

    public int getMcrResistenciaFasesStatus() {
        return mcrResistenciaFasesStatus;
    }

    public void setMcrResistenciaFasesStatus(int mcrResistenciaFasesStatus) {
        this.mcrResistenciaFasesStatus = mcrResistenciaFasesStatus;
    }

    public float getMcrImpedanciaZ1() {
        return mcrImpedanciaZ1;
    }

    public void setMcrImpedanciaZ1(float mcrImpedanciaZ1) {
        this.mcrImpedanciaZ1 = mcrImpedanciaZ1;
    }

    public int getMcrImpedanciaZ1Status() {
        return mcrImpedanciaZ1Status;
    }

    public void setMcrImpedanciaZ1Status(int mcrImpedanciaZ1Status) {
        this.mcrImpedanciaZ1Status = mcrImpedanciaZ1Status;
    }

    public float getMcrImpedanciaZ2() {
        return mcrImpedanciaZ2;
    }

    public void setMcrImpedanciaZ2(float mcrImpedanciaZ2) {
        this.mcrImpedanciaZ2 = mcrImpedanciaZ2;
    }

    public int getMcrImpedanciaZ2Status() {
        return mcrImpedanciaZ2Status;
    }

    public void setMcrImpedanciaZ2Status(int mcrImpedanciaZ2Status) {
        this.mcrImpedanciaZ2Status = mcrImpedanciaZ2Status;
    }

    public float getMcrImpedanciaZ3() {
        return mcrImpedanciaZ3;
    }

    public void setMcrImpedanciaZ3(float mcrImpedanciaZ3) {
        this.mcrImpedanciaZ3 = mcrImpedanciaZ3;
    }

    public int getMcrImpedanciaZ3Status() {
        return mcrImpedanciaZ3Status;
    }

    public void setMcrImpedanciaZ3Status(int mcrImpedanciaZ3Status) {
        this.mcrImpedanciaZ3Status = mcrImpedanciaZ3Status;
    }

    public int getMcrAnguloFi1() {
        return mcrAnguloFi1;
    }

    public void setMcrAnguloFi1(int mcrAnguloFi1) {
        this.mcrAnguloFi1 = mcrAnguloFi1;
    }

    public int getMcrAnguloFi2() {
        return mcrAnguloFi2;
    }

    public void setMcrAnguloFi2(int mcrAnguloFi2) {
        this.mcrAnguloFi2 = mcrAnguloFi2;
    }

    public int getMcrAnguloFi3() {
        return mcrAnguloFi3;
    }

    public void setMcrAnguloFi3(int mcrAnguloFi3) {
        this.mcrAnguloFi3 = mcrAnguloFi3;
    }

    public float getMcrAnguloFi() {
        return mcrAnguloFi;
    }

    public void setMcrAnguloFi(float mcrAnguloFi) {
        this.mcrAnguloFi = mcrAnguloFi;
    }

    public int getMcrAnguloFiStatus() {
        return mcrAnguloFiStatus;
    }

    public void setMcrAnguloFiStatus(int mcrAnguloFiStatus) {
        this.mcrAnguloFiStatus = mcrAnguloFiStatus;
    }

    public int getMcrAnguloIf1() {
        return mcrAnguloIf1;
    }

    public void setMcrAnguloIf1(int mcrAnguloIf1) {
        this.mcrAnguloIf1 = mcrAnguloIf1;
    }

    public int getMcrAnguloIf2() {
        return mcrAnguloIf2;
    }

    public void setMcrAnguloIf2(int mcrAnguloIf2) {
        this.mcrAnguloIf2 = mcrAnguloIf2;
    }

    public int getMcrAnguloIf3() {
        return mcrAnguloIf3;
    }

    public void setMcrAnguloIf3(int mcrAnguloIf3) {
        this.mcrAnguloIf3 = mcrAnguloIf3;
    }

    public float getMcrAnguloIf() {
        return mcrAnguloIf;
    }

    public void setMcrAnguloIf(float mcrAnguloIf) {
        this.mcrAnguloIf = mcrAnguloIf;
    }

    public int getMcrAnguloIfStatus() {
        return mcrAnguloIfStatus;
    }

    public void setMcrAnguloIfStatus(int mcrAnguloIfStatus) {
        this.mcrAnguloIfStatus = mcrAnguloIfStatus;
    }

    public float getMcrResistencia() {
        return mcrResistencia;
    }

    public void setMcrResistencia(float mcrResistencia) {
        this.mcrResistencia = mcrResistencia;
    }

    public int getMcrResistenciaStatus() {
        return mcrResistenciaStatus;
    }

    public void setMcrResistenciaStatus(int mcrResistenciaStatus) {
        this.mcrResistenciaStatus = mcrResistenciaStatus;
    }

    public byte[] getMcrFotoCompImpedancia() {
        return mcrFotoCompImpedancia;
    }

    
    public Date getMcrDateInsert() {
        return mcrDateInsert;
    }

    public void setMcrDateInsert(Date mcrDateInsert) {
        this.mcrDateInsert = mcrDateInsert;
    }

    public String getMcrUserInsert() {
        return mcrUserInsert;
    }

    public void setMcrUserInsert(String mcrUserInsert) {
        this.mcrUserInsert = mcrUserInsert;
    }

    public float getMcrImpedanciaL1() {
        return mcrImpedanciaL1;
    }

    public void setMcrImpedanciaL1(float mcrImpedanciaL1) {
        this.mcrImpedanciaL1 = mcrImpedanciaL1;
    }

    public int getMcrImpedanciaL1Status() {
        return mcrImpedanciaL1Status;
    }

    public void setMcrImpedanciaL1Status(int mcrImpedanciaL1Status) {
        this.mcrImpedanciaL1Status = mcrImpedanciaL1Status;
    }

    public float getMcrImpedanciaL2() {
        return mcrImpedanciaL2;
    }

    public void setMcrImpedanciaL2(float mcrImpedanciaL2) {
        this.mcrImpedanciaL2 = mcrImpedanciaL2;
    }

    public int getMcrImpedanciaL2Status() {
        return mcrImpedanciaL2Status;
    }

    public void setMcrImpedanciaL2Status(int mcrImpedanciaL2Status) {
        this.mcrImpedanciaL2Status = mcrImpedanciaL2Status;
    }

    public float getMcrImpedanciaL3() {
        return mcrImpedanciaL3;
    }

    public void setMcrImpedanciaL3(float mcrImpedanciaL3) {
        this.mcrImpedanciaL3 = mcrImpedanciaL3;
    }

    public int getMcrImpedanciaL3Status() {
        return mcrImpedanciaL3Status;
    }

    public void setMcrImpedanciaL3Status(int mcrImpedanciaL3Status) {
        this.mcrImpedanciaL3Status = mcrImpedanciaL3Status;
    }

    
    public String getMcrNumeroOs() {
        return mcrNumeroOs;
    }

    public void setMcrNumeroOs(String mcrNumeroOs) {
        this.mcrNumeroOs = mcrNumeroOs;
    }
    
    
    public byte[] getMcrFotoTendenciaAngulo() {
		return mcrFotoTendenciaAngulo;
	}

	public void setMcrFotoTendenciaAngulo(byte[] mcrFotoTendenciaAngulo) {
		this.mcrFotoTendenciaAngulo = mcrFotoTendenciaAngulo;
	}

	public byte[] getMcrFotoTendenciaIsolamento() {
		return mcrFotoTendenciaIsolamento;
	}

	public void setMcrFotoTendenciaIsolamento(byte[] mcrFotoTendenciaIsolamento) {
		this.mcrFotoTendenciaIsolamento = mcrFotoTendenciaIsolamento;
	}

	public void setMcrFotoCompImpedancia(byte[] mcrFotoCompImpedancia) {
		this.mcrFotoCompImpedancia = mcrFotoCompImpedancia;
	}
	
	

	public McaMedicao getMcaMedicao() {
		return mcaMedicao;
	}

	public void setMcaMedicao(McaMedicao mcaMedicao) {
		this.mcaMedicao = mcaMedicao;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (mcrCodigo != null ? mcrCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof McaRelatorio)) {
            return false;
        }
        McaRelatorio other = (McaRelatorio) object;
        if ((this.mcrCodigo == null && other.mcrCodigo != null) || (this.mcrCodigo != null && !this.mcrCodigo.equals(other.mcrCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.McaRelatorio[ mcrCodigo=" + mcrCodigo + " ]";
    }

    
}

