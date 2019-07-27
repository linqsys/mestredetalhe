package br.com.etec.apimestredetalhe.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idpessoa;

	private String nomepessoa;

	public Pessoa() {

	}

	public Pessoa(int idpessoa, String nomepessoa) {
		super();
		this.idpessoa = idpessoa;
		this.nomepessoa = nomepessoa;
	}

	public int getIdpessoa() {
		return idpessoa;
	}

	public void setIdpessoa(int idpessoa) {
		this.idpessoa = idpessoa;
	}

	public String getNomepessoa() {
		return nomepessoa;
	}

	public void setNomepessoa(String nomepessoa) {
		this.nomepessoa = nomepessoa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idpessoa;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (idpessoa != other.idpessoa)
			return false;
		return true;
	}

}
