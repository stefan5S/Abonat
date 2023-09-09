package com.example.agenda.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

import com.example.agenda.abonat.*;


public interface AbonatRepo extends JpaRepository<Abonat, Integer>{
	
	@Query(value="select s from Abonat s")
	public List<Abonat> fetchAllFromCustom();
	
	
	
	
	
	
	

}
