package com.jnarvaez.datos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jnarvaez.datos.model.entidad.Categoria;
import com.jnarvaez.datos.model.service.ICategoriaService;

@Controller
public class InicioController {

    @Autowired
    private ICategoriaService categoriaService;
    
    @RequestMapping("/")
    public String inicio(Model model){
        Categoria categoria = new Categoria();
        model.addAttribute("categoria", categoria);
        model.addAttribute("listaCategorias", categoriaService.cargarCategorias());
        return "inicio";
    }

    @RequestMapping(value = "/formulario", method = RequestMethod.POST)
    public String guardar(Categoria categoria){
        categoriaService.guardarCategoria(categoria);
        return "redirect:/";
    }

    @RequestMapping("/eliminar/{id}")
    public String eliminar(@PathVariable(value = "id") Long id){
        categoriaService.eliminarCategoria(id);
        return "redirect:/";
    }
}
