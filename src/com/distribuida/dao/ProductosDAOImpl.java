package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.Productos;

@Repository
public class ProductosDAOImpl implements ProductosDAO {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	
	@Override
	@Transactional
	public List<Productos>findAll() {
		// TODO Auto-generated method stub
		 Session session = sessionFactory.getCurrentSession();
		 return session.createQuery("from Productos", Productos.class).getResultList();
		 

	}

	@Override
	@Transactional
	public Productos findOne(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session .get(Productos.class, id);
	}

	@Override
	@Transactional
	public void add(Productos productos) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(productos);

	}

	@Override
	@Transactional
	public void up(Productos productos) {
		// TODO Auto-generated method stub
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(productos);
	}

	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.delete(findOne(id));

	}

}
