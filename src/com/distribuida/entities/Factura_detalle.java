package com.distribuida.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

//@Component
//@Entity
//@Table(name = "factura_detalle")
public class Factura_detalle {
	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name = "id_factura_detalle")
	private int idFacturadetalle;
	//@Column(name = "cantidad")
	private int cantidad;
	//@Column(name = "subtotal")
	private double subtotal;
	//@Column(name = "id_factura")
	private int idFactura;
	//@Column(name = "id_libro")
	private int idLibro;
	
	public Factura_detalle() {}

	public Factura_detalle(int idFacturadetalle, int cantidad, double subtotal, int idFactura, int idLibro) {
		
		this.idFacturadetalle = idFacturadetalle;
		this.cantidad = cantidad;
		this.subtotal = subtotal;
		this.idFactura = idFactura;
		this.idLibro = idLibro;
	}

	public int getIdFacturadetalle() {
		return idFacturadetalle;
	}

	public void setIdFacturadetalle(int idFacturadetalle) {
		this.idFacturadetalle = idFacturadetalle;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public int getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}

	public int getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}

	@Override
	public String toString() {
		return "Factura_detalle [idFacturadetalle=" + idFacturadetalle + ", cantidad=" + cantidad + ", subtotal="
				+ subtotal + ", idFactura=" + idFactura + ", idLibro=" + idLibro + "]";
	}
	
	
}
