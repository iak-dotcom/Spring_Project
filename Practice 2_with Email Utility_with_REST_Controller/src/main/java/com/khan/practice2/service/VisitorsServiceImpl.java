package com.khan.practice2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khan.practice2.entities.Visitors;
import com.khan.practice2.repo.visitorsRepository;

@Service
public class VisitorsServiceImpl implements VisitorsService {

	@Autowired
	private visitorsRepository repository;
	


	@Override
	public Visitors saveVisitors(Visitors visitors) {
		return repository.save(visitors);
	}

	@Override
	public Visitors updateVisitors(Visitors visitors) {
		return repository.save(visitors);
	}

	@Override
	public void deleteVisitors(Visitors visitors) {
		repository.delete(visitors);
	}

	@Override
	public Visitors getVisitorsById(int id) {
		return repository.findOne(id);
	}

	@Override
	public List<Visitors> getAllVisitors() {
		return repository.findAll();
	}

	
	public visitorsRepository getRepository() {
		return repository;
	}

	public void setRepository(visitorsRepository repository) {
		this.repository = repository;
	}
}
