package com.distribuida.principal;



import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.AutorDAO;
import com.distribuida.entities.Autor;


public class PrincipalAutor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Patron IoC Inversion de control
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml  ");
		
		AutorDAO autorDAO = context.getBean("autorDAOImp2", AutorDAO.class);
		
		
		
		//CRUD:CREATE,READ,UPDATE,DELETE
		//ADD
		Autor autor = new Autor(0, "1234566789", "juan" , "taipe", "av.por ahi...", "09876543432", "jtaipeQgmail.com");
		autorDAO.add(autor);
		
		//up
		Autor autor2 = new Autor(54, "12345667892", "juan2" , "taipe2", "av.por ahi2...", "098765434322", "jtaipe2Qgmail.com");
		autorDAO.up(autor2);
		
		//del
		autorDAO.del(54);
		
		//findOne
		// System.out.println("****************DEL*****************"+autorDAO.findOne(54));
		try {System.out.println("*****************DeL*****************"+autorDAO.findOne(54));} catch(Exception e) {e.printStackTrace();};
			//findAll
			
			//List<Autor> autores = AutorDAO.findAll();
			
			autorDAO.findAll().forEach(item -> {
				System.out.println(item.toString());});
			context.close();
		
			
		
	
		
		
			
	}

}
