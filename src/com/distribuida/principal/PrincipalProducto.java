package com.distribuida.principal;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ProductosDAO;
import com.distribuida.entities.Productos;

public class PrincipalProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Patron IoC Inversion de control
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml  ");
		
		ProductosDAO productosDAO = context.getBean("ProductosDAOImpl", ProductosDAO.class);
		
		
		
		//CRUD:CREATE,READ,UPDATE,DELETE
		//ADD
		Productos productos = new Productos();
		productosDAO.add(productos);
		
		//up
		Productos productos2 = new Productos();
		productosDAO.up(productos2);
		
		//del
		//ProductosDAO.del(1);
		
		//findOne
		
		//findAll
		
		//List<Productos> Productoss = ProductosDAO.findAll();
		
		productosDAO.findAll().forEach(item -> {
			System.out.println(item.toString());
		});
		context.close();
		
	}

}
