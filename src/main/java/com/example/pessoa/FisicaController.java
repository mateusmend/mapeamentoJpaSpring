package com.example.pessoa;

import java.util.Set;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fisica")
public class FisicaController {

	@Autowired
	private EntityManager em;
	
	@RequestMapping(method=RequestMethod.POST)
	public void inserirPessoaFisica() {
		
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public Set<Fisica> getPessoaFisica() {
		return null;
	}
	
}
