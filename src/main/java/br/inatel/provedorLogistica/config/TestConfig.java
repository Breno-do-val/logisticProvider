package br.inatel.provedorLogistica.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.inatel.provedorLogistica.entities.Logistic;
import br.inatel.provedorLogistica.entities.Order;
import br.inatel.provedorLogistica.entities.enums.OrderStatus;
import br.inatel.provedorLogistica.repositories.LogisticRepository;
import br.inatel.provedorLogistica.repositories.OrderRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired LogisticRepository logisticRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Logistic l1 = new Logistic(null, "John Achiles", "060.096.345-43", Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.DELIVERED);
		Logistic l2 = new Logistic(null, "Arnold Vanilla", "032.056.457-13", Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.DELIVERED);
		
		Order o1 = new Order(null, "Memory Stick", 29.90, l1);
		Order o2 = new Order(null, "Portable Hard Drive 1TB", 309.90, l2);
		Order o3 = new Order(null, "Keyboard Gamer", 490.90, l1);
		
		logisticRepository.saveAll(Arrays.asList(l1, l2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		
	}
	
	
}
