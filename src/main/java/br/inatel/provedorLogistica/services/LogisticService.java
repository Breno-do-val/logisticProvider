package br.inatel.provedorLogistica.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.inatel.provedorLogistica.entities.Logistic;
import br.inatel.provedorLogistica.repositories.LogisticRepository;

@Service
public class LogisticService {

	@Autowired
	private LogisticRepository repository;
	
	public List<Logistic> findAll() {
		return repository.findAll();
	}
	
	public Logistic findById(Long id) {
		Optional<Logistic> obj = repository.findById(id);
		return obj.get();
	}
	
	public Logistic insert(Logistic obj) {
		return repository.save(obj);
	}
	
	public Logistic update(Long id, Logistic obj) {
		Logistic entity = repository.getOne(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	private void updateData(Logistic entity, Logistic obj) {
		entity.setReceiverName(obj.getReceiverName());
		entity.setReceiverCpf(obj.getReceiverCpf());
		entity.setDate(obj.getDate());
		entity.setOrderStatus(obj.getOrderStatus());
		
	}
}
