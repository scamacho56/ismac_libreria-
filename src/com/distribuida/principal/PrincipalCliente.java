package com.distribuida.principal;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.entities.Cliente;

public class PrincipalCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Patron IoC Inversion de control
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml  ");
		
		ClienteDAO clienteDAO = context.getBean("clienteDAOImpl", ClienteDAO.class);
		
		
		
		//CRUD:CREATE,READ,UPDATE,DELETE
		//ADD
		Cliente cliente = new Cliente(0, "1234566789", "juan" , "taipe", "av.por ahi...", "09876543432", "jtaipeQgmail.com");
		clienteDAO.add(cliente);
		
		//up
		Cliente cliente2 = new Cliente(1, "1234566789", "juan" , "taipe2", "av.por ahi...", "09876543432", "jtaipeQgmail.com");
		clienteDAO.up(cliente2);
		
		//del
		//clienteDAO.del(1);
		
		//findOne
		
		//findAll
		
		//List<Cliente> clientes = clienteDAO.findAll();
		
		clienteDAO.findAll().forEach(item -> {
			System.out.println(item.toString());
		});
		context.close();
		
	}

}
