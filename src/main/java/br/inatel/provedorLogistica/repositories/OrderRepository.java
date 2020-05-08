package br.inatel.provedorLogistica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.inatel.provedorLogistica.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
