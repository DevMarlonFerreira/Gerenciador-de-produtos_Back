package com.produtos.api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {

	@JsonProperty("produto")
	private String produto;
	@JsonProperty("valor")
	private double valor;
	@JsonProperty("imagem")
	private String imagem;
	@JsonProperty("eans")
	private Long[] eans;
	
	public String getProduto() {
		return produto;
	}
	
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public String getImagem() {
		return imagem;
	}
	
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Long[] getEans() {
		return eans;
	}
	
	public void setEans(Long[] eans) {
		this.eans = eans;
	}	
}
