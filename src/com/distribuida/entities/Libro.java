package com.distribuida.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Component
@Entity
@Table(name = "libro")
public class Libro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_libro")
	private int idLibro;
	@Column(name = "titulo")
	private int titulo;
	@Column(name = "editorial")
	private int editorial;
	@Column(name = "num_paginas")
	private int num_paginas;
	@Column(name = "edicion")
	private int edicion;
	@Column(name = "idioma")
	private int idioma;
	@Column(name = "fecha_publicacion")
	private Date fech_publicacion;
	@Column(name = "descripcion")
	private int descripcion;
	@Column(name = "tipo_pasta")
	private int tipo_pasta;
	@Column(name = "ISBN")
	private int isbn;
	@Column(name = "num_ejemplares")
	private int num_ejemplares;
	@Column(name = "portada")
	private int portada;
	@Column(name = "presentacion")
	private int presentacion;
	@Column(name = "precio")
	private double precio;
	@Column(name = "id_categoria")
	private int idCategoria;
	@Column(name = "id_autor")
	private int idAutor;

	public Libro() {}

	/**
	 * @param idLibro
	 * @param titulo1
	 * @param editorial1
	 * @param numPaginas
	 * @param edicion1
	 * @param idioma1
	 * @param fechaPublicacion
	 * @param descripcion1
	 * @param tipoPasta1
	 * @param ISBN1
	 * @param numEjemplares
	 * @param portada1
	 * @param presentacion1
	 *  @param precio1
	 *   @param idCategoria
	 *    @param idAutor
	 */
	
	
	
	// @OneToOne
	// @ManyToOne
	// @OneToOne

	@JoinColumn(name = "id_libro")
	@ManyToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
	private Cliente cliente;

	public Libro(int idLibro, int titulo, int editorial, int num_paginas, int edicion, int idioma,
			Date fech_publicacion, int descripcion, int tipo_pasta, int isbn, int num_ejemplares, int portada,
			int presentacion, double precio) {

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

	}

	public Libro(int idLibro, int titulo, int editorial, int num_paginas, int edicion, int idioma,
			Date fech_publicacion, int descripcion, int tipo_pasta, int isbn, int num_ejemplares, int portada,
			int presentacion, double precio, int idCategoria, int idAutor, Cliente cliente) {
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
		this.cliente = cliente;
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

	@Override
	public String toString() {
		return "Libro [idLibro=" + idLibro + ", titulo=" + titulo + ", editorial=" + editorial + ", num_paginas="
				+ num_paginas + ", edicion=" + edicion + ", idioma=" + idioma + ", fech_publicacion=" + fech_publicacion
				+ ", descripcion=" + descripcion + ", tipo_pasta=" + tipo_pasta + ", isbn=" + isbn + ", num_ejemplares="
				+ num_ejemplares + ", portada=" + portada + ", presentacion=" + presentacion + ", precio=" + precio
				+ ", idCategoria=" + idCategoria + ", idAutor=" + idAutor + ", cliente=" + cliente + "]";
	}

}
