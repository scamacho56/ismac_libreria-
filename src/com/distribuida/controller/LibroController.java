package com.distribuida.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.distribuida.dao.AutorDAO;
import com.distribuida.dao.CategoriaDAO;
import com.distribuida.dao.LibroDAO;
import com.distribuida.entities.Libro;

@Controller
@RequestMapping("/libros") 
public class LibroController {
	
	
	@Autowired
	private LibroDAO libroDAO;
	
	@Autowired
	private CategoriaDAO categoriaDAO;
	
	@Autowired
	private AutorDAO autorDAO;

	
	@GetMapping("/findAll")   
	public String findAll(ModelMap modelMap) {
		
			List<Libro> libros = libroDAO.findAll();
			modelMap.addAttribute("libros", libros); 
			return "listar-libros";  
	
	}
	
	@GetMapping("/findOne")//actualizar o eliminar
	public String findOne(@RequestParam("idLibro") @Nullable Integer idLibro	
			             ,@RequestParam("opcion") @Nullable Integer opcion
			             , ModelMap modelMap
	) {
	if(idLibro !=null) {
		Libro libro = libroDAO.findOne(idLibro);	
		modelMap.addAttribute("libro", libro);
	}
	modelMap.addAttribute("autores", autorDAO.findAll());
	modelMap.addAttribute("categorias", categoriaDAO.findAll());
	
	if(opcion == 1) return "add-libros";
	else return "del-libros";
	
	}
	
	
	@PostMapping("/add")
	private String add(@RequestParam("idLibro") @Nullable Integer idLibro
			          ,@RequestParam("titutlo") @Nullable String titulo
			          ,@RequestParam("editorial") @Nullable String editorial
			          ,@RequestParam("numPaginas") @Nullable Integer numPaginas
			          ,@RequestParam("edicion") @Nullable String edicion
			          ,@RequestParam("idioma") @Nullable String idioma
			          ,@RequestParam("fechaPublicacion") @Nullable Date fechaPublicacion
			          ,@RequestParam("descripcion") @Nullable String descripcion
			          ,@RequestParam("tipoPasta") @Nullable String tipoPasta
			          ,@RequestParam("ISBN") @Nullable String ISBN
			          ,@RequestParam("numEjemplares") @Nullable Integer numEjemplares
			          ,@RequestParam("portada") @Nullable String portada
			          ,@RequestParam("presentacion") @Nullable String presentacion
			          ,@RequestParam("precio") @Nullable Double precio
			          ,@RequestParam("id_categoria") @Nullable Integer idCategoria
			          ,@RequestParam("id_autor") @Nullable Integer idAutor
			) {
		if(idLibro == null) {
			Libro libro = new Libro(0, titulo1, editorial1,22, edicion1, idioma1, new Date() ,descripcion1, tipoPasta1, ISBN1,22, portada1, presentacion1, 22.22);
			libro.setCategoria(categoriaDAO.findOne(idCategoria));
			libro.setAutor(autorDAO.findOne(idAutor));
			
			libroDAO.add(libro);
			
		}
		
		return "redirect:/libros/listar-libros";
	}
	@GetMapping("/del")
	public String del(@RequestParam("idLibro") @Nullable Integer idLibro ) {
		return "redirect:/libros/listar-libros";
	}
}
