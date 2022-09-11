package com.br.predponta.app.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name = "inspecao_termografica")
public class InspecaoTermografica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ite_codigo")
    private Integer iteCodigo;
    @Column(name = "ite_posicao")
    private String itePosicao;
    @Column(name = "ite_fase")
    private String iteFase;
    @Column(name = "ite_falha")
    private String iteFalha;
    @Column(name = "ite_acao_proposta")
    private String iteAcaoProposta;
    @Column(name = "ite_foto_camera")
    private String iteFotoCamera;
    @Column(name = "ite_foto_termografica")
    private String iteFotoTermografica;
    @Column(name = "ite_pos_havia_falha")
    private Integer itePosHaviaFalha;
    @Lob
    @Column(name = "ite_pos_havia_falha_obs")
    private String itePosHaviaFalhaObs;
    @Column(name = "ite_pos_diagnostico_falha")
    private Integer itePosDiagnosticoFalha;
    @Lob
    @Column(name = "ite_pos_diagnostico_falha_obs")
    private String itePosDiagnosticoFalhaObs;
    @Column(name = "ite_pos_trabalho_alem")
    private Integer itePosTrabalhoAlem;
    @Lob
    @Column(name = "ite_pos_trabalho_alem_obs")
    private String itePosTrabalhoAlemObs;
    @Column(name = "ite_pos_data_intervencao")
    @Temporal(TemporalType.DATE)
    private Date itePosDataIntervencao;
    @Column(name = "ite_pos_tempo_execucao")
    @Temporal(TemporalType.DATE)
    private Date itePosTempoExecucao;
    @Column(name = "ite_pos_responsavel")
    private String itePosResponsavel;
    @Column(name = "ite_pos_numero_os")
    private String itePosNumeroOs;
    @Column(name = "ite_pos_avaliacao_it")
    private Integer itePosAvaliacaoIt;
    @Column(name = "ite_data_avaliacao")
    @Temporal(TemporalType.DATE)
    private Date iteDataAvaliacao;
    @Column(name = "ite_status")
    private int iteStatus;
    @Column(name = "ite_data_criacao")
    @Temporal(TemporalType.DATE)
    private Date iteDataCriacao;
    @Column(name = "ite_tipo")
    private int iteTipo;
    @Column(name = "ite_foto_painel")
    private String iteFotoPainel;
    @Column(name = "ite_foto_painel_desc")
    private String iteFotoPainelDesc;
    @Column(name = "ite_data_baixa")
    @Temporal(TemporalType.DATE)
    private Date iteDataBaixa;
    @Column(name = "ite_prazo_execucao")
    private String itePrazoExecucao;
    @Column(name = "ite_equipamentos")
    private String iteEquipamentos;
    @Column(name = "ite_tecnico_responsavel")
    private Integer iteTecnicoResponsavel;
    @Column(name = "ite_numero_os")
    private String iteNumeroOs;
    @Column(name = "ite_custo_preditiva")
    private double iteCustoPreditiva;
    @Column(name = "ite_custo_corretiva")
    private double iteCustoCorretiva;
    @Column(name = "ite_quebra_equipamento")
    private int iteQuebraEquipamento;
    @Column(name = "ite_painel_num_portas")
    private Integer itePainelNumPortas;
    
//### Relacionamentos ###
    
    @JoinColumn(name = "medicao_med_codigo", referencedColumnName = "med_codigo")
    @ManyToOne(optional = false)
    //@JsonIgnore
    private Medicao medicao;   
    
