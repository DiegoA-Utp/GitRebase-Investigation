package com.gitrebase.gitrebasepc1.Services.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gitrebase.gitrebasepc1.Models.dao.ICategoriaDao;
import com.gitrebase.gitrebasepc1.Models.entities.Categoria;
import com.gitrebase.gitrebasepc1.Services.ICategoriaService;

import java.util.ArrayList;

@Service
public class CategoriaServiceImpl implements ICategoriaService {

    @Autowired
    private ICategoriaDao categoriaDao;

    @Override
    public List<Categoria> getAll() {
        List<Categoria> categorias = new ArrayList<Categoria>();
        categoriaDao.findAll().forEach(categorias::add);
        return categorias;
    }

    @Override
    public Categoria save(Categoria categoria) {
        return categoriaDao.save(categoria);
    }

    @Override
    public Categoria findById(Long id) {
        return categoriaDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Categoria categoria) {
        categoriaDao.delete(categoria);
    }
    
}
