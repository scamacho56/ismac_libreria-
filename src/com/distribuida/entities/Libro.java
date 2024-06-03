package com.distribuida.entities;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Libro {

	private int idLibro;
	private int titulo;
	private int editorial;
	private int num_paginas;
	private int edicion;
	private int idioma;
	private  Date fech_publicacion;
	private int descripcion;
	private int tipo_pasta;
	private int isbn;
	private int num_ejemplares;
	private int portada;
	private int presentacion;
	private double precio;
	private int idCategoria;
	private int idAutor;
	
	
	private Libro() {}


	public Libro(int idLibro, int titulo, int editorial, int num_paginas, int edicion, int idioma,
			Date fech_publicacion, int descripcion, int tipo_pasta, int isbn, int num_ejemplares, int portada,
			int presentacion, double precio, int idCategoria, int idAutor) {
		super();
		this.idLibro = idLibro;
		this.titulo = titulo;
		this.editorial = editorial;
		this.num_paginas = num_paginas;
		this.edicion = edicion;
		this.idioma = idioma;
		this.fech_publicacion = fech_publicacion;
		this.descripcion = descripcion;
		this.tipo_pasta = tipo_pasta;
		this.isbn = isbn;
		this.num_ejemplares = num_ejemplares;
		this.portada = portada;
		this.presentacion = presentacion;
		this.precio = precio;
		this.idCategoria = idCategoria;
		this.idAutor = idAutor;
	}


	public int getIdLibro() {
		return idLibro;
	}


	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}


	public int getTitulo() {
		return titulo;
	}


	public void setTitulo(int titulo) {
		this.titulo = titulo;
	}


	public int getEditorial() {
		return editorial;
	}


	public void setEditorial(int editorial) {
		this.editorial = editorial;
	}


	public int getNum_paginas() {
		return num_paginas;
	}


	public void setNum_paginas(int num_paginas) {
		this.num_paginas = num_paginas;
	}


	public int getEdicion() {
		return edicion;
	}


	public void setEdicion(int edicion) {
		this.edicion = edicion;
	}


	public int getIdioma() {
		return idioma;
	}


	public void setIdioma(int idioma) {
		this.idioma = idioma;
	}


	public Date getFech_publicacion() {
		return fech_publicacion;
	}


	public void setFech_publicacion(Date fech_publicacion) {
		this.fech_publicacion = fech_publicacion;
	}


	public int getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(int descripcion) {
		this.descripcion = descripcion;
	}


	public int getTipo_pasta() {
		return tipo_pasta;
	}


	public void setTipo_pasta(int tipo_pasta) {
		this.tipo_pasta = tipo_pasta;
	}


	public int getIsbn() {
		return isbn;
	}


	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}


	public int getNum_ejemplares() {
		return num_ejemplares;
	}


	public void setNum_ejemplares(int num_ejemplares) {
		this.num_ejemplares = num_ejemplares;
	}


	public int getPortada() {
		return portada;
	}


	public void setPortada(int portada) {
		this.portada = portada;
	}


	public int getPresentacion() {
		return presentacion;
	}


	public void setPresentacion(int presentacion) {
		this.presentacion = presentacion;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public int getIdCategoria() {
		return idCategoria;
	}


	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}


	public int getIdAutor() {
		return idAutor;
	}


	public void setIdAutor(int idAutor) {
		this.idAutor = idAutor;
	}


	@Override
	public String toString() {
		return "Libro [idLibro=" + idLibro + ", titulo=" + titulo + ", editorial=" + editorial + ", num_paginas="
				+ num_paginas + ", edicion=" + edicion + ", idioma=" + idioma + ", fech_publicacion=" + fech_publicacion
				+ ", descripcion=" + descripcion + ", tipo_pasta=" + tipo_pasta + ", isbn=" + isbn + ", num_ejemplares="
				+ num_ejemplares + ", portada=" + portada + ", presentacion=" + presentacion + ", precio=" + precio
				+ ", idCategoria=" + idCategoria + ", idAutor=" + idAutor + "]";
	}
	
	
	
	
}
