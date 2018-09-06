package com.corujalivros.resource;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.corujalivros.models.Livro;
import com.corujalivros.repository.LivroRepository;

@RestController
@RequestMapping("/livros")
public class LivroResource {
	
	@Autowired
	private LivroRepository livroRepository;

	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<Livro> listaLivros() {
		Iterable<Livro> listaLivros = livroRepository.findAll();
		return listaLivros;
	}
	
	@PostMapping()
	public Livro cadastraLivro(@RequestBody @Valid Livro livro) {
		return livroRepository.save(livro);
	}
	
	@DeleteMapping()
	public Livro deletaLivro(@RequestBody Livro livro) {
		livroRepository.delete(livro);
		return  livro;
	}
	
}
