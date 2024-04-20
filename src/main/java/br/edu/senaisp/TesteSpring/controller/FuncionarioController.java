package br.edu.senaisp.TesteSpring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.senaisp.TesteSpring.model.Funcionario;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {
	
	@PostMapping
	public String Insere(@RequestBody Funcionario f) {
		
		return "POST " + f.getNome();
	}
	
	@GetMapping("/busca/{id}")
	public int BuscaPorId(@PathVariable Integer id) {
		return id;
	}
	
}
