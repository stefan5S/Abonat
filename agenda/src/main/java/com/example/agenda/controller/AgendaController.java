package com.example.agenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.example.agenda.abonat.*;
import com.example.agenda.dao.*;
import com.example.agenda.service.*;


@Controller
public class AgendaController {
	
	@Autowired
	private Service abonatService;

	@Autowired
	AbonatRepo repo;
	
	@GetMapping("/")
	public String home()
	{
		return "home";
	}
	
	
	/*se complecteaza campurile de catre utilizator si informatiile sunt puse in baza de date
	 * informatiile despre un abonat sunt "nume" si "numar"*/
	@PostMapping("/inserare")	
	public String userRegistration(String nume,String numar)
	{
		
		Abonat ab=new Abonat(nume,numar);
		repo.save(ab);
		
		
		return "home";
	}
	
	/*se aiseaza campurile bazei de date*/
	@GetMapping("/afisare")
	public String fetchController(Model m)
	{
		 
		m.addAttribute("contacte",abonatService.fetchAll());
		
		return "contacte";
	}
	
	
	
	
	
	
	
	
}
