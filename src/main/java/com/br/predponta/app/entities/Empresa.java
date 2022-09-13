package com.br.predponta.app.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;


@Entity
@Table(name = "empresa")
public class Empresa implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "emp_codigo")
    private Integer empCodigo;
    @Basic(optional = false)
    //@NotNull
    @Size(min = 1, max = 80)
    @Column(name = "emp_nome")
    private String empNome;
    @Basic(optional = false)
   // @NotNull
    @Column(name = "emp_status")
    private Boolean empStatus;
    @Size(max = 90)
    @Column(name = "emp_logo")
    private String empLogo;
    @Basic(optional = false)
   // @NotNull
    @Column(name = "emp_periodicidade_it")
    private int empPeriodicidadeIt;
    @Basic(optional = false)
  //  @NotNull
    @Column(name = "emp_periodicidade_ri")
    private int empPeriodicidadeRi;
    @Basic(optional = false)
   // @NotNull
    @Column(name = "emp_periodicidade_mca")
    private int empPeriodicidadeMca;
    @Basic(optional = false)
  //  @NotNull
    @Column(name = "emp_prox_medicao_it")
    @Temporal(TemporalType.DATE)
    private Date empProxMedicaoIt;
    @Basic(optional = false)
   // @NotNull
    @Column(name = "emp_prox_medicao_ri")
    @Temporal(TemporalType.DATE)
    private Date empProxMedicaoRi;
    @Basic(optional = false)
  //  @NotNull
    @Column(name = "emp_prox_medicao_mca")
    @Temporal(TemporalType.DATE)
    private Date empProxMedicaoMca;
    
    @Column(columnDefinition = "TIMESTAMP WIHOUT TIME ZONE")
    private Instant createdAt;
    
    @Column(columnDefinition = "TIMESTAMP WIHOUT TIME ZONE")
    private Instant updateAt;
    
//### Relacionamentos ###
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empresa")
    private List<ArquivoUpload> arquivoUpload;
   
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empresa")
    private List<Setor> setor;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empresa")
    private List<EmpresaEmail> empresaEmail;    
    
//    
    
  
    public Empresa() {
    }

	public Empresa(Integer empCodigo, String empNome, Boolean empStatus, String empLogo, int empPeriodicidadeIt, int empPeriodicidadeRi, int empPeriodicidadeMca, Date empProxMedicaoIt, Date empProxMedicaoRi, Date empProxMedicaoMca){
		super();
		
		this.empCodigo = empCodigo;
		this.empNome = empNome;
		this.empStatus = empStatus;
		this.empLogo = empLogo;
		this.empPeriodicidadeIt = empPeriodicidadeIt;
		this.empPeriodicidadeRi = empPeriodicidadeRi;
		this.empPeriodicidadeMca = empPeriodicidadeMca;
		this.empProxMedicaoIt = empProxMedicaoIt;
		this.empProxMedicaoRi = empProxMedicaoRi;
		this.empProxMedicaoMca = empProxMedicaoMca;
		
	}
	
//
//Generate Getters and Setters;
//	
	
	public Integer getEmpCodigo() {
		return empCodigo;
	}

	public void setEmpCodigo(Integer empCodigo) {
		this.empCodigo = empCodigo;
	}

	public String getEmpNome() {
		return empNome;
	}

	public void setEmpNome(String empNome) {
		this.empNome = empNome;
	}

	public Boolean getEmpStatus() {
		return empStatus;
	}

	public void setEmpStatus(Boolean empStatus) {
		this.empStatus = empStatus;
	}

	public String getEmpLogo() {
		return empLogo;
	}

	public void setEmpLogo(String empLogo) {
		this.empLogo = empLogo;
	}

	public int getEmpPeriodicidadeIt() {
		return empPeriodicidadeIt;
	}

	public void setEmpPeriodicidadeIt(int empPeriodicidadeIt) {
		this.empPeriodicidadeIt = empPeriodicidadeIt;
	}

	public int getEmpPeriodicidadeRi() {
		return empPeriodicidadeRi;
	}

	public void setEmpPeriodicidadeRi(int empPeriodicidadeRi) {
		this.empPeriodicidadeRi = empPeriodicidadeRi;
	}

	public int getEmpPeriodicidadeMca() {
		return empPeriodicidadeMca;
	}

	public void setEmpPeriodicidadeMca(int empPeriodicidadeMca) {
		this.empPeriodicidadeMca = empPeriodicidadeMca;
	}

	public Date getEmpProxMedicaoIt() {
		return empProxMedicaoIt;
	}

	public void setEmpProxMedicaoIt(Date empProxMedicaoIt) {
		this.empProxMedicaoIt = empProxMedicaoIt;
	}

	public Date getEmpProxMedicaoRi() {
		return empProxMedicaoRi;
	}

	public void setEmpProxMedicaoRi(Date empProxMedicaoRi) {
		this.empProxMedicaoRi = empProxMedicaoRi;
	}

	public Date getEmpProxMedicaoMca() {
		return empProxMedicaoMca;
	}

	public void setEmpProxMedicaoMca(Date empProxMedicaoMca) {
		this.empProxMedicaoMca = empProxMedicaoMca;
	}

	public List<EmpresaEmail> getEmpresaEmail() {
		return empresaEmail;
	}	
	
	public List<ArquivoUpload> getArquivoUpload() {
		return arquivoUpload;
	}
	
	public List<Setor> getSetor() {
		return setor;
	}
	
	public Instant getCreatedAt() {
		return createdAt;
	}

	public Instant getUpdateAt() {
		return updateAt;
	}

	@PrePersist
	public void prePersist() {
		createdAt = Instant.now();
	}
	
	@PreUpdate
	public void preUpdate() {
		updateAt = Instant.now();
	}
	

//Generate hadsCode() and  equals()  somente do id;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empCodigo == null) ? 0 : empCodigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresa other = (Empresa) obj;
		if (empCodigo == null) {
			if (other.empCodigo != null)
				return false;
		} else if (!empCodigo.equals(other.empCodigo))
			return false;
		return true;
	}

}
