package com.jnarvaez.datos.model.service;

import java.util.List;

import com.jnarvaez.datos.model.entidad.Categoria;

public interface ICategoriaService {
    public String guardarCategoria(Categoria categoria);
    public List<Categoria> cargarCategorias();
    public String eliminarCategoria(Long id);

    public List<Categoria> cargarOrdenadas();
    public List<Categoria> cargarLike(String p);
}
