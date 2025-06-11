package com.gitrebase.gitrebasepc1.Services;


import java.util.List;

import com.gitrebase.gitrebasepc1.Models.entities.Producto;

public interface IProductoService {
    public List<Producto> getAll();

    public Producto save(Producto producto);

    public Producto findById(Long id);

    public void delete(Producto producto);

}
