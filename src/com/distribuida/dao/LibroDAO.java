package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Libro;

public interface LibroDAO {

	//crud basico
	
	public List<Libro> findAll();
	
	public Libro findOne(int id);
	
	public void add(Libro Libro);
	
	public void up(Libro Libro);
	
	public void del(int id);
	

	
	
	
}
 