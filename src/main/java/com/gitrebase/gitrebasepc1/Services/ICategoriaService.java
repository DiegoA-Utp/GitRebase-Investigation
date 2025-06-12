package com.gitrebase.gitrebasepc1.Services;

import java.util.List;

import com.gitrebase.gitrebasepc1.Models.entities.Categoria;

public interface ICategoriaService {
    public List<Categoria> getAll();

    public Categoria save(Categoria categoria);

    public Categoria findById (Long id);

    public void delete(Categoria categoria);

}
