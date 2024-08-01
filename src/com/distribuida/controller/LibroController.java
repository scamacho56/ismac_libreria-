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
			          ,@RequestParam("titutlo") @Nullable String titulo1
			          ,@RequestParam("editorial") @Nullable String editorial1
			          ,@RequestParam("numPaginas") @Nullable Integer numPaginas
			          ,@RequestParam("edicion") @Nullable String edicion1
			          ,@RequestParam("idioma") @Nullable String idioma1
			          ,@RequestParam("fechaPublicacion") @Nullable Date fechaPublicacion
			          ,@RequestParam("descripcion") @Nullable String descripcion1
			          ,@RequestParam("tipoPasta") @Nullable String tipoPasta1
			          ,@RequestParam("ISBN") @Nullable String ISBN1
			          ,@RequestParam("numEjemplares") @Nullable Integer numEjemplares
			          ,@RequestParam("portada") @Nullable String portada1
			          ,@RequestParam("presentacion") @Nullable String presentacion1
			          ,@RequestParam("precio") @Nullable Double precio1
			          ,@RequestParam("id_categoria") @Nullable Integer idCategoria
			          ,@RequestParam("id_autor") @Nullable Integer idAutor
			) {
		if (idLibro == null) {
		    Libro libro = new Libro(0, titulo1, editorial1, 22, edicion1, idioma1, new Date(), descripcion1, tipoPasta1, ISBN1, 22, portada1, presentacion1, precio);
		    libro.setCategoria(categoriaDAO.findOne(idCategoria));
		    libro.setAutor(autorDAO.findOne(idAutor));
		    libroDAO.add(libro);
		} else {
		    Libro libro = new Libro(idLibro, titulo1, editorial1, 22, edicion1, idioma1, new Date(), descripcion1, tipoPasta1, ISBN1, 22, portada1, presentacion1, precio);
		    libro.setCategoria(categoriaDAO.findOne(idCategoria));
		    libro.setAutor(autorDAO.findOne(idAutor));
		    libroDAO.add(libro);
		}
		return "redirect:/libros/listar-libros";

			
		
		
		return "redirect:/libros/listar-libros";
	}
	@GetMapping("/del")
	public String del(@RequestParam("idLibro") @Nullable Integer idLibro ) {
		libroDAO.del(idLibro);
		return "redirect:/libros/listar-libros";
	}
}
