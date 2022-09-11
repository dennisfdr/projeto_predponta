package com.br.predponta.app.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.br.predponta.app.entities.Empresa;
import com.br.predponta.app.entities.Setor;



public class EmpresaDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	
    private Integer empCodigo;
    private String empNome;
    private Boolean empStatus;
    private String empLogo;
    private int empPeriodicidadeIt;
    private int empPeriodicidadeRi;
    private int empPeriodicidadeMca;
    private Date empProxMedicaoIt;
    private Date empProxMedicaoRi;
    private Date empProxMedicaoMca;
    private Date createdAt;
    private List<Setor> setor = new ArrayList<Setor>();
	
			
		public EmpresaDTO () {
			
		}

		public EmpresaDTO(Integer empCodigo, String empNome, Boolean empStatus, String empLogo, int empPeriodicidadeIt, int empPeriodicidadeRi, int empPeriodicidadeMca, Date empProxMedicaoIt, Date empProxMedicaoRi, Date empProxMedicaoMca, List<Setor> setor) {
			
						
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
			this.setor = (List<Setor>) setor;
			
					
			
		}
		
		public EmpresaDTO (Empresa entity) {
						
			this.empCodigo = entity.getEmpCodigo();
			this.empNome = entity.getEmpNome();
			this.empStatus = entity.getEmpStatus();
			this.empLogo = entity.getEmpLogo();
			this.empPeriodicidadeIt = entity.getEmpPeriodicidadeIt();
			this.empPeriodicidadeRi = entity.getEmpPeriodicidadeRi();
			this.empPeriodicidadeMca = entity.getEmpPeriodicidadeMca();
			this.empProxMedicaoIt = entity.getEmpProxMedicaoIt();
			this.empProxMedicaoRi = entity.getEmpProxMedicaoRi();
			this.empProxMedicaoMca = entity.getEmpProxMedicaoMca();
			this.setor = entity.getSetor();
					
		}

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

		public Date getCreatedAt() {
			return createdAt;
		}

		public List<Setor> getSetor() {
			return setor;
		}

		public void setSetor(List<Setor> setor) {
			this.setor = setor;
		}
		
		
		
}
