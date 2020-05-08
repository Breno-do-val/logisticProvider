package br.inatel.provedorLogistica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.inatel.provedorLogistica.entities.Logistic;

public interface LogisticRepository extends JpaRepository<Logistic, Long> {
	
}
