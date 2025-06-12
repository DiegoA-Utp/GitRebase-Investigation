package com.gitrebase.gitrebasepc1.Services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gitrebase.gitrebasepc1.Models.dao.IProductoDao;
import com.gitrebase.gitrebasepc1.Models.entities.Producto;
import com.gitrebase.gitrebasepc1.Services.IProductoService;

import java.util.ArrayList;

@Service

public class ProductoServiceImpl implements IProductoService {

    @Autowired
    private IProductoDao productoDao;


    @Override
    public List<Producto> getAll() {

        List<Producto> productos = new ArrayList<Producto>();
        productoDao.findAll().forEach(productos::add);
        return productos;
    }

    @Override
    public Producto save(Producto producto) {
        return productoDao.save(producto);
    }

    @Override
    public Producto findById(Long id) {
        return productoDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Producto producto) {
        productoDao.delete(producto);

    }

    @Override
    public List<Producto> findByCategoriaId(Long idCategoria) {
        return productoDao.findByCategoriaId(idCategoria);
    }

    @Override
    public List<Producto> findByNombre(String nombre) {
        return productoDao.findByNombre(nombre);
    }

}
