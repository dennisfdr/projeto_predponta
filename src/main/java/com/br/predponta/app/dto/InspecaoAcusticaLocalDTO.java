package com.br.predponta.app.dto;

import java.io.Serializable;

import com.br.predponta.app.entities.InspecaoAcusticaLocal;
import com.br.predponta.app.entities.Medicao;




public class InspecaoAcusticaLocalDTO implements Serializable{
	private static final long serialVersionUID = 1L;


    private Integer ialCodigo;
    private String ialDescricao;
    private int ialStatus;
   
    private Medicao medicao;  
    
			
		public InspecaoAcusticaLocalDTO () {
			
		}

		public InspecaoAcusticaLocalDTO(Integer ialCodigo, String ialDescricao, int ialStatus, Medicao medicao) {
	       
	        this.ialCodigo = ialCodigo;
	        this.ialDescricao = ialDescricao;
	        this.ialStatus = ialStatus;
				
			this.medicao = medicao;
		}
		
		public InspecaoAcusticaLocalDTO (InspecaoAcusticaLocal entity) {
								
			
	        this.ialCodigo = entity.getIalCodigo();
	        this.ialDescricao = entity.getIalDescricao();
	        this.ialStatus = entity.getIalStatus();

	        //this.medicaomedCodigo = entity.getMedicao().getMedCodigo();

		}

//Generate Getters and Setters;

		public Integer getIalCodigo() {
			return ialCodigo;
		}

		public void setIalCodigo(Integer ialCodigo) {
			this.ialCodigo = ialCodigo;
		}

		public String getIalDescricao() {
			return ialDescricao;
		}

		public void setIalDescricao(String ialDescricao) {
			this.ialDescricao = ialDescricao;
		}

		public int getIalStatus() {
			return ialStatus;
		}

		public void setIalStatus(int ialStatus) {
			this.ialStatus = ialStatus;
		}

		public Medicao getMedicao() {
			return medicao;
		}

		public void setMedicao(Medicao medicao) {
			this.medicao = medicao;
		}

		/*public Integer getMedicaomedCodigo() {
			return medicaomedCodigo;
		}

		public void setMedicaomedCodigo(Integer medicaomedCodigo) {
			this.medicaomedCodigo = medicaomedCodigo;
		}*/
		
		

}
