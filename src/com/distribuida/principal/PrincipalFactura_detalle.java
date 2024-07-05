package com.distribuida.principal;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.Factura_detalleDAO;
import com.distribuida.entities.Factura_detalle;

public class PrincipalFactura_detalle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Patron IoC Inversion de control
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml  ");
		
		Factura_detalleDAO Factura_detalleDAO = context.getBean("Factura_detalleDAOImpl", Factura_detalleDAO.class);
		
		
		
		//CRUD:CREATE,READ,UPDATE,DELETE
		//ADD
		Factura_detalle factura_detalle = new Factura_detalle();
		Factura_detalleDAO.add(factura_detalle);
		
		//up
		Factura_detalle factura_detalle2 = new Factura_detalle();
		Factura_detalleDAO.up(factura_detalle2);
		
		//del
		//Factura_detalleDAO.del(1);
		
		//findOne
		
		//findAll
		
		//List<Factura_detalle> Factura_detalles = Factura_detalleDAO.findAll();
		
		Factura_detalleDAO.findAll().forEach(item -> {
			System.out.println(item.toString());
		});
		context.close();
		
	}

}
