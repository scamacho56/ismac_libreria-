package com.distribuida.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "categoria")
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="id_categoria")	
	private int idCategoria;
	@Column (name="categoria")
	private int Categoria;
	@Column (name="descripcion")
	private int descripcion;
	
	
public Categoria() {}


	public Categoria(int idCategoria, int categoria, int descripcion) {
		
		this.idCategoria = idCategoria;
		this.Categoria = categoria;
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
