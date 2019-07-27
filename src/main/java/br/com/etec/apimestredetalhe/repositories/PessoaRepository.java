package br.com.etec.apimestredetalhe.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.etec.apimestredetalhe.domain.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {
	public Page<Pessoa> findByNomepessoaContaining(String nomepessoa, Pageable pageable);
}
