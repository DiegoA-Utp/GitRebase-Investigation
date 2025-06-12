package com.gitrebase.gitrebasepc1.Models.dao;

import org.springframework.data.repository.CrudRepository;

import com.gitrebase.gitrebasepc1.Models.entities.Categoria;

public interface ICategoriaDao extends CrudRepository<Categoria, Long> {
    
    
}
