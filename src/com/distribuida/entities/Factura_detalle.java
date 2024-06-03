package com.distribuida.entities;

import org.springframework.stereotype.Component;

@Component
public class Factura_detalle {

	private int idFacturadetalle;
	private int cantidad;
	private double subtotal;
	private int idFactura;
	private int idLibro;
	
	private Factura_detalle() {}

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
