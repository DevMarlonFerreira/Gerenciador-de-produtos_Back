package com.produtos.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.produtos.api.models.Produto;
import com.produtos.api.repository.ProdutoRepository;

@Service
public class ProdutoServiceImpl implements ProdutoService {
	
	@Autowired
	private ProdutoRepository repository;
	
	public ProdutoServiceImpl(ProdutoRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<Produto> findAll() {
		return repository.findAll();
	}
	
	@Override
	public Produto findById(long id) {
		return repository.findById(id);
	}

	@Override
	public Produto save(Produto produto) {
		return this.repository.save(produto);
	}
	
	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

	@Override
	public void delete(Produto produto) {
		repository.delete(produto);
	}

	@Override
	public Produto put(Produto produto) {
		return repository.save(produto);
	}
	
}
