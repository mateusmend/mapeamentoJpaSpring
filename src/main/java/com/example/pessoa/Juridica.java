package com.example.pessoa;

import java.util.Collections;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Juridica extends Pessoa {

	@OneToMany(mappedBy="juridica")
	private List<Socio> socios;

	public List<Socio> getSocios() {
		return  Collections.unmodifiableList(socios);
	}

	public void setSocios(Socio socio) {
		socios.add(socio);
	}

}
