package com.produtos.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.produtos.api.models.ProductList;
import com.produtos.api.services.ProductService;

@RestController
@RequestMapping(value="/")
public class ProductController {
	
    @Autowired
    ProductService productService;
    
    @GetMapping("/products")
    public String getProductString(){
  	  String retorno = productService.getProductString();
  	  return retorno;
    }
  
  @GetMapping("/productslist")
  public ProductList getProductProducts(){
	  ProductList retorno = productService.getProductProducts();
	  return retorno;
  }
}