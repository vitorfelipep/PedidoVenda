package com.pedidovenda.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class CadastroProdutoBean {
	
	public void cadastrar(){
		throw new RuntimeException("Teste de aplicação");
	}
}
