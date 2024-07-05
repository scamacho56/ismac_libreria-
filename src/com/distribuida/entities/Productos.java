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
@Table(name = "Productos")
public class Productos {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column (name="id_Productos")	
private int idProductos;
@Column (name="nombre")	
private String nombre;
@Column (name="descripcion")	
private String descripcion;
@Column (name="precio")	
private double precio;
@Column (name="stock")	
private int stock;


public Productos() {}


public Productos(int idProductos, String nombre, String descripcion, double precio, int stock) {
	this.idProductos = idProductos;
	this.nombre = nombre;
	this.descripcion = descripcion;
	this.precio = precio;
	this.stock = stock;
}


public int getIdProductos() {
	return idProductos;
}


public void setIdProductos(int idProductos) {
	this.idProductos = idProductos;
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public String getDescripcion() {
	return descripcion;
}


public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}


public double getPrecio() {
	return precio;
}


public void setPrecio(double precio) {
	this.precio = precio;
}


public int getStock() {
	return stock;
}


public void setStock(int stock) {
	this.stock = stock;
}


@Override
public String toString() {
	return "Productos [idProductos=" + idProductos + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio="
			+ precio + ", stock=" + stock + "]";
}





}
