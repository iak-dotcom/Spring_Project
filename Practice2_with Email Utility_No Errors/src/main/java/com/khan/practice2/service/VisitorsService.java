package com.khan.practice2.service;

import java.util.List;

import com.khan.practice2.entities.Visitors;

public interface VisitorsService {
	
	Visitors saveVisitors(Visitors visitors);

	Visitors updateVisitors(Visitors visitors);

	void deleteVisitors(Visitors visitors);

	Visitors getVisitorsById(int id);

	List<Visitors> getAllVisitors();

}

