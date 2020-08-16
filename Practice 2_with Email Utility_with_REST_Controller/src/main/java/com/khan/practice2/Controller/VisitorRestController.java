package com.khan.practice2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.khan.practice2.entities.Visitors;
import com.khan.practice2.repo.visitorsRepository;

@RestController
@RequestMapping("/visitor")
public class VisitorRestController {
	
	@Autowired
	visitorsRepository visitorRepository;

	@GetMapping
	public List<Visitors> getVisitors(){
		return visitorRepository.findAll();
		
	}
	
	@PostMapping
	public Visitors createVisitor(@RequestBody Visitors visitor) {
		return visitorRepository.save(visitor);
	}
	
	@PutMapping
	public Visitors updateVisitor(@RequestBody Visitors visitor) {
		return visitorRepository.save(visitor);
	}
	
	@DeleteMapping("/{id}")
	public void deleteLocation (@PathVariable("id")int id) {
		visitorRepository.delete(id);
	}
	
	@GetMapping("/{id}")
	public Visitors getVisitors(@PathVariable("id")int id){
		return visitorRepository.findOne(id);
		
	}
	
}
