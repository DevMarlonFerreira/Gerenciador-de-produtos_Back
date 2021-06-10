package com.produtos.api.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.produtos.api.models.ProductList;

@Service
public class ProductServiceImpl implements ProductService {
	
	private static final String URI = "https://no2gru7ua3.execute-api.us-east-1.amazonaws.com";
	
	@Override
	public String getProductString() {
		RestTemplate restTemplate = new RestTemplate();
		
	    HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    HttpEntity <String> entity = new HttpEntity<String>(headers);
				
	    String resultado = restTemplate.exchange(URI, HttpMethod.GET, entity, String.class).getBody();
	    
	    return resultado;
	}
		
	@Override
	public ProductList getProductProducts() {
		RestTemplate restTemplate = new RestTemplate();
		
	    HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    HttpEntity <String> entity = new HttpEntity<String>(headers);
		
		List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();        
		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
		converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));        
		messageConverters.add(converter);  
		restTemplate.setMessageConverters(messageConverters);
		
		ProductList resultado = restTemplate.exchange("https://no2gru7ua3.execute-api.us-east-1.amazonaws.com", HttpMethod.GET, entity, ProductList.class).getBody();
		        
		return resultado;	
	}
}

