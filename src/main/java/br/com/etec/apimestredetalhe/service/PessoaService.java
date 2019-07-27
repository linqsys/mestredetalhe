package br.com.etec.apimestredetalhe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.etec.apimestredetalhe.domain.Pessoa;
import br.com.etec.apimestredetalhe.repositories.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	public Page<Pessoa> pesquisar(String nomepessoa, Pageable pageable) {
		return pessoaRepository.findByNomepessoaContaining(nomepessoa, pageable);
	}

}
