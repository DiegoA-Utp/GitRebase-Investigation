package com.gitrebase.gitrebasepc1.Models.dao;

import org.springframework.data.repository.CrudRepository;

import com.gitrebase.gitrebasepc1.Models.entities.Producto;

public interface IProductoDao extends CrudRepository<Producto, Long> {
    
}
