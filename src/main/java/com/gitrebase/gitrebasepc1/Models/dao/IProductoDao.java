package com.gitrebase.gitrebasepc1.Models.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.gitrebase.gitrebasepc1.Models.entities.Producto;

public interface IProductoDao extends CrudRepository<Producto, Long> {

    List<Producto> findByCategoriaId(Long idCategoria);
    
    List<Producto> findByNombre(String nombre);
}
