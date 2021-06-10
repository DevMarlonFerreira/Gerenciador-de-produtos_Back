package com.produtos.api.services;

import java.util.List;

import com.produtos.api.models.Produto;

public interface ProdutoService {
	
	public List<Produto> findAll();
	public Produto findById(long id);
	public Produto save(Produto produto);
	public void deleteById(Long id);
	public void delete(Produto produto);
	public Produto put(Produto produto);
}
