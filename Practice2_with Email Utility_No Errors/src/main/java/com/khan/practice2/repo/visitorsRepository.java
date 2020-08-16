package com.khan.practice2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.khan.practice2.entities.Visitors;
@Repository
public interface visitorsRepository extends JpaRepository<Visitors, Integer> {

}
