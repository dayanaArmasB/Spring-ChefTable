package com.jnarvaez.datos.model.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jnarvaez.datos.model.entidad.Producto;

public interface IProductoDAO extends CrudRepository<Producto,Long> {
    
    public List<Producto> findAllByOrderByNombreAsc();
}
