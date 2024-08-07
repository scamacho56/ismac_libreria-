package com.distribuida.principal;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.CategoriaDAO;
import com.distribuida.entities.Categoria;


public class PrincipalCategoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Patron IoC Inversion de control
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml  ");
		
		CategoriaDAO categoriaDAO = context.getBean("categoriaDAOImpl", CategoriaDAO.class);
		
		
		//CRUD:CREATE,READ,UPDATE,DELETE
				//ADD
				Categoria categoria = new Categoria();
				categoriaDAO.add(categoria);
				
				
				//up
				Categoria categoria2 = new Categoria();
				categoriaDAO.up(categoria2);
				
				//del
				//CategoriaDAO.del(1);
				
				//findOne
				
				//findAll
		
		//List<Categoria> categorias = categoriaDAO.findAll();
		
				categoriaDAO.findAll().forEach(item -> {
					System.out.println(item.toString());
				});
				context.close();
		
	}

}

