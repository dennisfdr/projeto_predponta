package com.br.predponta.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.core.env.*;

@SpringBootApplication
@RestController
public class AppApplication {

	
		
		@Autowired 
		Environment env; 
		
		@GetMapping("/")
		public String getAmbiente() {
			
			String ambienteAtual = "Padrão (nennhum)";
			
			if(env.getActiveProfiles().length > 0) {
			
				ambienteAtual = env.getActiveProfiles()[0];
			
			}
			
			
			String appName = env.getProperty("spring.application.name");
			
			return String.format("Ambiente: %s | AppName: %s", ambienteAtual, appName);
		}
		
		
		public static void main(String[] args) {
		
				SpringApplication.run(AppApplication.class, args);
		}

}
