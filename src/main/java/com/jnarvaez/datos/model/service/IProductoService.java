package com.jnarvaez.datos.model.service;

import java.util.List;

import com.jnarvaez.datos.model.entidad.Producto;

public interface IProductoService {
    public String guardarProducto(Producto producto);
    public List<Producto> cargarProductos();
    public String eliminarProducto(Long id);
}
