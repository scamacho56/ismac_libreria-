package com.distribuida.principal;



import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.LibroDAO;
import com.distribuida.entities.Libro;




public class PrincipalLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Patron IoC Inversion de control
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml  ");
		
		LibroDAO LibroDAO = context.getBean("libroDAOImpl", LibroDAO.class);
		
		
		
		//CRUD:CREATE,READ,UPDATE,DELETE
		Libro libro = new Libro();
		LibroDAO.add(libro);
		
		//up
		Libro libro2 = new Libro();
		LibroDAO.up(libro2);
		
				
				//del
				//LibroDAO.del(1);
				
				//findOne
				
				//findAll
				

				LibroDAO.findAll().forEach(item -> {
					System.out.println(item.toString());
				});
				context.close();
				
		
		
			
	}

}
