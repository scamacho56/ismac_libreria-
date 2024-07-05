package com.distribuida.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.distribuida.dao.CategoriaDAO;
import com.distribuida.entities.Categoria;


@Controller
@RequestMapping("/categorias") //path principal
public class CategoriaController {

	
	//JSP.-Java Server Page, son las paginas web de tecnologia java
	
	
	@Autowired
	private CategoriaDAO categoriaDAO;
	
	@GetMapping("/findAll")   //path secundario
	public String findAll(Model model) {
		//try {
			List<Categoria> categorias = categoriaDAO.findAll();
			
			model.addAttribute("Categorias", categorias);  //	EJ:clave=keyCategorias,valor = Categorias
			
			return "listar-categorias";  //esto es el nombre del formulario Ej,"listar.Categorias.html o "listar-Categorias.jsp
		
		//} catch (Exception e) {
//       //TODO: handle exception 
			//e.printStackTrace();
		// }
		
	  
	  
		
	
	}
	
	@GetMapping("/findOne")
	public String findOne(@RequestParam("idCategoria") @Nullable Integer idCategoria
			             ,@RequestParam("opcion") @Nullable Integer opcion
			             , Model model
			) {
	
		if(idCategoria !=null) {
			Categoria categoria = categoriaDAO.findOne(idCategoria);
			model.addAttribute("Categoria", categoria);
		}
		
		if(opcion == 1) return "add-categorias"; //actualizacion
		else return "del-categorias";            //eliminacion
	}
	
	@PostMapping("/add")
	public String add(@RequestParam("idCategoria")@Nullable Integer idCategoria
			         ,@RequestParam("categoria")   @Nullable int categoria
			         ,@RequestParam("descripcion")   @Nullable int descripcion
			         ,Model model
			) {
		
	//try{
		
		if(idCategoria == null) {
		Categoria categorias= new Categoria();
		 categoriaDAO.add(categorias);
	    } else {
	    	Categoria categoria2  = new Categoria();
	    	categoriaDAO.up(categoria2);
	    }   
	    
	    
		return "redirect:/categorias/findAll";
	//}catch (Exception e) {
	//	//TODO: HANDLE exception
//	}
	}
	
    @GetMapping("/del")
    public String del(@RequestParam("idCategoria") @Nullable Integer idCategoria) {
    	//try{
    
    categoriaDAO.del(idCategoria);
    return "redirect:/categorias/findAll";
    // } catch (Exception e) {
    //  //TODO : handle exception
    // }
    }
    
}
