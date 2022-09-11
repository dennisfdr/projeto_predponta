package com.br.predponta.app.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.br.predponta.app.entities.StatusAnaliseOleo;

@Repository
public interface StatusAnaliseOleoRepository  extends JpaRepository <StatusAnaliseOleo, Integer>{

}
