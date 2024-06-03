package com.distribuida.entities;

import org.springframework.stereotype.Component;

@Component
public class Categoria {

	private int idCategoria;
	private int Categoria;
	private int descripcion;
	
	
	private Categoria() {}


	public Categoria(int idCategoria, int categoria, int descripcion) {
		
		this.idCategoria = idCategoria;
		Categoria = categoria;
		this.descripcion = descripcion;
	}


	public int getIdCategoria() {
		return idCategoria;
	}


	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}


	public int getCategoria() {
		return Categoria;
	}


	public void setCategoria(int categoria) {
		Categoria = categoria;
	}


	public int getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(int descripcion) {
		this.descripcion = descripcion;
	}


	@Override
	public String toString() {
		return "Categoria [idCategoria=" + idCategoria + ", Categoria=" + Categoria + ", descripcion=" + descripcion
				+ "]";
	}
	
	
}