//
    
    
    
        public InspecaoTermografica() {
    }
    
    
    public InspecaoTermografica(Integer iteCodigo, String itePosicao, String iteFase, String iteFalha,
		String iteAcaoProposta, String iteFotoCamera, String iteFotoTermografica, Integer itePosHaviaFalha,
		String itePosHaviaFalhaObs, Integer itePosDiagnosticoFalha, String itePosDiagnosticoFalhaObs,
		Integer itePosTrabalhoAlem, String itePosTrabalhoAlemObs, Date itePosDataIntervencao, Date itePosTempoExecucao,
		String itePosResponsavel, String itePosNumeroOs, Integer itePosAvaliacaoIt, Date iteDataAvaliacao,
		int iteStatus, Date iteDataCriacao, int iteTipo, String iteFotoPainel, String iteFotoPainelDesc,
		Date iteDataBaixa, String itePrazoExecucao, String iteEquipamentos, Integer iteTecnicoResponsavel,
		String iteNumeroOs, double iteCustoPreditiva, double iteCustoCorretiva, int iteQuebraEquipamento,
		Integer itePainelNumPortas, Medicao medicao) {
	super();
	this.iteCodigo = iteCodigo;
	this.itePosicao = itePosicao;
	this.iteFase = iteFase;
	this.iteFalha = iteFalha;
	this.iteAcaoProposta = iteAcaoProposta;
	this.iteFotoCamera = iteFotoCamera;
	this.iteFotoTermografica = iteFotoTermografica;
	this.itePosHaviaFalha = itePosHaviaFalha;
	this.itePosHaviaFalhaObs = itePosHaviaFalhaObs;
	this.itePosDiagnosticoFalha = itePosDiagnosticoFalha;
	this.itePosDiagnosticoFalhaObs = itePosDiagnosticoFalhaObs;
	this.itePosTrabalhoAlem = itePosTrabalhoAlem;
	this.itePosTrabalhoAlemObs = itePosTrabalhoAlemObs;
	this.itePosDataIntervencao = itePosDataIntervencao;
	this.itePosTempoExecucao = itePosTempoExecucao;
	this.itePosResponsavel = itePosResponsavel;
	this.itePosNumeroOs = itePosNumeroOs;
	this.itePosAvaliacaoIt = itePosAvaliacaoIt;
	this.iteDataAvaliacao = iteDataAvaliacao;
	this.iteStatus = iteStatus;
	this.iteDataCriacao = iteDataCriacao;
	this.iteTipo = iteTipo;
	this.iteFotoPainel = iteFotoPainel;
	this.iteFotoPainelDesc = iteFotoPainelDesc;
	this.iteDataBaixa = iteDataBaixa;
	this.itePrazoExecucao = itePrazoExecucao;
	this.iteEquipamentos = iteEquipamentos;
	this.iteTecnicoResponsavel = iteTecnicoResponsavel;
	this.iteNumeroOs = iteNumeroOs;
	this.iteCustoPreditiva = iteCustoPreditiva;
	this.iteCustoCorretiva = iteCustoCorretiva;
	this.iteQuebraEquipamento = iteQuebraEquipamento;
	this.itePainelNumPortas = itePainelNumPortas;
	this.medicao = medicao;
}


	public Integer getIteCodigo() {
		return iteCodigo;
	}



	public void setIteCodigo(Integer iteCodigo) {
		this.iteCodigo = iteCodigo;
	}



	public String getItePosicao() {
        return itePosicao;
    }

    public void setItePosicao(String itePosicao) {
        this.itePosicao = itePosicao;
    }

    public String getIteFase() {
        return iteFase;
    }

    public void setIteFase(String iteFase) {
        this.iteFase = iteFase;
    }

    public String getIteFalha() {
        return iteFalha;
    }

    public void setIteFalha(String iteFalha) {
        this.iteFalha = iteFalha;
    }

    public String getIteAcaoProposta() {
        return iteAcaoProposta;
    }

    public void setIteAcaoProposta(String iteAcaoProposta) {
        this.iteAcaoProposta = iteAcaoProposta;
    }

    public String getIteFotoCamera() {
        return iteFotoCamera;
    }

    public void setIteFotoCamera(String iteFotoCamera) {
        this.iteFotoCamera = iteFotoCamera;
    }

    public String getIteFotoTermografica() {
        return iteFotoTermografica;
    }

    public void setIteFotoTermografica(String iteFotoTermografica) {
        this.iteFotoTermografica = iteFotoTermografica;
    }

    public Integer getItePosHaviaFalha() {
        return itePosHaviaFalha;
    }

    public void setItePosHaviaFalha(Integer itePosHaviaFalha) {
        this.itePosHaviaFalha = itePosHaviaFalha;
    }

    public String getItePosHaviaFalhaObs() {
        return itePosHaviaFalhaObs;
    }

    public void setItePosHaviaFalhaObs(String itePosHaviaFalhaObs) {
        this.itePosHaviaFalhaObs = itePosHaviaFalhaObs;
    }

    public Integer getItePosDiagnosticoFalha() {
        return itePosDiagnosticoFalha;
    }

    public void setItePosDiagnosticoFalha(Integer itePosDiagnosticoFalha) {
        this.itePosDiagnosticoFalha = itePosDiagnosticoFalha;
    }

    public String getItePosDiagnosticoFalhaObs() {
        return itePosDiagnosticoFalhaObs;
    }

    public void setItePosDiagnosticoFalhaObs(String itePosDiagnosticoFalhaObs) {
        this.itePosDiagnosticoFalhaObs = itePosDiagnosticoFalhaObs;
    }

    public Integer getItePosTrabalhoAlem() {
        return itePosTrabalhoAlem;
    }

    public void setItePosTrabalhoAlem(Integer itePosTrabalhoAlem) {
        this.itePosTrabalhoAlem = itePosTrabalhoAlem;
    }

    public String getItePosTrabalhoAlemObs() {
        return itePosTrabalhoAlemObs;
    }

    public void setItePosTrabalhoAlemObs(String itePosTrabalhoAlemObs) {
        this.itePosTrabalhoAlemObs = itePosTrabalhoAlemObs;
    }

    public Date getItePosDataIntervencao() {
        return itePosDataIntervencao;
    }

    public void setItePosDataIntervencao(Date itePosDataIntervencao) {
        this.itePosDataIntervencao = itePosDataIntervencao;
    }

    public Date getItePosTempoExecucao() {
        return itePosTempoExecucao;
    }

    public void setItePosTempoExecucao(Date itePosTempoExecucao) {
        this.itePosTempoExecucao = itePosTempoExecucao;
    }

    public String getItePosResponsavel() {
        return itePosResponsavel;
    }

    public void setItePosResponsavel(String itePosResponsavel) {
        this.itePosResponsavel = itePosResponsavel;
    }

    public String getItePosNumeroOs() {
        return itePosNumeroOs;
    }

    public void setItePosNumeroOs(String itePosNumeroOs) {
        this.itePosNumeroOs = itePosNumeroOs;
    }

    public Integer getItePosAvaliacaoIt() {
        return itePosAvaliacaoIt;
    }

    public void setItePosAvaliacaoIt(Integer itePosAvaliacaoIt) {
        this.itePosAvaliacaoIt = itePosAvaliacaoIt;
    }

    public Date getIteDataAvaliacao() {
        return iteDataAvaliacao;
    }

    public void setIteDataAvaliacao(Date iteDataAvaliacao) {
        this.iteDataAvaliacao = iteDataAvaliacao;
    }

    public int getIteStatus() {
        return iteStatus;
    }

    public void setIteStatus(int iteStatus) {
        this.iteStatus = iteStatus;
    }

    public Date getIteDataCriacao() {
        return iteDataCriacao;
    }

    public void setIteDataCriacao(Date iteDataCriacao) {
        this.iteDataCriacao = iteDataCriacao;
    }

    public int getIteTipo() {
        return iteTipo;
    }

    public void setIteTipo(int iteTipo) {
        this.iteTipo = iteTipo;
    }

    public String getIteFotoPainel() {
        return iteFotoPainel;
    }

    public void setIteFotoPainel(String iteFotoPainel) {
        this.iteFotoPainel = iteFotoPainel;
    }

    public String getIteFotoPainelDesc() {
        return iteFotoPainelDesc;
    }

    public void setIteFotoPainelDesc(String iteFotoPainelDesc) {
        this.iteFotoPainelDesc = iteFotoPainelDesc;
    }

    public Date getIteDataBaixa() {
        return iteDataBaixa;
    }

    public void setIteDataBaixa(Date iteDataBaixa) {
        this.iteDataBaixa = iteDataBaixa;
    }

    public String getItePrazoExecucao() {
        return itePrazoExecucao;
    }

    public void setItePrazoExecucao(String itePrazoExecucao) {
        this.itePrazoExecucao = itePrazoExecucao;
    }

    public String getIteEquipamentos() {
        return iteEquipamentos;
    }

    public void setIteEquipamentos(String iteEquipamentos) {
        this.iteEquipamentos = iteEquipamentos;
    }

    public Integer getIteTecnicoResponsavel() {
        return iteTecnicoResponsavel;
    }

    public void setIteTecnicoResponsavel(Integer iteTecnicoResponsavel) {
        this.iteTecnicoResponsavel = iteTecnicoResponsavel;
    }

    public String getIteNumeroOs() {
        return iteNumeroOs;
    }

    public void setIteNumeroOs(String iteNumeroOs) {
        this.iteNumeroOs = iteNumeroOs;
    }

    public double getIteCustoPreditiva() {
        return iteCustoPreditiva;
    }

    public void setIteCustoPreditiva(double iteCustoPreditiva) {
        this.iteCustoPreditiva = iteCustoPreditiva;
    }

    public double getIteCustoCorretiva() {
        return iteCustoCorretiva;
    }

    public void setIteCustoCorretiva(double iteCustoCorretiva) {
        this.iteCustoCorretiva = iteCustoCorretiva;
    }

    public int getIteQuebraEquipamento() {
        return iteQuebraEquipamento;
    }

    public void setIteQuebraEquipamento(int iteQuebraEquipamento) {
        this.iteQuebraEquipamento = iteQuebraEquipamento;
    }

    public Integer getItePainelNumPortas() {
        return itePainelNumPortas;
    }

    public void setItePainelNumPortas(Integer itePainelNumPortas) {
        this.itePainelNumPortas = itePainelNumPortas;
    }

    



	public Medicao getMedicao() {
		return medicao;
	}


	public void setMedicao(Medicao medicao) {
		this.medicao = medicao;
	}


	@Override
	public int hashCode() {
		return Objects.hash(iteCodigo);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InspecaoTermografica other = (InspecaoTermografica) obj;
		return Objects.equals(iteCodigo, other.iteCodigo);
	}
    
    

    
       
    
}

