package com.example.agenda.abonat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="CLIENTI")
@NoArgsConstructor
@AllArgsConstructor
public class Abonat {

	@Id
	@Column(name="ID")
	@GeneratedValue
	private int id;
	
	@Column(name="nume")
	private String nume;
	
	@Column(name="numar")
	private String numar;
	

	public Abonat(String nume,String numar)
	{
		super();
		this.nume=nume;
		this.numar=numar;
	}
	
	public Abonat()
	{
		
	}

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNumar() {
		return numar;
	}

	

	@Override
	public String toString() {
		return "Abonat [nume=" + nume + ", numar=" + numar + "]";
	}



	public void setNumar(String numar) {
		this.numar = numar;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}
	
	
	
	
	
	
	
	
	
}
