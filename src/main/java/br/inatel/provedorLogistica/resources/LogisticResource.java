package br.inatel.provedorLogistica.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.inatel.provedorLogistica.entities.Logistic;
import br.inatel.provedorLogistica.services.LogisticService;

@RestController
@RequestMapping(value = "/logistic")
public class LogisticResource {
	
	@Autowired
	private LogisticService service;
	@GetMapping
	public ResponseEntity<List<Logistic>> findAll() {
		List<Logistic> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Logistic> findById(@PathVariable Long id) {
		Logistic obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public ResponseEntity<Logistic> insert(@RequestBody Logistic obj) {
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).body(obj);
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Logistic> update(@PathVariable Long id, @RequestBody Logistic obj) {
		obj = service.update(id, obj);
		return ResponseEntity.ok().body(obj);
	}
}