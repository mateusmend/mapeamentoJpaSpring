package com.example.pessoa;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.example.genero.Genero;

@Entity
public class Fisica extends Pessoa {

	@ManyToOne
	private Fisica paiBiologico;
	@ManyToOne
	private Fisica maeBiologica;

	@Enumerated(EnumType.STRING)
	private Genero genero;

	@OneToMany(mappedBy="fisica")
	private Set<Socio> osSociu = new HashSet<Socio>();

	@OneToMany(mappedBy="paiBiologico")
	private Set<Fisica> filhosPai = new HashSet<Fisica>();
	@OneToMany(mappedBy="maeBiologica")
	private Set<Fisica> filhosDaMae = new HashSet<Fisica>();

	public void addSocio(Socio novoSocio) {
		osSociu.add(novoSocio);
	}

	public Set<Fisica> getFilhosPai() {
		return Collections.unmodifiableSet(filhosPai);
	}

	public Set<Fisica> getFilhosDaMae() {
		return Collections.unmodifiableSet(filhosDaMae);
	}

	public void addFilhosPai(Fisica novofilhoPai) {
		filhosPai.add(novofilhoPai);

	}

	public void addFilhosDaMae(Fisica novoFilhoDaMae) {
		filhosDaMae.add(novoFilhoDaMae);
	}

	public Set<Socio> getOsSociu() {
		return Collections.unmodifiableSet(osSociu);
	}

	public Fisica getPaiBiologico() {
		return paiBiologico;
	}

	public void setPaiBiologico(Fisica paiBiologico) {
		this.paiBiologico = paiBiologico;
	}

	public Fisica getMaeBiologica() {
		return maeBiologica;
	}

	public void setMaeBiologica(Fisica maeBiologica) {
		this.maeBiologica = maeBiologica;
	}

}
