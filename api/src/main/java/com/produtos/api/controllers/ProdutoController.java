package com.produtos.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.produtos.api.services.ProdutoService;
import com.produtos.api.models.Produto;

@RestController
@RequestMapping(value="/api")
public class ProdutoController {
	
	@Autowired
	ProdutoService produtoService;
	
	@GetMapping("/produtos")
	public List<Produto> getProdutos(){
		return produtoService.findAll();
	}
	
	@GetMapping("/produto/{id}")
	public Produto getProduto(@PathVariable(value="id") long id) {
		return produtoService.findById(id);
	}
	
	@PostMapping("/produto")
	public Produto postProduto(@RequestBody Produto produto) {
		return produtoService.save(produto);
	}
	
	@DeleteMapping("/produto/{id}")
	public void deleteProduto(@PathVariable(value="id") Long id) {
		produtoService.deleteById(id);
	}
	
	@PutMapping("/produto")
	public Produto putProduto(@RequestBody Produto produto) {
		return produtoService.save(produto);
	}
}
