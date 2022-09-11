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

/**
 *
 * @author rranthum
 */
@Entity
@Table(name = "analise_oleo")
public class AnaliseOleo implements Serializable {

    

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ano_codigo")
    private Integer anoCodigo;
    @Basic(optional = false)
    @Column(name = "ano_numero")
    private int anoNumero;
    @Basic(optional = false)
    @Column(name = "ano_tecnico")
    private String anoTecnico;
    @Basic(optional = false)
    @Lob
    @Column(name = "ano_contaminacao")
    private String anoContaminacao;
    @Basic(optional = false)
    @Lob
    @Column(name = "ano_desgaste")
    private String anoDesgaste;
    @Basic(optional = false)
    @Lob
    @Column(name = "ano_viscosidade")
    private String anoViscosidade;
    @Basic(optional = false)
    @Lob
    @Column(name = "ano_observacao")
    private String anoObservacao;
    @Basic(optional = false)
    @Column(name = "ano_numero_documento_analise")
    private String anoNumeroDocumentoAnalise;
    @Basic(optional = false)
    @Column(name = "ano_numero_os")
    private String anoNumeroOs;
    @Column(name = "ano_pos_havia_falha")
    private Integer anoPosHaviaFalha;
    @Lob
    @Column(name = "ano_pos_havia_falha_obs")
    private String anoPosHaviaFalhaObs;
    @Column(name = "ano_pos_diagnostico_falha")
    private Integer anoPosDiagnosticoFalha;
    @Lob
    @Column(name = "ano_pos_diagnostico_falha_obs")
    private String anoPosDiagnosticoFalhaObs;
    @Column(name = "ano_pos_trabalho_alem")
    private Integer anoPosTrabalhoAlem;
    @Lob
    @Column(name = "ano_pos_trabalho_alem_obs")
    private String anoPosTrabalhoAlemObs;
    @Column(name = "ano_pos_data_intervencao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date anoPosDataIntervencao;
    @Column(name = "ano_pos_tempo_execucao")
    private String anoPosTempoExecucao;
    @Column(name = "ano_pos_responsavel")
    private String anoPosResponsavel;
    @Column(name = "ano_pos_avaliado")
    @Temporal(TemporalType.TIMESTAMP)
    private Date anoPosAvaliado;
    @Column(name = "ano_pos_status_avaliacao")
    private Integer anoPosStatusAvaliacao;
    @Column(name = "ano_pos_baixada")
    @Temporal(TemporalType.TIMESTAMP)
    private Date anoPosBaixada;
    @Lob
    @Column(name = "ano_pos_baixada_observacao")
    private String anoPosBaixadaObservacao;
    @Basic(optional = false)
    @Column(name = "ano_date_insert")
    @Temporal(TemporalType.TIMESTAMP)
    private Date anoDateInsert;
    @Basic(optional = false)
    @Column(name = "ano_user_insert")
    private String anoUserInsert;
    @Basic(optional = false)
    @Column(name = "ano_pos_numero_os")
    private String anoPosNumeroOs;
    @Column(name = "ano_nome_arquivo")
    private String anoNomeArquivo;
    @Lob
    @Column(name = "ano_arquivo")
    private byte[] anoArquivo;
    
    @JoinColumn(name = "medicao_med_codigo", referencedColumnName = "med_codigo")
    @ManyToOne(optional = false)
    //@JsonIgnore
    private Medicao medicao; 
    
    
    
    public AnaliseOleo() {
    }

    public AnaliseOleo(Integer anoCodigo) {
        this.anoCodigo = anoCodigo;
    }

    

    public AnaliseOleo(Integer anoCodigo, int anoNumero, String anoTecnico, String anoContaminacao, String anoDesgaste,
			String anoViscosidade, String anoObservacao, String anoNumeroDocumentoAnalise, String anoNumeroOs,
			Integer anoPosHaviaFalha, String anoPosHaviaFalhaObs, Integer anoPosDiagnosticoFalha,
			String anoPosDiagnosticoFalhaObs, Integer anoPosTrabalhoAlem, String anoPosTrabalhoAlemObs,
			Date anoPosDataIntervencao, String anoPosTempoExecucao, String anoPosResponsavel, Date anoPosAvaliado,
			Integer anoPosStatusAvaliacao, Date anoPosBaixada, String anoPosBaixadaObservacao, Date anoDateInsert,
			String anoUserInsert, String anoPosNumeroOs, String anoNomeArquivo, Medicao medicao) {
		super();
		this.anoCodigo = anoCodigo;
		this.anoNumero = anoNumero;
		this.anoTecnico = anoTecnico;
		this.anoContaminacao = anoContaminacao;
		this.anoDesgaste = anoDesgaste;
		this.anoViscosidade = anoViscosidade;
		this.anoObservacao = anoObservacao;
		this.anoNumeroDocumentoAnalise = anoNumeroDocumentoAnalise;
		this.anoNumeroOs = anoNumeroOs;
		this.anoPosHaviaFalha = anoPosHaviaFalha;
		this.anoPosHaviaFalhaObs = anoPosHaviaFalhaObs;
		this.anoPosDiagnosticoFalha = anoPosDiagnosticoFalha;
		this.anoPosDiagnosticoFalhaObs = anoPosDiagnosticoFalhaObs;
		this.anoPosTrabalhoAlem = anoPosTrabalhoAlem;
		this.anoPosTrabalhoAlemObs = anoPosTrabalhoAlemObs;
		this.anoPosDataIntervencao = anoPosDataIntervencao;
		this.anoPosTempoExecucao = anoPosTempoExecucao;
		this.anoPosResponsavel = anoPosResponsavel;
		this.anoPosAvaliado = anoPosAvaliado;
		this.anoPosStatusAvaliacao = anoPosStatusAvaliacao;
		this.anoPosBaixada = anoPosBaixada;
		this.anoPosBaixadaObservacao = anoPosBaixadaObservacao;
		this.anoDateInsert = anoDateInsert;
		this.anoUserInsert = anoUserInsert;
		this.anoPosNumeroOs = anoPosNumeroOs;
		this.anoNomeArquivo = anoNomeArquivo;
		this.medicao = medicao;
	}

	public Integer getAnoCodigo() {
        return anoCodigo;
    }

    public void setAnoCodigo(Integer anoCodigo) {
        this.anoCodigo = anoCodigo;
    }

    public int getAnoNumero() {
        return anoNumero;
    }

    public void setAnoNumero(int anoNumero) {
        this.anoNumero = anoNumero;
    }

    public String getAnoTecnico() {
        return anoTecnico;
    }

    public void setAnoTecnico(String anoTecnico) {
        this.anoTecnico = anoTecnico;
    }

    public String getAnoContaminacao() {
        return anoContaminacao;
    }

    public void setAnoContaminacao(String anoContaminacao) {
        this.anoContaminacao = anoContaminacao;
    }

    public String getAnoDesgaste() {
        return anoDesgaste;
    }

    public void setAnoDesgaste(String anoDesgaste) {
        this.anoDesgaste = anoDesgaste;
    }

    public String getAnoViscosidade() {
        return anoViscosidade;
    }

    public void setAnoViscosidade(String anoViscosidade) {
        this.anoViscosidade = anoViscosidade;
    }

    public String getAnoObservacao() {
        return anoObservacao;
    }

    public void setAnoObservacao(String anoObservacao) {
        this.anoObservacao = anoObservacao;
    }

    public byte[] getAnoArquivo() {
        return anoArquivo;
    }

    public void setAnoArquivo(byte[] anoArquivo) {
        this.anoArquivo = anoArquivo;
    }

    public String getAnoNumeroDocumentoAnalise() {
        return anoNumeroDocumentoAnalise;
    }

    public void setAnoNumeroDocumentoAnalise(String anoNumeroDocumentoAnalise) {
        this.anoNumeroDocumentoAnalise = anoNumeroDocumentoAnalise;
    }

    public String getAnoNumeroOs() {
        return anoNumeroOs;
    }

    public void setAnoNumeroOs(String anoNumeroOs) {
        this.anoNumeroOs = anoNumeroOs;
    }

    public Integer getAnoPosHaviaFalha() {
        return anoPosHaviaFalha;
    }

    public void setAnoPosHaviaFalha(Integer anoPosHaviaFalha) {
        this.anoPosHaviaFalha = anoPosHaviaFalha;
    }

    public String getAnoPosHaviaFalhaObs() {
        return anoPosHaviaFalhaObs;
    }

    public void setAnoPosHaviaFalhaObs(String anoPosHaviaFalhaObs) {
        this.anoPosHaviaFalhaObs = anoPosHaviaFalhaObs;
    }

    public Integer getAnoPosDiagnosticoFalha() {
        return anoPosDiagnosticoFalha;
    }

    public void setAnoPosDiagnosticoFalha(Integer anoPosDiagnosticoFalha) {
        this.anoPosDiagnosticoFalha = anoPosDiagnosticoFalha;
    }

    public String getAnoPosDiagnosticoFalhaObs() {
        return anoPosDiagnosticoFalhaObs;
    }

    public void setAnoPosDiagnosticoFalhaObs(String anoPosDiagnosticoFalhaObs) {
        this.anoPosDiagnosticoFalhaObs = anoPosDiagnosticoFalhaObs;
    }

    public Integer getAnoPosTrabalhoAlem() {
        return anoPosTrabalhoAlem;
    }

    public void setAnoPosTrabalhoAlem(Integer anoPosTrabalhoAlem) {
        this.anoPosTrabalhoAlem = anoPosTrabalhoAlem;
    }

    public String getAnoPosTrabalhoAlemObs() {
        return anoPosTrabalhoAlemObs;
    }

    public void setAnoPosTrabalhoAlemObs(String anoPosTrabalhoAlemObs) {
        this.anoPosTrabalhoAlemObs = anoPosTrabalhoAlemObs;
    }

    public Date getAnoPosDataIntervencao() {
        return anoPosDataIntervencao;
    }

    public void setAnoPosDataIntervencao(Date anoPosDataIntervencao) {
        this.anoPosDataIntervencao = anoPosDataIntervencao;
    }

    public String getAnoPosTempoExecucao() {
        return anoPosTempoExecucao;
    }

    public void setAnoPosTempoExecucao(String anoPosTempoExecucao) {
        this.anoPosTempoExecucao = anoPosTempoExecucao;
    }

    public String getAnoPosResponsavel() {
        return anoPosResponsavel;
    }

    public void setAnoPosResponsavel(String anoPosResponsavel) {
        this.anoPosResponsavel = anoPosResponsavel;
    }

    public Date getAnoPosAvaliado() {
        return anoPosAvaliado;
    }

    public void setAnoPosAvaliado(Date anoPosAvaliado) {
        this.anoPosAvaliado = anoPosAvaliado;
    }

    public Integer getAnoPosStatusAvaliacao() {
        return anoPosStatusAvaliacao;
    }

    public void setAnoPosStatusAvaliacao(Integer anoPosStatusAvaliacao) {
        this.anoPosStatusAvaliacao = anoPosStatusAvaliacao;
    }

    public Date getAnoPosBaixada() {
        return anoPosBaixada;
    }

    public void setAnoPosBaixada(Date anoPosBaixada) {
        this.anoPosBaixada = anoPosBaixada;
    }

    public String getAnoPosBaixadaObservacao() {
        return anoPosBaixadaObservacao;
    }

    public void setAnoPosBaixadaObservacao(String anoPosBaixadaObservacao) {
        this.anoPosBaixadaObservacao = anoPosBaixadaObservacao;
    }

    public Date getAnoDateInsert() {
        return anoDateInsert;
    }

    public void setAnoDateInsert(Date anoDateInsert) {
        this.anoDateInsert = anoDateInsert;
    }

    public String getAnoUserInsert() {
        return anoUserInsert;
    }

    public void setAnoUserInsert(String anoUserInsert) {
        this.anoUserInsert = anoUserInsert;
    }

    public String getAnoPosNumeroOs() {
        return anoPosNumeroOs;
    }

    public void setAnoPosNumeroOs(String anoPosNumeroOs) {
        this.anoPosNumeroOs = anoPosNumeroOs;
    }

    public String getAnoNomeArquivo() {
        return anoNomeArquivo;
    }

    public void setAnoNomeArquivo(String anoNomeArquivo) {
        this.anoNomeArquivo = anoNomeArquivo;
    }
    
    

    
    public Medicao getMedicao() {
		return medicao;
	}

	public void setMedicao(Medicao medicao) {
		this.medicao = medicao;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (anoCodigo != null ? anoCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AnaliseOleo)) {
            return false;
        }
        AnaliseOleo other = (AnaliseOleo) object;
        if ((this.anoCodigo == null && other.anoCodigo != null) || (this.anoCodigo != null && !this.anoCodigo.equals(other.anoCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.AnaliseOleo[ anoCodigo=" + anoCodigo + " ]";
    }

    
    
}

