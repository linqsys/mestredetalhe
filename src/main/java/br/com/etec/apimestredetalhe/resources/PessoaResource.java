package br.com.etec.apimestredetalhe.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.etec.apimestredetalhe.domain.Pessoa;
import br.com.etec.apimestredetalhe.service.PessoaService;

@RestController
@RequestMapping("/pessoas")
public class PessoaResource {

	@Autowired
	private PessoaService pessoaService;
	
	@GetMapping()
	public Page<Pessoa> pesquisar(@RequestParam(required = false, 
	       defaultValue = "%") String nomepessoa, Pageable pageable) {
		return pessoaService.pesquisar(nomepessoa, pageable);
	}
	
}
