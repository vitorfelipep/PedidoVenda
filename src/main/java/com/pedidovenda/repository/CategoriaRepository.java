package com.pedidovenda.repository;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.pedidovenda.model.Categoria;

public class CategoriaRepository implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager manager;

	public List<Categoria> raizes() {
		return manager.createQuery("from Categoria", Categoria.class)
				.getResultList();
	}
}
