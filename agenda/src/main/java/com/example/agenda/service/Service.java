package com.example.agenda.service;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;

import com.example.agenda.dao.*;
import com.example.agenda.abonat.*;



@org.springframework.stereotype.Service
public class Service {
	
	@Autowired
	private AbonatRepo abonatRepo;
	
	public Abonat saveDetails(Abonat ab)
	{
		return abonatRepo.save(ab);
		
	}
	
	
	public List<Abonat> fetchAll()
	{
		return abonatRepo.fetchAllFromCustom();
		
	}
	
	
	
	

}
